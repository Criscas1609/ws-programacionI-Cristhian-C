package co.edu.cue.proyecto;

public class Producto {
/*    La empresa dispone de 3 objetos diferentes, de los cuales se conoce su
    código, nombre, unidades disponibles, estado (disponible, no disponible),
    precio de alquiler. El estado del objeto depende de si hay o no unidades
    disponibles para prestar.*/
    private String nombre;
    private double codeg;
    private int unid;
    private boolean disponibilidad;
    private double precio;
    private int vecesPrestamo;

    private int cantidadPrestamo;
    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setUnid(int unid) {
        this.unid = unid;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCodeg() {
        return codeg;
    }

    public int getUnid(){
        return unid;
    }

    public int getVecesPrestamo() {
        return vecesPrestamo;
    }

    public void setVecesPrestamo(int vecesPrestamo) {
        this.vecesPrestamo = vecesPrestamo;
    }

    public boolean getDisponibilidad(){
        return disponibilidad;
    }

    public double getPrecio(){
        return precio;
    }

    public Producto(String nombre, double codeg, int unid, boolean disponibilidad, double precio, int vecesPrestamo,int cantidadPrestamo){
        this.nombre=nombre;
        this.codeg=codeg;
        this.unid=unid;
        this.disponibilidad=disponibilidad;
        this.precio=precio;
        this.vecesPrestamo=vecesPrestamo;
        this.cantidadPrestamo=cantidadPrestamo;
    }

    public void setProducto(String nombre, double codeg, int unid, boolean disponibilidad, double precio, int vecesPrestamo,int cantidadPrestamo){
        this.nombre=nombre;
        this.codeg=codeg;
        this.unid=unid;
        this.disponibilidad=disponibilidad;
        this.precio=precio;
        this.vecesPrestamo=vecesPrestamo;
        this.cantidadPrestamo=cantidadPrestamo;
    }
}
