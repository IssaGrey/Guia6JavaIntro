/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas.
1. Crear un programa que permita introducir un cuadrado por teclado
 y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9   */

package EjercicioGuia6;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido esto es SUDOKU");
        int n = 0;
        do {
            System.out.println("Ingrese el tamaño del sudoku");
            n = leer.nextInt();
        } while (n < 1 || n > 9);
        int[][] matriz = new int[n][n];
        llenarMatriz(matriz, n);
        mostrarMatriz ( matriz, n);
        sumaMatriz ( matriz, n);
    }
    //LLENAR MATRIZ
        public static void llenarMatriz (int [][] matriz, int n ) {
            Scanner leer = new Scanner(System.in);
            int num;

            System.out.println(" LOS DATOS PARA LLENAR LA MATRIZ DEBEN ESTAR ENTRE 0 Y 9 ");
         for (int i = 0; i < n; i++){
             for (int j = 0; j < n; j++){
                 System.out.println("Ingrese numero para la posición "+ i +" - "+ j );
                 num = leer.nextInt();

                 if (num >= 1 && num <= 9){
                     matriz [i][j] = num;
                 } else {
                     while (num < 1 || num >9){
                         System.out.println("Ingrese numero VALIDO para la posición "+ i +" - "+ j);
                         num = leer.nextInt();
                     }
                 }
             }
         }
        } //llave que cierra el procedimiento llenarMatriz
    //MOTRAR MATRIZ
    public static void mostrarMatriz ( int[][] matriz,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }// cierra procedimiento mostrarMatriz
    public static void sumaMatriz (int[][] matriz, int n){
       boolean magia= false;
       int []columna = new int[n];
       int []filas = new int[n];
       int acuFila=0, acuColum=0, acuD1=0, acuD2=0, cont=0 ;// SUMAS

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             /*  if (i==j){
                   acuD1 += matriz[i][j];
               } else if (i+j == n-1) {
                   acuD2 += matriz[i][j];
               }*/

               acuFila+= matriz[i][j];
               acuColum+= matriz[j][i];
            }
            filas[i] = acuFila;
            acuFila = 0;
            columna[i] = acuColum;
            acuColum = 0;
            System.out.println(filas[i] + "suma fila" + "suma columnas " + columna[i] );

        }
        for (int i = 0; i < n; i++) {
           acuD1+=matriz[i][i];
        }
        for (int i =n; i >= 0;  i--) {
            acuD2+= matriz[i][i] ;
            cont ++;
            System.out.println( acuD1+ " diagonal 2 "+ acuD2);
        }
    }
    }

