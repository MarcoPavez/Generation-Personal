/*
 * Desafio 1:
Cree una clase titulada "Perfil de usuario"
crear funcion main
Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
Utilice la edad para calcular el año en que nació un usuario.
Imprima los valores en la consola de un usuario.


 */

import java.io.Console;

public class PerfilDeUsuario {
    public static void main (String [] args){
        Console console = System.console();
        String nombreUsuario = console.readLine("inserte nombre: ");
        String edadUsuario = console.readLine("ingrese su edad: ");
        String generoUsuario = console.readLine("ingrese su genero: ");
        String prefLaboralUsuario = console.readLine("ingrese su preferencia laboral: ");
        String nacionalidadUsuario = console.readLine("ingrese su nacionalidad: ");
        String tipoSangreUsuario = console.readLine("ingrese su tipo de sangre: ");
        int nuevoEdadUsuario = Integer.parseInt(edadUsuario);
        int anio_actual=2022;
        int anio_nacimiento_usuario = anio_actual - nuevoEdadUsuario;
        System.out.println("El año de nacimiento del usuario es "+anio_nacimiento_usuario);
        System.out.println("El usuario 1 es "+nombreUsuario+", su edad es "+edadUsuario+", su género es "+generoUsuario+", su preferencia laboral es "+prefLaboralUsuario+", su nacionalidad es "+nacionalidadUsuario+" y su tipo de sangre es "+tipoSangreUsuario);
    }

}
