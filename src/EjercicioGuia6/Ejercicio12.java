/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
1. Las cadenas  tienen que ser de un máximo de 5 caracteres de largo,
2. el primer carácter tiene que  ser  X y el último tiene que ser una O.

        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia  especial “&&&&&” marca el final de los envíos (llamémosla FDE)
        y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. ****

   Al finalizar el proceso, se imprime un informe indicando
   1. cantidad de lecturas correctas e incorrectas recibidas.
         Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().*/

package EjercicioGuia6;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leerPalabra= new Scanner(System.in);

        String frase;
        String FDA= "&&&&&";
       int acuCorrecto=0;
       int acuIncorrect=0, longFrase;

       do {
           System.out.println("Ingrese una frase ");
           frase = leerPalabra.nextLine();
           frase = frase.toUpperCase();
           longFrase = frase.length();
          char ult = frase.charAt(frase.length()-1);       //para sacar el ultimo caracter de la frase

           if (longFrase<= 5 && frase.substring(0,1).equals("X") && ult =='O'){
               acuCorrecto = acuCorrecto+ 1;
           }else {
               acuIncorrect=acuIncorrect+1;
                         }
       }  while (!frase.equals(FDA));

        System.out.println( " cantidad de lecturas correctas " + acuCorrecto);
        System.out.println( " cantidad de lecturas Incorrectas " + acuIncorrect);
    }
}
