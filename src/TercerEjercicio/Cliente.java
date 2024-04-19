package TercerEjercicio;

public class Cliente {
    // atributos
    /*
     * Desarrolar una aplicacion para realizar el registro de de clientes.
     * Los datos que se almacenar son codigos ,nombres,apellidos,dni,genero,correo,y
     * celular
     * Para este metodo utiliza el metodo QuickShort
     * 
     */

    private int codigo;
    private String nombres;
    private int dni;
    private char genero;
    private String correo;
    private int celular;

    public Cliente(int codigo, String nombres, int dni, char genero, String correo, int celular) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.dni = dni;
        this.genero = genero;
        this.correo = correo;
        this.celular = celular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String mostrarDatos() {
        return "Cliente [codigo=" + codigo + ", nombres=" + nombres + ", dni=" + dni + ", genero=" + genero
                + ", correo=" + correo + ", celular=" + celular + "]";
    }

}
