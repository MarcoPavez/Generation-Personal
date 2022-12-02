/*

Link Repositorio: https://github.com/generation-org/JavaScript/tree/master/1.1.3

On pen and paper, solve the logical exercises and give the expected output statement (true / false):

a) ( true && true ) 
    Verdadero

b) ( false && true ) 
    Falso

( true && false ) 
Falso
( false && false )
Falso
( true || true)     
Verdadero
( true || false )  
Verdadero 
( false || true)   
Verdadero
( false || false )  
Falso
!( false || true )   
Falso
!( false && true )
Verdadero
( !false && true )
Verdadero
( !true && true )
Falso
( !false || false )
Verdadero

*/



/*

 Exercise #1
 Create a function that takes in one number
 and checks if the number is greater than  10. Print out to the console true if it is greater and false otherwise.
 
*/

function mayorQue10(numero) {
    if (numero > 10) {
        console.log('Verdadero');
    } else {
        console.log('Falso');
    }
}
mayorQue10(11)
mayorQue10(10)
mayorQue10(9)


/*

 * Exercise #2
 * Create a function that takes in one number
 * and checks if it is divisible by 4 or divisible by 9. 
 * Print out to the console true if a number
 * if divisible by 4 or 9, and false if a
 * number is not divisible by either number.
 
*/



function divisible(numero) {
    if (numero % 4 == 0 || numero % 9 == 0) {
        console.log('Verdadero');
    } else {
        console.log('Falso');
    }
}

divisible(18)



/*
 * Exercise 1:
 * We want to check if a string is empty.
 * If a string is not empty, we want to print 
 * out the first character of that string.
 * If a string is empty, print out a text saying
 * "This string is empty" 
 */

//Crear función para comprobar si un string está vacío
 function checkEmptyString(str) {
    //"Si la primera posición de la oración está vacía, imprime 'el string está vacío'"
    if(str.charAt(0)==""){
        return("El string está vacío");
    }
    //
    else{
        return(str.charAt(0))
    }
}

// Example test, should return a
console.log(checkEmptyString(""));

//Función para eliminar la primera letra de una oración
function checkEmptyString(str) {
    if(str == ""){
        console.log("Esta vacia");
    }else{

    var primeraLetra= str.charAt(0);
    var restoOracion = str.slice(1,);
    console.log(restoOracion);
    }
}
checkEmptyString("apple");


/**
 * Exercise 2:
 * We want to compare two strings and check if they are the same - case insensitive (===).
 * Return a boolean - true if the two strings are the same, and false if they are not 
 */


function checkTwoStringsSame(x, y) {
    if(x===y){
        console.log(true);
    }else{
        console.log(false);
    }
}

// Example test, should return true
checkTwoStringsSame("string1", "string1");



/**
 * 
 *  Create a function that takes in 2 inputs (using prompt)
 *  and goes through the 5 arithmetic operators (+, -, /, *,
 *  %). The expected output on the console is:
 * `The sum is x` -> x is the calculated sum
 * `The subtraction is y` -> y is the calculated difference
 * `The multiplication is z` -> z is the calculated multiplication
 * `The division is w` -> w is the calculated division
 * `The remainder is q` -> q is the calculated remainder
 */

 function mathematicOperations(num1,num2) {
    let suma_numeros=num1+num2; console.log("La suma es "+suma_numeros);
    let resta_numeros=num1-num2; console.log("La resta es "+resta_numeros);
    let div_numeros=num1/num2; console.log("La división es "+div_numeros);
    let multip_numeros=num1*num2; console.log("la multiplicación es "+multip_numeros);
    let resto_numeros=num1%num2; console.log("el resto es "+resto_numeros)
}

mathematicOperations(1,2);



/*

Write a program where a user enters the number of tasks they have completed. The program returns one of the following labels to the console:
**Failed**
**Insufficient**
**Good**
**Excellent**
**Error**
based on the conditions:

Failed if they scored 6 or less
Insufficient if they scored > 6 but less than 9 (9 included)
Good if they scored > 9 but less than 14 (14 included)
Excellent if they scored 15
Error if participants enter a negative number or a number outside the range supported (outside 0 - 15)

*/
console.log("-------------------------------------")


function calificadorTareas(cantidadPuntos){
    if(cantidadPuntos >= 0 && cantidadPuntos <= 6){
        console.log("Fallaste, inténtalo con mayor motivación");
    }else if(6<cantidadPuntos && cantidadPuntos <= 9){
        console.log("Insuficiente, inténtalo con mayor motivación");
    }else if(9<cantidadPuntos && cantidadPuntos <=14){
        console.log("Lo estás haciendo bien, pero puedes dar más de ti");
    }else if(cantidadPuntos===15){
        console.log("Felicidades, lo estás haciendo excelente");
    }else{
        console.log("Error, ingresaste un número inválido");
    }
}

calificadorTareas(0);



// -------------------------------------------------------------------------------------------------------------------------------------------------------------

//Link repositorio: https://github.com/generation-org/javascript/blob/master/INTRO-CS-4%20-%20Algorithm%20Design%20and%20Problem%20Solving%20-%20Advanced/README.md#practice-exercises

/*

Exercise #1
Write a program that takes in an array of numbers and returns the largest number in the list. Example: The given array is [3, 5, 7, 1, 6] The largest number is 7.

*/


var arrayParaOrdenar = [2345,625,2562,7463524,34552,735,2462,100000000000000];
var numeroMayor = 0;

for(i=0;i<arrayParaOrdenar.length;i++){
    if(numeroMayor<arrayParaOrdenar[i]){
        numeroMayor=arrayParaOrdenar[i];
    }
  
}

console.log(numeroMayor)


/*

Exercise #2
Write a program to sort a list of numbers in descending order (from highest to lowest).

*/

var arrayDescendente = [3410,94629,246929,49696,624,2946,2694920,104469,49,6194]


for(i<0;i<arrayDescendente.length;i++){
    if(arrayDescendente[i]<arrayDescendente[i+1]){
        let arrayOrdenado = arrayDescendente[i];                 
        arrayDescendente[i] = arrayDescendente[i + 1];              
        arrayDescendente[i + 1] = arrayOrdenado;
        i = -1;                                                 // para iterar hasta que for verifique hasta que [i] sea mayor que [i+1]
            } 
        }
   
console.log(arrayDescendente);  



console.log(arrayDescendente.sort(function(a, b){return b - a}));  
    

/*
Exercise #3
Step 1

Write a program that takes in two lists and returns the greatest number out of the two lists. Hint: call the function from Class Exercise #1 (Exercise #1 should return a single number - the greatest number in the list).
*/

var numeroMayorA=0
var numeroMayorB=0

function comparacionArrays(a,b){
    for(i=0;i<a.length;i++){
    if(numeroMayorA<a[i]){
        numeroMayorA=a[i];
}
    }for(i=0;i<b.length;i++){
        if(numeroMayorB<b[i]){
            numeroMayorB=b[i];
    }
}if(numeroMayorA<numeroMayorB){
    console.log("El número más grande de ambos arrays es "+numeroMayorB)
}else if(numeroMayorA>numeroMayorB){
    console.log("El número más grande de ambos arrays es "+numeroMayorA)
}else{
    console.log("Los números mayores de ambas listas son iguales")
}
}

comparacionArrays([13,45,422,62342,642],[1354,2546,134,1235,246])



