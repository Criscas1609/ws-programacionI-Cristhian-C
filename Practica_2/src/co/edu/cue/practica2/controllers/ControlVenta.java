package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.model.Detalle;
import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.services.Toy;
import co.edu.cue.practica2.services.impl.VentaService;

import javax.swing.*;

public class ControlVenta {
    VentaService ventaService = new VentaService();
    public void realizarCompra(Empleado[] empleados, Cliente[] clientes, Juguete[] juguete, Detalle[] detalle){
        int contador =0;
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre");
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre de quien atendio");
        int canti = Integer.parseInt(JOptionPane.showInputDialog("Cuantos juguetes va a prestar"));
        int diasSolicitado = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea solicitar el producto"));
        int unidadesPrestadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades desea comprar"));
        String nombreJuguete = JOptionPane.showInputDialog("Ingrese el juguete para verificar exixtencia");
        ventaService.comprar(empleados, clientes, juguete,detalle, contador, nombreUsuario, nombreVendedor, nombreJuguete, canti, diasSolicitado, unidadesPrestadas);
    }
}
