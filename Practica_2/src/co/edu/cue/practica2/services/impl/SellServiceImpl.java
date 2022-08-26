package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Sell;

import javax.swing.*;
import java.util.Arrays;

public class VentaService {
    public void  comprar(Empleado[] empleados, Cliente[] clientes, Juguete[] juguete, Detalle[] detalle,
                         int contador,String nombreUsuario,String nombreVendedor,String nombreJuguete, int canti,
                         int diasSolicitado, int unidadesPrestadas){
    int contador=0;

                        for(int i=0;i<canti;i++){
                            System.out.println("quinto");
                            for ( Juguete toy : juguete) {
                                System.out.println("sexto");
                                if(toy !=null && nombreJuguete != "null" && toy.getNombre().equals(nombreJuguete)){
                                    System.out.println("septimo");
                                    Detalle detalle1 = new Detalle(unidadesPrestadas,toy, toy.getPrecio(), diasSolicitado);
                                    detalle[contador]=detalle1;
                                    System.out.println(detalle.length);
                                    contador++;
                                }
                            }
                        }
                        Venta venta = new Venta(detalle,nombreUsuario,nombreVendedor,juguete);
                        ventas[contadorVenta]=venta;
                        imprimir(ventas);

        return null;
    }

    public Venta imprimir(Venta[] ventas) {
        for(Venta venta: ventas) {

            JOptionPane.showMessageDialog(null, "Nombre del cliente es: " +
                    venta.getCliente() + "\n" +
                    "El nombre del empleado: " + venta.getEmpleado() + "\n" +
                    "El nombre del juguete: " + venta.getJuguete() + "\n" +
                    "cantidad del juguete: " + Arrays.toString(venta.getDetalle())
            );
            if("Plastico".equals(venta.getJuguete())){
                JOptionPane.showMessageDialog(null, "Los juguetes de plastico no requieren cuidados especiales");
            }
            if ("Tela".equals(venta.getJuguete())) {
                JOptionPane.showMessageDialog(null, "Los juguetes de tela no deben ser mojados");
            }
            if ("Electronico".equals(venta.getJuguete())){
                JOptionPane.showMessageDialog(null, "Los juguetes electronicos no deben ser mojados y requieren baterias");
            }
        }
        return null;
    }
}

/*for (Detalle detalles : detalle) {
            if (String.valueOf(detalles) != "null" && String.valueOf(detalles) != "") {
                JOptionPane.showMessageDialog(null, "Nombre del cliente es: " +
                        ventas.getCliente() + "\n" +
                        "El nombre del empleado: " + ventas.getEmpleado(). + "\n" +
                        "El nombre del juguete: " + ventas.getJuguete() + "\n" +
                        "cantidad del juguete: "
                );
                for (Venta venta : juguetes) {
                    if (String.valueOf(juguetes) != "null") {
                        if ("Plastico".equals(juguetes.getMaterial())) {
                            JOptionPane.showMessageDialog(null, "Los juguetes de plastico no requieren cuidados especiales");
                        }
                        if ("Tela".equals(juguetes.getMaterial())) {
                            JOptionPane.showMessageDialog(null, "Los juguetes de tela no deben ser mojados");
                        }
                        if ("Electronico".equals(juguetes.getMaterial())) {
                            JOptionPane.showMessageDialog(null, "Los juguetes electronicos no deben ser mojados y requieren baterias");
                        }
                    }
                }
            }
        }*/


