/*
 * A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.
 */


package desafio3;
import java.io.Console;

public class DesafioPeliculas {
    public static void main (String [] args){
        Console console = System.console();

        int precioTicket = 7000;

        System.out.println("----------------------");
        System.out.println("Bienvenido a IntelliJ");
        System.out.println("----------------------");

        int edadUsuario = Integer.parseInt(console.readLine("Por favor, ingrese su edad: "));

            if(edadUsuario < 0 || edadUsuario > 115){
                System.out.println("La edad ingresada no es válida. Por favor ingresa un número entre el 0 y el 115");
            }  
            
            else if(edadUsuario >=0 && edadUsuario < 5){
                System.out.println("El precio de su ticket es de "+(precioTicket*0.4));
            } 
            
            else if(edadUsuario>60 && edadUsuario <=115){
                System.out.println("El precio de su ticket es de "+(precioTicket*0.45));
            } 
            
            else {
                System.out.println("El precio de su ticket es de "+precioTicket);
            }
            
        }
 
    }

        
