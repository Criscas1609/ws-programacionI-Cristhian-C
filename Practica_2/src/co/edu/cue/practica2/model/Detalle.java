package co.edu.cue.practica2.model;

public class Detalle {
     private int cantidad;
     private Juguete juguete;
     private double precio;
     private int diasSolicitados;

     public Detalle(int cantidad, Juguete juguete, double precio, int diasSolicitados) {
          this.cantidad = cantidad;
          this.juguete = juguete;
          this.precio = precio;
          this.diasSolicitados = diasSolicitados;
     }

     public Juguete getJuguete() {
          return juguete;
     }

     public void setJuguete(Juguete juguete) {
          this.juguete = juguete;
     }

     public int getCantidad() {
          return cantidad;
     }

     public void setCantidad(int cantidad) {
          this.cantidad = cantidad;
     }


     public double getPrecio() {
          return precio;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public int getDiasSolicitados() {
          return diasSolicitados;
     }

     public void setDiasSolicitados(int diasSolicitados) {
          this.diasSolicitados = diasSolicitados;
     }

}
