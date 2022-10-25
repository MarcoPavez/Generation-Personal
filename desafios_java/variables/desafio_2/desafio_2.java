/*
 * Desafio 2
Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
Imprime los resultados de las dos operaciones en la consola.
 */
import java.io.Console;

 public class desafio_2{
    public static void main(String [] args){
        Console console = System.console();
        int radio;
        String input = console.readLine("ingrese el diámetro del círculo (cm): ");
        int inputInt = Integer.parseInt(input);
        double inputInt2 = (double)inputInt;
        int radioCirculo = inputInt/2;
        double perimetroCirculo = (Math.PI*Math.PI)*radioCirculo;
        double areaCirculo = Math.PI*(radioCirculo*radioCirculo);
        System.out.println("El perímetro del círculo es "+perimetroCirculo+" cm");
        System.out.println("El área del círculo es "+areaCirculo+" cm");
    }
}


// Perimetro = 2PI * radio
// Area=  PI * radio2
//Double perimetro = Double.parseDouble(diametro)/2