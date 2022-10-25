/*
 * Cree una clase que se llame conversorPeso cree un menú en donde se le pida al usuario ingresar:
1 si desea covertir el peso en marte
2 si desea convertir el peso en luna.
Luego pida al usuario el peso que desea convertir. Realice la busqueda de cuantos kilos en tierra son en marte y en la luna calcule cuanto sería el peso ingresado 
muestre en pantalla el siguente mensaje según la seleccion del usuario:
"El peso ingresado en la luna sería de: ...."
"El peso ingresado en Marte sería de: ...."
 */

package desafio2;
import java.io.Console;

public class DesafioDos {
    public static void main( String[] args) {

        Console console = System.console();

        int eleccion = Integer.parseInt(console.readLine("Ingrese 1: si desea covertir el peso en marte \no ingrese 2: si desea covertir el peso en la luna \n"));
        int peso = Integer.parseInt(console.readLine("Ingrese su peso: "));
        
        switch(eleccion){
            case 1 :
            Double martes = (peso / 9.81 ) * 3.711 ;

            System.out.println("El peso ingresado en Marte sería de: "+ martes);
            break;

            case 2 :
            Double Luna =  peso  /  9.81 * 1.622 ;
            System.out.println("El peso ingresado en la luna sería de: "+ Luna);
            break;

        }        
    }
}

