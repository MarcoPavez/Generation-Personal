package ejerciciosGeneral;

import java.util.*;

public class IdentificaIndices {

    /*EJERCICIO 2 
     * Escriba una función que reciba un arreglo de números enteros y un número N, e
     * imprima en pantalla
     * todos los índices del arreglo donde aparece el valorN.Por ejemplo, si el
     * arreglo es [1, 2, 3, 100, 23, 2, 2, 1]
     * y da el valor 2, entonces la función debe imprimir los números 1, 5 y 6.*/
    static int RetornaIndice(int ingresoArreglo[], int valorAleatorio) {

        int largoArray = ingresoArreglo.length;
        int i = 0;

        while (i < largoArray) {
            if (ingresoArreglo[i] == valorAleatorio) {
                return i;
            } else {
                i = i + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        //Console console = System.console();
        Random rd = new Random();

        int[] arregloIndice = new int[10];

        for (int i = 0; i < arregloIndice.length; i++) {

            arregloIndice[i] = rd.nextInt();
            System.out.println(arregloIndice[i]);

        }

        int valorN = 0;

        for (int j = 0; j < arregloIndice.length; j++) {

            if (valorN < arregloIndice[j]) {
                valorN = arregloIndice[j];

            }
        }

        System.out.println(valorN);

        System.out.println("el valor 'repetido' se encuentra en el índice número " + RetornaIndice(arregloIndice, valorN));

    }

}