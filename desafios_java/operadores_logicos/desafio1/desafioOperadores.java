/*
Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa devuelva una nota basada en las siguientes condiciones:
Suspendió si obtuvo una nota igual o inferior a 3.
Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
Excelente si consiguió un 10
Debe avisar si se ingresa un número fuera del rango (0 a 10)

*/

import java.io.Console;

public class desafioOperadores {
    public static void main (String [] args){
        Console console = System.console();
        int inputNota = Integer.parseInt(console.readLine("Ingrese nota del estudiante :"));
        if(inputNota >= 0 && inputNota<=3){
            System.out.println("El estudiante suspendió el ramo");
        }else if(inputNota>3 && inputNota<=5){
            System.out.println("El estudiante tiene un desempeño deficiente en el ramo");
        }else if(inputNota>5 && inputNota <= 8){
            System.out.println("El estudiante obtuvo un desempeño bueno en el ramo");
        }else if(inputNota>8 && inputNota <=10){
            System.out.println("El estudiante tiene un desempeño excelente en el ramo");
        }else{
            System.out.println("Nota ingresada inválida");
        }        
    }
}

