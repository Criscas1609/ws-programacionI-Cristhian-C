package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;

import javax.swing.*;

public class VentaService {
    public void  comprar(Empleado[] empleados, Cliente[] clientes, Juguete[] juguete, Detalle[] detalle,
                         int contador,String nombreUsuario,String nombreVendedor,String nombreJuguete, int canti,
                         int diasSolicitado, int unidadesPrestadas){

        for(Empleado empleado: empleados){
            //System.out.println("primero yes");
            if(String.valueOf(empleado)!= "null" ){
                System.out.println("segundo yes");
                for(Cliente cliente: clientes){
                    System.out.println("tercero yes");
                    if(cliente!= null && nombreUsuario != "null" && cliente.getNombre().equals(nombreUsuario)){
                        System.out.println("cuarto");
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
                        Venta venta = new Venta(detalle,cliente,empleado,juguete);
                        for (Detalle details: detalle){
                            if (String.valueOf(detalle)!="null"){
                                JOptionPane.showMessageDialog(null,"Nombre del cliente es: "+
                                        cliente+"\n"+
                                        "El nombre del empleado: "+empleado+"\n"+
                                        "El nombre del juguete: "+nombreJuguete+"\n"+
                                        "cantidad del juguete: "+canti

                                );
                                if(String.valueOf(juguete)!="null"){
                                    if ("Plastico".equals(nombreJuguete)) {
                                        JOptionPane.showMessageDialog(null, "Los juguetes de plastico no requieren cuidados especiales");
                                    }
                                    if ("Tela".equals(equals(nombreJuguete))) {
                                        JOptionPane.showMessageDialog(null, "Los juguetes de tela no deben ser mojados");
                                    }
                                    if ("Electronico".equals(equals(nombreJuguete))) {
                                        JOptionPane.showMessageDialog(null, "Los juguetes electronicos no deben ser mojados y requieren baterias");

                                    }
                                }}
                        }
                    }
                }
            }
        }
    }
}
