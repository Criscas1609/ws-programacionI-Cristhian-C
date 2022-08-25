package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class ControlEmpleado {
    UsuarioServiceImpl service = new UsuarioServiceImpl();
    public void crearEmpleadoN(Empleado[] empleados,int posicion){
        String cedula = JOptionPane.showInputDialog("Ingrese su numero de cedula");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String telefono = JOptionPane.showInputDialog("Ingrese su numero de telefono");
        String direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        String experiencia = JOptionPane.showInputDialog("Ingrese cuantos años lleva en la empresa");
        String salario = JOptionPane.showInputDialog("Ingrese el valor de su sueldo");

        empleados[posicion] = service.crearEmpleado(nombre,cedula,telefono,direccion,experiencia,salario);
        System.out.printf(empleados[posicion].getNombre());
    }



}
