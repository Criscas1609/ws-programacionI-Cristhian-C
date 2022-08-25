package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.services.Usuario;

public class UsuarioServiceImpl implements Usuario {
    @Override
    public  Cliente crearCliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email){
        return new Cliente(nombre,cedula,telefono,direccion,cumpleaños,email);

    }
    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario){
       return new Empleado(nombre, cedula, telefono, direccion, experiencia, salario);
    }

}
