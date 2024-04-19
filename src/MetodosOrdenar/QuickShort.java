
package MetodosOrdenar;

import TercerEjercicio.Cliente;

public class QuickShort {

    public void ordenarCLientes(Cliente[] vector) {
        vector = quickShortClientes(vector);
    }

    public Cliente[] quickShortClientes(Cliente vector[]) {
        return quickShortClien(vector, 0, vector.length - 1);
    }

    public Cliente[] quickShortClien(Cliente[] vector, int izq, int der) {

        if (izq >= der) {
            return vector;
        }

        int i, j;
        i = izq;
        j = der;

        if (izq != der) {
            int pivote;
            Cliente auxCliente;
            pivote = izq;

            while (izq != der) {
                while (vector[der].getCelular() >= vector[pivote].getCelular() && izq < der) {
                    der--;
                }

                while (vector[izq].getCelular() < vector[pivote].getCelular() && izq < der) {
                    izq--;
                }

                if (der != izq) {
                    auxCliente = vector[der];
                    vector[der] = vector[izq];
                    vector[izq] = auxCliente;
                }
            }

            if (izq == der) {
                quickShortClien(vector, i, izq - 1);
                quickShortClien(vector, izq + 1, j);
            }

        } else {
            return vector;
        }

        return vector;
    }

}