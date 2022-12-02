package ejerciciosGeneral;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

/*En una granja hay un conjunto de N vacas. Escriba un programa que guarde en una matriz de dimensiones 
7 x N la producción de leche generada por cada vaca diariamente, durante una semana. Finalmente, calcule 
la producción total de leche de la granja al cabo de la semana y cuál vaca dio más leche cada día.*/

public class EjercicioVacas {
    public static void main(String[] args) {
        Console console = System.console();

        Integer cantidadVacas = Integer.parseInt(console.readLine("Ingrese la cantidad de vacas en su establo: "));
        Float [][] produccionPorVaca = new Float [7][cantidadVacas];
        String [] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        ArrayList <String> nombreVacas = new ArrayList <String>(Arrays.asList());
        
        for(int i = 0; i < produccionPorVaca[cantidadVacas].length; i ++){

            nombreVacas.add(console.readLine("Ingrese el nombre de su vaca: "));

            for(int j = 0; j < produccionPorVaca.length; j ++){

                int temp = 7;

                while(temp!=0){
                
                produccionPorVaca[j][i] = Float.parseFloat(console.readLine("Ingrese la cantidad de litros producidos por la vaca "+nombreVacas.get(i)+" el día "+diasSemana[j]+": "));
              
                temp-=7;
                }                    
            }

            System.out.println(Arrays.deepToString(produccionPorVaca));

        }

        Float sum = 0f;
    
        for (int i=0; i < produccionPorVaca.length; i++){

            for (int j=0; j < produccionPorVaca[i].length; j++){

                sum += produccionPorVaca [i][j];
            }
        }

        System.out.println("La producción total de leche de la granja durante la semana fue de "+sum+" litros.");

        int filas = produccionPorVaca.length;  
        int columnas = produccionPorVaca[0].length;  
        ArrayList <Float> arrayProduccionLeche = new ArrayList <Float>(Arrays.asList());

        for(int i = 0; i < columnas; i++){  

            Float sumCol = 0f;  

            for(int j = 0; j < filas; j++){  

              sumCol += produccionPorVaca[j][i];  

            }  

            System.out.println("La cantidad de leche producida en la semana por la vaca "+nombreVacas.get(i)+" es igual a " +sumCol);
            arrayProduccionLeche.add(sumCol);
           
        }  
        
        for(int i = 0; i < filas; i ++){
            Float nMax = produccionPorVaca[0][0];
            for (int j = 0; j < columnas; j ++){
                
                if(nMax < produccionPorVaca[i][j]){
                    nMax = produccionPorVaca[i][j];
                }
            }
            
        System.out.println("La mayor cantidad de leche dada por una vaca el día "+diasSemana[i]+" es de: "+nMax);    
        }

       
    }
}
