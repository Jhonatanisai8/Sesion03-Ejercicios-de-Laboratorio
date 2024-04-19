package MetodosOrdenar;
import TercerEjercicio.Producto;

public class mergetShort {

    public void ordenarProd(Producto[] arreglo){
        arreglo = mergetProduct(arreglo, 0, arreglo.length-1);
    }

    public Producto[] mergetProduct(Producto[] arreglo, int izq, int der) {
        int mitad;
        if (der > izq) {
            mitad = (der + izq) / 2;
            mergetProduct(arreglo, izq, mitad);
            mergetProduct(arreglo, mitad + 1, der);
            mergetShort(arreglo, izq, mitad+1, der);
        }
        return arreglo;
    }

    private void mergetShort(Producto[] array, int izq, int mitad, int der) {
        Producto aux[] = new Producto[array.length];

        int i = izq;
        int j = mitad;
        int k = izq;

        while ((i <= mitad - 1) && (j <= der)) {
            if (array[i].getPrecio() <= array[j].getPrecio()) {
                aux[k++] = aux[i++];
            } else {
                aux[k++] = aux[j++];
            }
        }

        // copia los demas elementos que estaban en la posicion correcta
        while (i <= mitad - 1) {
            aux[k++] = array[i++];
        }
        while (j <= der) {
            aux[k++] = array[j++];
        }

        // copia los elementos en el vector original
        for (i = izq; i <= der; i++) {
            array[i] = aux[i];
        }
    }
}
