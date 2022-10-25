
//Ejercicio #1: crea una función que tenga un número y comprueba si el número es mayor que 10. Imprime en la consola verdadero si es mayor y de lo contrario falso.





function numero_ej1(a){
    if(a>10){
        return("verdadero");
    }
    else{
        return("falso");
    } 
}

console.log(numero_ej1(20))


//Ejercicio #2: Crea una función que tome un número y comprueba si es divisible entre 4 o divisible entre 9. Imprime en la consola verdadero si un número es divisible entre 4 o 9, 
//y falso si un número no es divisible entre ninguno de los dos números.


function numero_ej2(numero_x){
   if(numero_x%4 === 0 || numero_x%9 === 0){
    return("verdadero");
}
else{
    return("falso");
}
}

console.log(numero_ej2(19))


//biotina pantux

/*Ejercicio #3 Crea un script que pida al usuario el diámetro de una rueda y su grosor (en metros) y a través de condicionales if realice las siguientes operaciones:

a) Si el diámetro es superior a 1.4 debe mostrarse el mensaje “La rueda es para un vehículo grande”. Si es menor o igual a 1.4 pero mayor que 0.8 debe mostrarse el mensaje “La rueda es para un vehículo mediano”. Si no se cumplen ninguna de las condiciones anteriores debe mostrarse por pantalla el mensaje “La rueda es para un vehículo pequeño”.

b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el diámetro es menor o igual a 1.4 pero mayor que 0.8, con un grosor inferior a 0.25, deberá mostrarse el mensaje “El grosor para esta rueda es inferior al recomendado”

Ejecuta el código y comprueba sus resultados. Para comprobar si es correcta tu solución puedes consultar en los foros aprenderaprogramar.com.*/
