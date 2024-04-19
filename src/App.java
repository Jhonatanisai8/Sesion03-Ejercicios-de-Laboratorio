import MetodosOrdenar.mergetShort;
import PrimerEjercicio.Alumno;
import PrimerEjercicio.Merget;
import PrimerEjercicio.Quick;
import TercerEjercicio.Producto;

public class App {
    /*
     * Ejercicio:
     * Desarrola una aplicacion para realizar los alumnos.
     * Los datos a almacenar son DNI,NOMBRES,EDAD,PROMEDIO.
     * Utilizar para este ejercicio ordenamiento recursivo QUICKSHORT
     */
    public static void main(String[] args) throws Exception {

        // ejemploMetodoMergetShort();
        // ejemploMetodoQuickShort();
        ejemploMergetShortProductos();
    }

    public static void ejemploMergetShortProductos() {
        Producto ejemplo[] = new Producto[10];

        ejemplo[0] = new Producto(1, "Producto de aseo", 50, 50, 4.5);
        ejemplo[1] = new Producto(2, "Producto de aseo", 30, 50, 10.4);
        ejemplo[2] = new Producto(3, "Producto de Cocina", 30, 50, 12.0);
        ejemplo[3] = new Producto(4, "Producto de Tecnologia", 45, 50, 11.0);
        ejemplo[4] = new Producto(5, "Producto de aseo", 60, 50, 35.0);
        ejemplo[5] = new Producto(6, "Producto de Tecnologia", 35, 50, 4.6);
        ejemplo[6] = new Producto(7, "Producto de Cocina", 50, 50, 10.5);
        ejemplo[7] = new Producto(8, "Producto de aseo", 40, 50, 34.8);
        ejemplo[8] = new Producto(9, "Producto de aseo", 30, 50, 4.90);
        ejemplo[9] = new Producto(10, "Producto de aseo", 20, 50, 4.12);

        System.out.println("PRODUCTOS SIN ORDENAR");
        mostrarProductos(ejemplo);
        mergetShort obj = new mergetShort();
        System.out.println("PRODUCTOS ORDENADOS");
        obj.ordenarProd(ejemplo);
        mostrarProductos(ejemplo);

    }

    public static void ejemploMetodoMergetShort() {
        // ingresamos elementos al arreglo del alumnos
        Alumno[] array = new Alumno[4]; // de tres posiciones
        // asiganamos valores
        array[0] = new Alumno("41742587", "Juan Perez", 21, 14);
        array[1] = new Alumno("10587458", "Diego Liviano", 27, 11);
        array[2] = new Alumno("52962858", "Vania Salcedo", 17, 12);
        array[3] = new Alumno("23457689", "Jonas", 9, 18);
        System.out.println("Datos Antes del ordenamiento");
        mostrar(array);

        // llamamos al metodo de mergetShort
        Merget obj = new Merget();
        obj.ordenarMegertShort(array);
        System.out.println("Datos  del arreglo ordenados");
        mostrar(array);
    }

    public static void ejemploMetodoQuickShort() {
        // ingresamos elementos al arreglo del alumnos
        Alumno[] array = new Alumno[4]; // de tres posiciones
        // asiganamos valores
        array[0] = new Alumno("41742587", "Juan Perez", 21, 14);
        array[1] = new Alumno("10587458", "Diego Liviano", 27, 11);
        array[2] = new Alumno("52962858", "Vania Salcedo", 17, 12);
        array[3] = new Alumno("23457689", "Jonas", 9, 18);

        System.out.println("Datos Antes del ordenamiento");
        mostrar(array);

        // creamos un obejto de la clase quickShort y llamamos al metodo
        Quick obj = new Quick();
        obj.ordenar(array);
        System.out.println("Datos despues del Ordenamiento: ");
        mostrar(array);
    }

    public static void mostrar(Alumno[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.println(i + " " + arreglo[i].mostrarDatos());
        }
        System.out.println();
    }

    public static void mostrarProductos(Producto[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.println(i + " " + arreglo[i].mostrarDatos());
        }
        System.out.println();
    }
}
