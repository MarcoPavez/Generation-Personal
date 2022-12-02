package ejerciciosGeneral;

import java.io.Console;

/*
 * El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen de 1 a 10 los siguientes 
aspectos: atención, calidad de la comida, precio, ambiente. Escriba un programa que le pida las valoraciones 
anteriores a los cinco clientes y luego imprima en pantalla el promedio obtenido en cada uno de los criterios.
Indicación: use un arreglo de dos dimensiones: las filas representan las calificaciones otorgadas por cada 
cliente, mientras que las columnas representan los distintos criterios de evaluación
 */

public class CalificadorRestaurant {
    public static void main(String[] args) {
        
        Console console = System.console();

        
        int cantidadClientes = Integer.parseInt(console.readLine("Ingrese la cantidad de clientes a entrevistar: "));
        Float [][] valoracionClientes = new Float [cantidadClientes][4];
        
            for(int i = 0; i < valoracionClientes.length; i ++){

                String nombreCliente = console.readLine("Ingrese nombre del cliente: ");

                for(int j = 0; j < valoracionClientes[i].length; j++){

                    valoracionClientes[i][j]=Float.parseFloat(console.readLine("En una escala del 1 al 10, ¿cómo calificaría la atención brindada en el restaurante?: "));
                    valoracionClientes[i][j+1]=Float.parseFloat(console.readLine("En una escala del 1 al 10, ¿cómo calificaría la calidad de la comida del restaurante?: "));
                    valoracionClientes[i][j+2]=Float.parseFloat(console.readLine("En una escala del 1 al 10, ¿cómo calificaría los precios del restaurante?: "));
                    valoracionClientes[i][j+3]=Float.parseFloat(console.readLine("En una escala del 1 al 10, ¿cómo calificaría el ambiente del restaurante?: "));
                    j+=4;
                }
            }

            
            float [] recopilaPromedios = new float [4];
            for(int k = 0; k < valoracionClientes[k].length; k ++){
                for(int l = 0; l < valoracionClientes.length; l ++){
                    float promedioCriterio = 0;
                    promedioCriterio+=valoracionClientes[l][k];
                    promedioCriterio+=valoracionClientes[l+1][k];
                    promedioCriterio+=valoracionClientes[l+2][k];
                    promedioCriterio+=valoracionClientes[l+3][k];
                    promedioCriterio+=valoracionClientes[l+4][k];
                    promedioCriterio = promedioCriterio/5;
                    recopilaPromedios[k]=promedioCriterio;
                    l+=4;
                }
                
            }

            System.out.println("El promedio obtenido en el criterio de la atención brindada en el restaurante es de "+recopilaPromedios[0]);
            System.out.println("El promedio obtenido en el criterio de la calidad de la comida del restaurante es de "+recopilaPromedios[1]);
            System.out.println("El promedio obtenido en el criterio de los precios del restaurante es de "+recopilaPromedios[2]);
            System.out.println("El promedio obtenido en el criterio del ambiente del restaurante es de "+recopilaPromedios[3]);
    }
}
