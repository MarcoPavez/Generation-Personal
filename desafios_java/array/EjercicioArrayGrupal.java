import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioArrayGrupal {
    public static void main(String [] args){
        Console console = System.console();
    
        ArrayList <Double> resultadoTransformacionMarte = new ArrayList <Double>(Arrays.asList());
        ArrayList <Double> resultadoTransformacionLuna = new ArrayList <Double>(Arrays.asList());
        int veces = Integer.parseInt(console.readLine("Ingrese las veces que desea calcular su peso: "));

        while(veces!=0){

            int opcion = Integer.parseInt(console.readLine("Ingrese 1 : si desea covertir el peso en marte \n O Ingrese 2 : si desea covertir el peso en la luna \n"));

            if(opcion == 1){
                int peso1 = Integer.parseInt(console.readLine("Ingrese su peso: ")); 
                Double marte = (peso1 / 9.81 ) * 3.711 ; 
                System.out.println("El peso ingresado en Marte sería de: "+ marte); 
                resultadoTransformacionMarte.add(marte);
               }else if(opcion == 2){
                int peso2 = Integer.parseInt(console.readLine("Ingrese su peso: "));
                Double Luna =  peso2  /  9.81 * 1.622 ;             
                System.out.println("El peso ingresado en La luna sería de: "+ Luna);  
                resultadoTransformacionLuna.add(Luna);
               }else{
                System.out.println("solo puede ingresar 1 o 2");
               }
               
               veces--;
    
        }

        System.out.println(resultadoTransformacionLuna);
        System.out.println(resultadoTransformacionMarte);
        
    }
    
         
    
}

        

    

