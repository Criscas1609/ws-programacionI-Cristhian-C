package co.edu.cue.proyecto;

public class Detalle_Prestamo {
    private Producto producto;
    private int cantidad;

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setDetalles_prestamo(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Detalle_Prestamo(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
}
