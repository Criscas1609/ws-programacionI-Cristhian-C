package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Sell;

import javax.swing.*;
import java.util.Arrays;

public class SellServiceImpl implements Sell {
    private Venta[] ventas = new Venta[4];
    private Detalle[] detalle = new Detalle[4];
    int contadorVenta = 0;

    public SellServiceImpl(Detalle[] detalle, int contadorVenta) {
        this.detalle = detalle;
        this.contadorVenta = contadorVenta;
    }

    public SellServiceImpl() {

    }

    public Venta comprar( Juguete[] juguete, Cliente nombreUsuario, Empleado nombreVendedor, String nombreJuguete, int canti,
                         int diasSolicitado, int unidadesPrestadas){
    int contador=0;

                        for(int i=0;i<canti;i++){
                            System.out.println("hola5");
                            for ( Juguete toy : juguete) {
                                if(String.valueOf(toy)!= "null"&& nombreJuguete != "null" && toy.getNombre().equals(nombreJuguete)){
                                    if(unidadesPrestadas<toy.getCantidad()){
                                        Detalle detalle1 = new Detalle(unidadesPrestadas,toy, diasSolicitado);
                                        detalle[contador]=detalle1;
                                        System.out.println(detalle.length);
                                        contador++;
                                    }else{
                                        JOptionPane.showMessageDialog(null,"No hay disponibles tantas cantidades, disminuye las cantidades");
                                    }
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


