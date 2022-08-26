package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.services.Usuario;

import javax.swing.*;

public class UsuarioServiceImpl implements Usuario {
    @Override
    public  Cliente crearCliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email){
         cliente[contadorCliente]=new Cliente(nombre,cedula,telefono,direccion,cumpleaños,email);
         contadorCliente++;
         return null;

    }
    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario){
       empleados[contadorEmpleado]=new Empleado(nombre, cedula, telefono, direccion, experiencia, salario);
       contadorEmpleado++;
       return null;
    }
    @Override
    public Empleado buscarEmpleado() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del empleado de la venta");
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i].getCedula().equalsIgnoreCase(documento)){
                System.out.println("empleado"+empleados[i]);
                return empleados[i];
            }
        }
        return null;
    }

    @Override
    public Cliente buscarCliente() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del cliente de la venta");
        for (int i = 0; i < cliente.length; i++) {

            if(cliente[i].getCedula().equalsIgnoreCase(documento)){

                return cliente[i];
            }
        }
        return null;
    }


}
