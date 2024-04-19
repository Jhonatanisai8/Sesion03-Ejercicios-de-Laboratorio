
package PrimerEjercicio;

public class Merget {
    public void ordenarMegertShort(Alumno[] vector) {
        vector = mergetShortAlum(vector, 0, vector.length - 1);
    }

    public Alumno[] mergetShortAlum(Alumno[] array, int izq, int der) {
        int mitad;
        if (der > izq) {
            mitad = (der + izq) / 2;
            mergetShortAlum(array, izq, mitad);
            mergetShortAlum(array, mitad + 1, der);
            merge(array, izq, mitad + 1, der);
        }
        return array;
    }

    private void merge(Alumno vector[], int izq, int mitad, int der) {

        Alumno aux[] = new Alumno[vector.length];
       // int contador = 0;
        int i = izq; // indice de la parte isquierda
        int j = mitad; // indice de la parte derecha
        int k = izq; // indice del vector resultande

        while ((i <= mitad - 1) && (j <= der)) {
            // mientras que i este en la parte isq y j en la derecha
            if (vector[i].getEdad() <= vector[j].getEdad()) {
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
