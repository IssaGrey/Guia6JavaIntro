package EjercicioGuia6;
import java.util.Scanner;
public class Ejercicio19 {

        public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);
            int[][] matrix= new int [3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese un valor para llenar la matriz ");
                    matrix[i][j]= leer.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" "+matrix[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println(" MATRIX TRASPUESTA");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print("  "+matrix[j][i]+"  ");// IMPRIME MATRIZ TRASPUESTA
                }
                System.out.println(" ");
            }
            boolean bandera= true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j]-1 != matrix[j][i] ) { // (matrix[i][j]*1 ---- ES LO MISMO QUE DECIR MULTIPLIQUE *-1 !=

                        System.out.println("La matriz No es antiSimetrica");
                        bandera=false;
                        break;
                    }

                }
            }
            if (bandera==true) {
                System.out.println("La matriz es antiSimetrica");
            }

        }
}
