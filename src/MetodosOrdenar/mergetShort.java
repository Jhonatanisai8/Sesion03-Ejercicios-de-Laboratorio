package MetodosOrdenar;

import PrimerEjercicio.Alumno;
import TercerEjercicio.Producto;

public class mergetShort {

    public void ordenarProd(Producto[] arreglo) {
        arreglo = mergetProduct(arreglo, 0, arreglo.length - 1);
    }

    public Producto[] mergetProduct(Producto[] arreglo, int izq, int der) {
        int mitad;
        if (der > izq) {
            mitad = (der + izq) / 2;
            mergetProduct(arreglo, izq, mitad);
            mergetProduct(arreglo, mitad + 1, der);
            mergetShort(arreglo, izq, mitad + 1, der);
        }
        return arreglo;
    }

    private void mergetShort(Producto vector[], int izq, int mitad, int der) {
        Producto aux[] = new Producto[vector.length];
        // int contador = 0;
        int i = izq; // indice de la parte isquierda
        int j = mitad; // indice de la parte derecha
        int k = izq; // indice del vector resultande

        while ((i <= mitad - 1) && (j <= der)) {
            // mientras que i este en la parte isq y j en la derecha
            if (vector[i].getPrecio() <= vector[j].getPrecio()) {
                aux[k++] = vector[i++];
            } else {
                aux[k++] = vector[j++];
            }
        }

        // copia los dema elementos que estaban en la posicion correcta
        while (i <= mitad - 1) {
            aux[k++] = vector[i++];
        }
        while (j <= der) {
            aux[k++] = vector[j++];
        }

        // copia los elementos en el vector original
        for (i = izq; i <= der; i++) {
            vector[i] = aux[i];
        }
    }
}
