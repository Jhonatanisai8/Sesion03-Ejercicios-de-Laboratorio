package PrimerEjercicio;

public class Alumno {
    //atributos
    private String dni,nombre;
    private int edad;
    private double promedio;

    public Alumno(){

    }

    public Alumno(String dni, String nombre, int edad, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    

    


    

}
