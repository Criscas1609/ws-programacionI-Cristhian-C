package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class ControlClientes {
    UsuarioServiceImpl service = new UsuarioServiceImpl();

    public void crearClienteF(Cliente[] cliente,int posicion){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        String cumpleaños = JOptionPane.showInputDialog("Ingrese el cumpleaños");
        String email = JOptionPane.showInputDialog("Ingrese el correo");

        cliente[posicion] = service.crearCliente(nombre,cedula,telefono,direccion,cumpleaños,email);

    }
}
