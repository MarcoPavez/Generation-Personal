package bucles;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

// vamos a pedirle al usuario la cantidad de alumnos que va a ingresar 
// pedir por cada alumno el nombre y que ingrese 3 notas por alumno (guardar en arrayList)
// estos valores se van aguardar en un hashMap en donde la llave será el nombre del alumno y el valor será el arreglo con sus 3 notas

public class LibroVirtual {
    public static void main(String[] args) {
        Console console = System.console();

        HashMap<String, ArrayList> libroVirtual = new HashMap<String, ArrayList>();

        DecimalFormat df = new DecimalFormat("#0.0");

        System.out.println(" --------------------------------------------------\n ");
        System.out.println(" ------------ Bienvenido a AyudaProfes ------------\n ");
        System.out.println(" --------------------------------------------------\n ");

        int cantidadAlumnos = Integer
                .parseInt(console.readLine("Por favor, ingrese el número de estudiantes a tratar: "));

        while (cantidadAlumnos != 0) {

            ArrayList<Float> notasAlumno = new ArrayList<Float>();
            String nombreAlumno = console.readLine("Por favor, ingrese el nombre del alumno: ");

            for (int i = 1; i <= 3; i++) {
                Float nota = Float.parseFloat(console.readLine("Por favor, ingrese la nota " + i + " del estudiante: "));

                while (nota < 1 || nota > 7) {
                    nota = Float.parseFloat(console.readLine("Nota incorrecta. Por favor ingresa nuevamente la nota "
                            + i + " del estudiante en un rango del 1 al 7: "));
                }

                notasAlumno.add(nota);

            }

            libroVirtual.put(nombreAlumno, notasAlumno);
            cantidadAlumnos--;
        }

        System.out.println(libroVirtual);

        for (String i : libroVirtual.keySet()) {
            float suma = 0.0f;
            for (Object x : libroVirtual.get(i)) {
                suma = (Float) x + suma;
            }
            System.out.println("El promedio de " + i + " fue de " + df.format(suma / 3));
        }

    }
}
