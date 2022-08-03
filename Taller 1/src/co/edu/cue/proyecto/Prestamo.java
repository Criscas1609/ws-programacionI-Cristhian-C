package co.edu.cue.proyecto;

public class Prestamo  {
    private double codigo;
    private int diasSolicitados;
    private int diasTranscurridos;
    private Empleado empleado;
    private Cliente cliente;
    private Detalle_Prestamo detallePrestamo1;
    private Detalle_Prestamo detallePrestamo2;

    public double getCodigo() {
        return codigo;
    }

    public int getdiasSolicitados() {
        return diasSolicitados;
    }

    public int getDiasTranscurridos(){
        return diasTranscurridos;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Detalle_Prestamo getDetallePrestamo(){
        return detallePrestamo1;
    }

    public Detalle_Prestamo getDetallePrestamo2() {
        return detallePrestamo2;
    }

    public void setPrestamo(double codigo, int diasSolicitados, int diasTranscurridos, Empleado empleado, Cliente cliente, Detalle_Prestamo detallePrestamo1, Detalle_Prestamo detallePrestamo2){
        this.codigo=codigo;
        this.diasSolicitados=diasSolicitados;
        this.diasTranscurridos=diasTranscurridos;
        this.empleado=empleado;
        this.cliente=cliente;
        this.detallePrestamo1=detallePrestamo1;
        this.detallePrestamo2=detallePrestamo2;
    }

    public Prestamo(double codigo, int diasSolicitados, int diasTranscurridos, Empleado empleado, Cliente cliente, Detalle_Prestamo detallePrestamo1, Detalle_Prestamo detallePrestamo2){
        this.codigo=codigo;
        this.diasSolicitados=diasSolicitados;
        this.diasTranscurridos=diasTranscurridos;
        this.empleado=empleado;
        this.cliente=cliente;
        this.detallePrestamo1=detallePrestamo1;
        this.detallePrestamo2=detallePrestamo2;
    }
}
