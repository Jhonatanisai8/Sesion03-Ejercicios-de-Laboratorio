package PrimerEjercicio;

public class Quick {
    // metodo para ordenar
    public void ordenar(Alumno[] arreglo) {
        arreglo = quickShort1(arreglo);
    }

    public Alumno[] quickShort1(Alumno numeros[]) {
        /* Se entrega el arreglo y posicion isquierda y derecha */
        return quickShort2(numeros, 0, numeros.length - 1);
    }

    public Alumno[] quickShort2(Alumno numeros[], int isq, int der) {

        if (isq >= der) {
            // verifica que no halla cruce entre posiciones
            return numeros;
        }

        int i = isq;
        int d = der;

        if (isq != der) { // realice los cambios
            int pivote;
            Alumno aux;
            pivote = isq; // se asigna la izquierda al pivote
            while (isq != der) {
                while (numeros[der].getEdad() >= numeros[pivote].getEdad() && isq < der) {
                    der--;
                }
                while (numeros[isq].getEdad() < numeros[pivote].getEdad() && isq < der) {
                    isq--;
                }

                if (der != isq) {
                    aux = numeros[der];
                    numeros[der] = numeros[isq];
                    numeros[isq] = aux;
                }
            }

            if (isq == der) {
                quickShort2(numeros, i, isq - 1);
                quickShort2(numeros, isq + 1, d);
            }
        } else {
            return numeros;
        }
        return numeros;
    }
}
