package co.edu.cue.practica2.application;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
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
                            new Object[]{"Agregar Juguete", "Agregar Usuario", "Agregar Empleado", "Salir"}, "null");
                    do{
                    switch (opcionNew){
                        case 0:
                        case 1:
                        case 2:
                    }
                    }while(opcionNew!=3);
                case 1:
                case 2:
                case 3:

            }

            }while (opcion!=4);
    }
}