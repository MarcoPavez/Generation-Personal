import java.io.Console;

//INICIO

public class ResumenClases_Java {
    public static void main(String[] args) {
        Console console = System.console();

        // PARA SOLICITAR INFORMACIÓN AL USUARIO

        String ingresoUsuario = console.readLine("Ingrese una frase: ");

        // PARA MOSTRAR INFORMACIÓN INGRESADA

        System.out.println(ingresoUsuario);

        // CONVERSIONES
        // PARA CAMBIAR DE STRING A INT.....

        String num = console.readLine("inserte número: ");
        // ...... DEBE CREARSE UNA NUEVA VARIABLE
        int nuevoNum = Integer.parseInt(num);
        System.out.println("el número es: " + nuevoNum);

        /*
         * ParseDouble()-> pasar desde String a Double
         * ParseInt()->pasar desde String a Int
         * double altura = 1.5;
         * int alt = (int) altura;
         */

        int numero = Integer.parseInt(console.readLine("Ingresa el número 1: "));
        String numero2 = console.readLine("Ingresa el número 2: ");
        int numeroInt2 = Integer.parseInt(numero2);

        if (numero > numeroInt2) {
            System.out.println("el primer número es mayor");
        } else {
            System.out.println("el segundo número es mayor");
        }

        /*EJERCICIO PRÁCTICO
         * Calculadora de comisiones
         * el usuario deberá ingresar el valor de sus ventas(+)
         * segun el valor de las ventas se calcula cierto porcentaje de comisión(+)
         * ventas > 10000 -> 30%(+)
         * 5001 > ventas < 9999 -> 20%(+)
         * 1001 > ventas < 4999 -> 10%(+)
         * venats < 1000 -> no hay comisión(+)*/

        System.out.println("------ Bienvenidx a la calculadora de comisiones, usuarix ------");
        int valorVentasIngresadas = Integer
                .parseInt(console.readLine("Para comenzar, por favor ingresa el valor de sus ventas: "));
        if (valorVentasIngresadas >= 10000) {
            System.out.println("A esta venta le corresponde una comisión de " + (valorVentasIngresadas * 0.3)
                    + ", por lo que deberá pagar un total de " + (valorVentasIngresadas * 0.3 + valorVentasIngresadas));
        } else if (valorVentasIngresadas >= 5000 && valorVentasIngresadas <= 9999) {
            System.out.println("A esta venta le corresponde una comisión de " + (valorVentasIngresadas * 0.2)
                    + ", por lo que deberá pagar un total de " + (valorVentasIngresadas * 0.2 + valorVentasIngresadas));
        } else if (valorVentasIngresadas > 1001 && valorVentasIngresadas < 5000) {
            System.out.println("A esta venta le corresponde una comisión de " + (valorVentasIngresadas * 0.1)
                    + ", por lo que deberá pagar un total de " + (valorVentasIngresadas * 0.2 + valorVentasIngresadas));
        } else {
            System.out.println("Usted no debe pagar comisiones");
        }
    }
}
