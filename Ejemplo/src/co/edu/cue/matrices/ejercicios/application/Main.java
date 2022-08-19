package co.edu.cue.matrices.ejercicios.application;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[][] matriz;
        int[][] matriz_b;
        int[][] matriz_c;
        int menu =0;
        do {
            menu= Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que desea hacer \n" +
                    "1. Ejercicio 1 \n"+
                    "2. Ejercicio 2 \n"+
                    "3. Ejercicio 3 \n"+
                    "4. Ejercicio 4 \n"+
                    "5. Ejercicio 5 \n"+
                    "6. Ejercicio 6 \n"+
                    "7. Ejercicio 7 \n"+
                    "8. Salir \n"));
            switch (menu){
                case 1:
                    int filas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de filas"));
                    int columnas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de columnas"));
                    matriz =new int[filas][columnas];
                   llenarMatriz(matriz);
                   imprimir(matriz);
                   numeroMayor(matriz);
                    break;
                case 2:
                    matriz =new int[5][5];
                    llenarMatriz(matriz);
                    imprimir(matriz);
                    numeroMayor(matriz);
                    break;
                case 3:
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de filas"));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de columnas"));
                    matriz =new int[fila][columna];
                    llenarMatriz(matriz);
                    imprimir(matriz);
                    sumaPivote(matriz);
                    break;
                case 4:
                    int fila_4 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de filas"));
                    int columna_4 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de columnas"));
                    matriz =new int[columna_4][fila_4];
                    llenarMatriz(matriz);
                    imprimir(matriz);
                    break;
                case 5:
                    break;
                case 6:
                    matriz =new int[5][5];
                    llenarMatriz(matriz);
                    imprimir(matriz);
                    matriz_b= new int[5][5];
                    matriz_c= new int[matriz.length][matriz_b.length];
                    llenarMatriz(matriz_b);
                    System.out.printf("Matriz b \n");
                    imprimir(matriz_b);
                    System.out.printf("Matriz suma \n");
                    sumaMatriz(matriz,matriz_b,matriz_c);
                    imprimir(matriz_c);
                    break;
                case 7:
                    break;
            }
        }while (menu!=8);

    }
    static int[][] llenarMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]= (int) (Math.random()*((10-1)+1)+1);
            }
        }
        return matriz;
    }
    static void numeroMayor(int[][] matriz){
        int contador =0;
        int columnna=0;
        int fila=0;
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if(contador<matriz[i][j]){
                    contador=matriz[i][j];
                    columnna=i;
                    fila=j;
                }
            }
        }
        System.out.println("El numero mayor de la matriz es "+contador+" Y su posición es: "+columnna+fila);
    }
    static void imprimir(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.printf(" ");
    }
    static void sumaPivote(int[][] matriz){
        int suma=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (i==j) {
                    suma = suma + matriz[i][j];
                }
            }
        }
        System.out.printf("La suma de la diagonal es: "+suma);
    }
    static int[][] sumaMatriz(int[][] matriz,int[][] matriz_b,int[][] matriz_c) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz_c[i][j] = matriz[i][j];
            }
        }
        for (int k = 0; k < matriz_b.length; k++) {
            for (int l = 0; l < matriz_b[k].length; l++) {
                matriz_c[k][l] = matriz_c[k][l] + matriz_b[k][l];
            }
        }
        return matriz;
    }
}