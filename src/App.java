import PrimerEjercicio.Alumno;
import PrimerEjercicio.Merget;
import PrimerEjercicio.Quick;

public class App {
    /*
     * Ejercicio:
     * Desarrola una aplicacion para realizar los alumnos.
     * Los datos a almacenar son DNI,NOMBRES,EDAD,PROMEDIO.
     * Utilizar para este ejercicio ordenamiento recursivo QUICKSHORT
     */
    public static void main(String[] args) throws Exception {
        
        //ejemploMetodoMergetShort();
        ejemploMetodoQuickShort();
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
}
