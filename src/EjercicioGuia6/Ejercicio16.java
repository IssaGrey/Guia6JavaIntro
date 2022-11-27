/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios
le pida al  usuario un numero a buscar en el vector.
El programa mostrará donde se encuentra el numero y si se encuentra repetido*/


package EjercicioGuia6;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vector");

        int tam = leer.nextInt();

        int vector[]  = new int[tam];
        //LLENAR VECTOR
        for (int i=0 ; i<tam; i++) {
            vector[i] = (int) (Math.random()*tam);  //aleatorios del 0 al 10
        }
        System.out.println("ingrese el numero a buscar");
        int num1 = leer.nextInt();
        int cont=0;

        //MOSTRAR VECTOR
        for (int i=0 ; i<tam; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.print(" ");
        //SI NUM ESTA EN EL VECTOY Y CUANTAS VECES ESTA
        for (int i=0; i<tam; i++){
            if (num1 == vector[i]) {
                System.out.println("el numero esta en la pos " +i);
                cont ++; //contador
            }
        }
             System.out.println("el mumero esta " + cont + " veces ");
    }
}


