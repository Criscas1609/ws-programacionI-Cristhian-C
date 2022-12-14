package co.edu.cue.practica2.model;

public class Venta {

   private Detalle[] detalle = new Detalle[5];
   private Cliente cliente;
   private Empleado empleado;
   private Object juguete;

   public Venta(Detalle[] detalle, Cliente cliente, Empleado empleado, Object juguete) {
      this.detalle = detalle;
      this.cliente = cliente;
      this.empleado = empleado;
      this.juguete = juguete;
   }

   public Detalle[] getDetalle() {
      return detalle;
   }

   public void setDetalle(Detalle[] detalle) {
      this.detalle = detalle;
   }

   public Object getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public Object getEmpleado() {
      return empleado;
   }

   public void setEmpleado(Empleado empleado) {
      this.empleado = empleado;
   }

   public Object getJuguete() {
      return juguete;
   }

   public void setJuguete(Object juguete) {
      this.juguete = juguete;
   }
}
