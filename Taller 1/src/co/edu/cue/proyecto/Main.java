package co.edu.cue.proyecto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            int menu;
            Cliente[] lista= new Cliente[5];
            Lista arreglo= new Lista();
            Cliente cliente1= new Cliente("Jhoan",9514,"Cedula","Masculino","Armenia");
            Cliente cliente2= new Cliente("Sofia",1044,"Pasaporte","Femenino","Armenia");
            Empleado empleado1=new Empleado(1044,"Christian","corjuela1030@cue.edu.co",1);
            Empleado empleado2=new Empleado(1860,"Andrés","atoro1025@cue.edu.co",1);
            Empleado empleado3=new Empleado(1740,"Cristhian","ccorrea1068@cue.edu.co",1);
            Producto producto1=new Producto();
            producto1.setProducto("Computador",1235,10,true,100000);
            Producto producto2=new Producto();
            producto2.setProducto("Celular",981,10,true,50000);
            Producto producto3=new Producto();
            producto3.setProducto("Tablet",8521,10,true,70000);


        do {
                menu = JOptionPane.showOptionDialog(
                        null,"Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                        new Object[] { "Mirar los clientes que existen", "Mirar los empleados que existen", "Administrar productos", "Administrar prestamos","Salir" },"null");
                //Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que quiere hacer: " + "\n" +
                        /*"1. Mirar los clientes que existen" + "\n" +
                        "2. Mirar los empleados que existen" + "\n" +
                        "3. Administrar productos" + "\n" +
                        "4. Administrar prestamos" + "\n" +
                        "5. Salir" + "\n"
                        */
                switch (menu){
                    case 1:



                        break;
                    case 2:

                    case 3:
                        int submenu;
                        do {
                            submenu =
                                    JOptionPane.showOptionDialog(
                                            null,"Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                            new Object[] { "Consultar los datos de un objeto dado su código", "Consultar dado el nombre del objeto la cantidad de préstamos", "Consultar la cantidad total de unidades prestadas", " Reemplazar un objeto por otro","Salir"},"null");

                            switch (submenu){
                                case 1:
                                        ConsultarDatosdadoCodigo();
                                    break;
                                case 2:
                                        ConsultarDadoElNombredelObjeto();
                                    break;
                                case 3:
                                        ConsultarLaCantidadTotalUnidades();
                                    break;
                                case 4:
                                       ReemplazarUnObjetoPorOtro();
                                    break;
                            }
                        }while (submenu !=5);
                        break;
                    case 4:

                        break;
                }
            } while (menu != 5);

    }


    public void  ConsultarDatosdadoCodigo(){



    }


    public void ConsultarDadoElNombredelObjeto(){



    }



    public void ConsultarLaCantidadTotalUnidades(){




    }



    public void ReemplazarUnObjetoPorOtro(){




    }
}