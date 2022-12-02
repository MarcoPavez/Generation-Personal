import java.io.Console;

/*
 * Desafio 1:
Cree una clase titulada "Perfil de usuario"
crear funcion main
Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
Utilice la edad para calcular el año en que nació un usuario.
Imprima los valores en la consola de un usuario.


 */

public class PerfilDeUsuario {
    public static void main(String[] args) {
        Console console = System.console();
        String nombreUsuario = console.readLine("inserte nombre: ");
        int edadUsuario = Integer.parseInt(console.readLine("ingrese su edad: "));
        String generoUsuario = console.readLine("ingrese su genero: ");
        String prefLaboralUsuario = console.readLine("ingrese su preferencia laboral: ");
        String nacionalidadUsuario = console.readLine("ingrese su nacionalidad: ");
        String tipoSangreUsuario = console.readLine("ingrese su tipo de sangre: ");
        int anio_actual = 2022;
        int anio_nacimiento_usuario = anio_actual - edadUsuario;
        System.out.println("El año de nacimiento del usuario es " + anio_nacimiento_usuario);
        System.out.println("El usuario 1 es " + nombreUsuario + ", su edad es " + edadUsuario + ", su género es "
                + generoUsuario + ", su preferencia laboral es " + prefLaboralUsuario + ", su nacionalidad es "
                + nacionalidadUsuario + " y su tipo de sangre es " + tipoSangreUsuario);



/*
 * Desafio 2
Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
Imprime los resultados de las dos operaciones en la consola.
 */

        String input = console.readLine("ingrese el diámetro del círculo (cm): ");
        int inputInt = Integer.parseInt(input);
        int radioCirculo = inputInt/2;
        double perimetroCirculo = (Math.PI*Math.PI)*radioCirculo;
        double areaCirculo = Math.PI*(radioCirculo*radioCirculo);
        System.out.println("El perímetro del círculo es "+perimetroCirculo+" cm");
        System.out.println("El área del círculo es "+areaCirculo+" cm");
    
// Perimetro = 2PI * radio
// Area=  PI * radio2
//Double perimetro = Double.parseDouble(diametro)/2


    }

}
