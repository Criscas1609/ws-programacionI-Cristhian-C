package co.edu.cue.practica2.application;

import co.edu.cue.practica2.controllers.ControlClientes;
import co.edu.cue.practica2.controllers.ControlJuguete;
import co.edu.cue.practica2.controllers.ControlEmpleado;
import co.edu.cue.practica2.controllers.ControlVenta;
import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Toy;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        final ControlClientes controlCliente = new ControlClientes();
        final ControlJuguete controlJuguete = new ControlJuguete();
        final ControlVenta controlVenta = new ControlVenta();
        final ControlEmpleado controlUser = new ControlEmpleado();
        //final ToyServiceImpl serviceToy = new ToyServiceImpl();
        //final UsuarioServiceImpl serviceUsuario = new UsuarioServiceImpl();

        //Venta venta= new Venta(detalle,cliente,empleado,juguete);
        int opcion;
        do{
            opcion = JOptionPane.showOptionDialog(
                    null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[]{"Agregar nuevo", "Comprar juguetes ", "Editar existencias","Obtener Informes","Salir"}, "null");
            switch(opcion){
                case 0:
                    int opcionNew;
                    opcionNew = JOptionPane.showOptionDialog(
                            null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Agregar Juguete", "Agregar Cliente", "Agregar Empleado", "Salir"}, "null");
                    switch (opcionNew){
                        case 0:
                            controlJuguete.crearJuguetes(toys,contadorJuguete);
                            contadorJuguete++;
                            break;
                        case 1:
                            controlCliente.crearClienteF(cliente,contadorCliente);
                            contadorCliente++;
                            break;
                        case 2:
                            controlUser.crearEmpleadoN(empleados,contadorEmpleado);
                            contadorEmpleado++;
                            break;
                    }break;


                case 1:
                    controlVenta.realizarCompra(empleados,cliente,toys,detalle);
                    break;
                case 2:
                    int opcionExist=0;
                        opcionExist = JOptionPane.showOptionDialog(
                                null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                new Object[]{"Aumentar Juguetes", "Salir"}, "null");
                        switch (opcionExist){
                            case 0:
                                controlJuguete.modificarExistencias(toys);
                                break;
                        }
                    break;
                case 3:
                    int opcionInf =0;
                        opcionInf = JOptionPane.showOptionDialog(
                                null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                new Object[]{"Juguetes por tipo", "Cantidad total", "Valor total","Cantidad mayor por tipo","Cantidad menor por tipo","Mayor valor","Salir"}, "null");
                        switch (opcionInf){
                            case 0:
                                serviceToy.juguetesPorTipo(toys);
                                break;
                            case 1:
                                serviceToy.informeCantidad(toys);
                                break;
                            case 2:
                                serviceToy.informeValorTotal(toys);
                                break;
                            case 3:
                                serviceToy.informeTipoJuguete(toys);
                                break;
                            case 4:
                                serviceToy.informeTipoJugueteMenor(toys);
                                break;
                            case 5:
                                controlJuguete.informeFiltroUsuario(toys);
                                break;
                        }
                    break;
            }
            }while (opcion!=6);
    }
}