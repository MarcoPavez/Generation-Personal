package ejerciciosGeneral;

import java.util.Arrays;

/*EJERCICIO 1
* Escriba una función tal que, dados dos arreglos de números enteros ya
* ordenados de menor a mayor,
* genere un nuevo arreglo correspondiente a la lista ordenada de la mezcla de
* ambos. Por ejemplo,
* si se reciben los arreglos [1, 3, 6, 9, 17] y [2, 4, 10, 17], entonces la
* función debe devolver [1, 2, 3, 4, 6, 9, 10, 17, 17]. */

public class ArreglaArrays {

    static int[] UnificadorArrays(int a[], int b[]) {

        // Unificar 2 arrays en java

        int aLargo = a.length;
        int bLargo = b.length;
        int cLargo = aLargo + bLargo;
        int[] nuevoArray = new int[cLargo];

        for (int i = 0; i < aLargo; i++) {
            nuevoArray[i] = a[i];
        }

        for (int i = 0; i < bLargo; i++) {

            nuevoArray[aLargo + i] = b[i];

        }

        int temp = 0;

        for (int i = 0; i < nuevoArray.length; i++) {
            for (int j = i + 1; j < nuevoArray.length; j++) {
                if (nuevoArray[i] > nuevoArray[j]) {
                    temp = nuevoArray[i];
                    nuevoArray[i] = nuevoArray[j];
                    nuevoArray[j] = temp;
                }
            }
        }

        int [] arrayFinal = new int [cLargo];

        for (int i = 0; i < cLargo; i = i + 1) {

            arrayFinal[i] = nuevoArray [i];
        }
        return arrayFinal;

    }

    public static void main(String[] args) {

        int[] arrayPrimero = new int[] { 1234, 2345, 3456, 4567, 5678 };
        int[] arraySegundo = new int[] { 2, 6789, 7890 };

        Object arrayOriginal = Arrays.toString(UnificadorArrays(arrayPrimero, arraySegundo));
        System.out.println(arrayOriginal);

    }
}
