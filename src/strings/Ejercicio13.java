/* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package strings;

import java.util.Scanner;

// TODAS LAS CLASES DEBEN INICIAR CON MAYUS 
public class Ejercicio13 {

    public static void main(String[] args) {
        String[] misNombres = new String[]{"samuel","Anwar"};
        pintarParametros(misNombres) ;
        String[] nombresTerminal = recogerParametrosDelTerminal();
        pintarParametros(nombresTerminal) ;
        nombresTerminal = recogerParametrosDelTerminal();
        pintarParametros(nombresTerminal) ;
    }
    public static String[] recogerParametrosDelTerminal(){
        Scanner leerDatos= new Scanner(System.in);
        System.out.println("INGRESE CANTIDAD DE COMPAÑEROS DE EQUIPO");
        int numPax = leerDatos.nextInt();
        String todosLosNombres[]= new String [numPax];
        String nombre;
        for (int x = 0; x < todosLosNombres.length ; x++) {
            System.out.println( "Ingrese nombre: ");
            nombre = leerDatos.next();
            todosLosNombres[x] = nombre;
        }
        return todosLosNombres;
    }
     public static void pintarParametros(String[] parametros){
         for (int i = 0; i < parametros.length; i++) {

             System.out.println("[ "+ parametros[i]+ " ]");
         }

     }
}
