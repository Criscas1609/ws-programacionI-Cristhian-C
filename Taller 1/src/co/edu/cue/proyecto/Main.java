package co.edu.cue.proyecto;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
            int menu;
            int menuPrestamos;
            int menuProductos;
            Cliente[] listaCliente= new Cliente[2];
            Empleado[] listaEmpleado=new Empleado[3];
            Producto[] listaProducto=new Producto[3];
            Cliente cliente1= new Cliente("Jhoan",9514,"Cedula","Masculino","Armenia");
            listaCliente[0]=cliente1;
            Cliente cliente2= new Cliente("Sofia",1044,"Pasaporte","Femenino","Armenia");
            listaCliente[1]=cliente2;
            Empleado empleado1=new Empleado(1044,"Christian","corjuela1030@cue.edu.co",1);
            listaEmpleado[0]=empleado1;
            Empleado empleado2=new Empleado(1860,"Andrés","atoro1025@cue.edu.co",1);
            listaEmpleado[1]=empleado2;
            Empleado empleado3=new Empleado(1740,"Cristhian","ccorrea1068@cue.edu.co",1);
            listaEmpleado[2]=empleado3;
            Producto producto1=new Producto("Computador",1235,10,true,100000,0,0);
            listaProducto[0]=producto1;
            Producto producto2=new Producto("Celular",981,10,true,50000,0,0);
            listaProducto[1]=producto2;
            Producto producto3=new Producto("Tablet",8521,10,true,70000,0,0);
            listaProducto[2]=producto3;

        do {
                menu = JOptionPane.showOptionDialog(
                        null,"Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                        new Object[] { "Administrar prestamos","Administrar productos", "Visualizar clientes", "Visualizar empleados","Salir" },"null");
                //Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que quiere hacer: " + "\n" +
                        /*"0.Administrar prestamos" + "\n" +
                        "1. Administrar productos" + "\n" +
                        "2. Visualizar clientes" + "\n" +
                        "3. Visualizar empleados" + "\n" +
                        "4. Salir" + "\n"
                        */
                switch (menu){
                    /*--------case0 Menu prestamos----------------------------------------------------------------------------------------------------------------------*/

                    case 0:
                        do {
                            menuPrestamos=JOptionPane.showOptionDialog(
                                    null,"Ingrese lo que quiere hacer: ", "Opciones de prestamos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                    new Object[] { "Crear prestamo","Consultar datos de prestamo","Salir" },"null");
                            switch (menuPrestamos){
                                case 0:

                                    break;
                                case 1:

                                    break;
                                default:

                                    break;
                            }
                        }while (menuPrestamos!=2);
                        break;


                    /*--------case1 menu productos----------------------------------------------------------------------------------------------------------------------*/

                    case 1:
                        do {
                            menuProductos=JOptionPane.showOptionDialog(
                                    null,"Ingrese lo que quiere hacer: ", "Opciones de productos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                    new Object[] { "Consultar producto por codigo","Consultar prestamos por nombre", "Consultar cantidad total de unidades prestadas", "Remplazar objeto","Salir" },"null");
                            switch (menuProductos){
                                case 0:
                                    double codigo;
                                    consultarCodigo(listaProducto,codigo=Double.parseDouble(JOptionPane.showInputDialog("ingrese el codigo del producto")));
                                    break;
                                case 1:
                                    String nombre;
                                    consultarPrestamos(listaProducto,nombre=JOptionPane.showInputDialog("Digite el nombre del producto"));
                                    break;
                                case 2:
                                    double code;
                                    consultarUnidadesPrestadas(listaProducto,code=Double.parseDouble(JOptionPane.showInputDialog("ingrese el codigo del producto")));
                                    break;
                                case 3:
                                    remplazarObjeto(listaProducto);
                                    break;
                                default:

                                    break;
                            }

                        }while (menuProductos!=4);
                        break;
                        /*--------case2 Impresion clientes----------------------------------------------------------------------------------------------------------------------*/
                    case 2:
                        String message="";
                        for (int x=0;x<2;x++){
                            message+="Cliente "+(x+1)+"."+"    Nombre: "+ listaCliente[x].getNombre() + "    Identificacion: " + listaCliente[x].getIdentificacion() + "    Tipo de documento: "+ listaCliente[x].getTipoDocumento()+"    Genero: "+listaCliente[x].getGenero()+"    Ciudad: "+listaCliente[x].getCiudad()+"\n";
                        }
                        JOptionPane.showMessageDialog(null,message);
                        break;
                    /*--------case3 Impresion empleados----------------------------------------------------------------------------------------------------------------------*/
                    case 3:
                        String Emessage="";
                        for (int x=0;x<3;x++){
                            Emessage+="Empleado "+(x+1)+"."+"    Nombre: "+ listaEmpleado[x].getNombre()+ "    Codigo: " + listaEmpleado[x].getCodigo() + "    Correo: "+ listaEmpleado[x].getCorreo()+"    Años de antiguedad: "+listaEmpleado[x].getAñosDeAntiguedad()+"\n";
                        }
                        JOptionPane.showMessageDialog(null,Emessage);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Muchas gracias por usarme :)");
                        break;
                }
            } while (menu != 4);


    }

    //Funciones productos __________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
    static void consultarCodigo(Producto listaProducto[],double codigo){
        boolean confirm=false;
        for (int x=0;x<3;x++){
            if (listaProducto[x].getCodeg()==codigo){
                confirm=true;
                JOptionPane.showMessageDialog(null,"El producto "+(x+1)+" es: "+listaProducto[x].getNombre()+"  Codigo: "+listaProducto[x].getCodeg()+ "  Unidades: "+listaProducto[x].getUnid()+"  Disponibilidad: "+listaProducto[x].getDisponibilidad()+"   Precio: "+listaProducto[x].getPrecio()+"  Veces de prestamo: "+ listaProducto[x].getVecesPrestamo()+"  Unidades prestadas: "+listaProducto[x].getCantidadPrestamo());
                break;
            }
        }
        if (confirm==false){
            JOptionPane.showMessageDialog(null,"El codigo no coincide con ninguno de los productos");
        }
    }

    static void consultarPrestamos(Producto listaProducto[],String nombre){
        boolean confirm=false;
        for (int x=0;x<3;x++){
            if (listaProducto[x].getNombre().equalsIgnoreCase(nombre)){
                confirm=true;
                JOptionPane.showMessageDialog(null,"  Veces de prestamo: "+ listaProducto[x].getVecesPrestamo());
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El nombre no coincide con ninguno de los productos");
        }
    }

    static void consultarUnidadesPrestadas(Producto listaProducto[],double codigo){
        boolean confirm=false;
        for (int x=0;x<3;x++){
            if (listaProducto[x].getCodeg()==codigo){
                confirm=true;
                JOptionPane.showMessageDialog(null,"  Unidades prestadas: "+listaProducto[x].getCantidadPrestamo());
                break;
            }
        }
        if (confirm==false){
            JOptionPane.showMessageDialog(null,"El codigo no coincide con ninguno de los productos");
        }
    }

    static void remplazarObjeto(Producto listaProducto[]){
        String message="";
        for(int x=0;x<3;x++){
            message+="El producto "+(x+1)+" es: "+listaProducto[x].getNombre()+"  Codigo: "+listaProducto[x].getCodeg()+ "  Unidades: "+listaProducto[x].getUnid()+"  Disponibilidad: "+listaProducto[x].getDisponibilidad()+"   Precio: "+listaProducto[x].getPrecio()+"  Veces de prestamo: "+ listaProducto[x].getVecesPrestamo()+"  Unidades prestadas: "+listaProducto[x].getCantidadPrestamo()+"\n"+"\n";
        }
        int option=JOptionPane.showOptionDialog(
                null,"Ingrese el producto que quiere remplazar "+"\n"+message, "Opciones de productos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] {  "Producto 1","Producto 2","Producto 3" },"null");
        switch (option){
            case 0:
                listaProducto[option].setProducto(JOptionPane.showInputDialog("Digite el nombre del nuevo producto"),Double.parseDouble(JOptionPane.showInputDialog("Digite el codigo del nuevo producto")),Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de unidades del producto")),Boolean.parseBoolean(JOptionPane.showInputDialog("Digite la disponibilidad del producto (true or false)")),Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del nuevo producto")),0,0);
                break;
            case 1:
                listaProducto[option].setProducto(JOptionPane.showInputDialog("Digite el nombre del nuevo producto"),Double.parseDouble(JOptionPane.showInputDialog("Digite el codigo del nuevo producto")),Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de unidades del producto")),Boolean.parseBoolean(JOptionPane.showInputDialog("Digite la disponibilidad del producto (true or false)")),Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del nuevo producto")),0,0);
                break;
            case 2:
                listaProducto[option].setProducto(JOptionPane.showInputDialog("Digite el nombre del nuevo producto"),Double.parseDouble(JOptionPane.showInputDialog("Digite el codigo del nuevo producto")),Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de unidades del producto")),Boolean.parseBoolean(JOptionPane.showInputDialog("Digite la disponibilidad del producto (true or false)")),Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del nuevo producto")),0,0);
                break;
        }
        JOptionPane.showMessageDialog(null,"El producto se guardo como: \n"+"Producto "+(option+1)+": "+listaProducto[option].getNombre()+"   Codigo: "+listaProducto[option].getCodeg()+"   Unidades: "+listaProducto[option].getUnid()+"  Disponibilidad: "+listaProducto[option].getDisponibilidad()+"   Precio: "+listaProducto[option].getPrecio()+"   Veces en prestamo: "+listaProducto[option].getVecesPrestamo()+"  Unidades en prestamo: "+listaProducto[option].getCantidadPrestamo());
    }


}