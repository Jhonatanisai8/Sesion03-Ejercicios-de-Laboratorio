package TercerEjercicio;

public class Producto {
    //atributos
    private int codigo;
    private String descripcion;
    private int stock;
    private int stockMinino;
    private double precio;

    
    public Producto(int codigo, String descripcion, int stock, int stockMinino, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.stockMinino = stockMinino;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStockMinino() {
        return stockMinino;
    }
    public void setStockMinino(int stockMinino) {
        this.stockMinino = stockMinino;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
