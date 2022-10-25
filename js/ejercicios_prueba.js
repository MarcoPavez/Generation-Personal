

//  1. Obtén del 1 al 255: Escribe un programa que devuelve un array con todos los números del 1 al 255.
    
arrayNumeros=[]

for(i=0;i<256;i++){
    arrayNumeros[i] = i;
}

console.log(arrayNumeros)

//2. Consigue pares hasta 1000: Escribe un programa que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio. 

UnoAlMil=[]

for(i=0;i<1001;i++){
    UnoAlMil[i] = i;
}


var numerosPares = [];

UnoAlMil.forEach(Number => {
    if(Number % 2 === 0){
        numerosPares.push(Number);
    }
}
)

console.log(numerosPares.reduce((a,b)=>a+b))



//    3. Suma impares hasta 5000: Escribe un programa que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).
    
UnoAlCincoMil=[]

for(i=0;i<5001;i++){
    UnoAlCincoMil[i] = i;
}



var numerosImpares = [];

UnoAlCincoMil.forEach(Number => {
    if(Number % 2 !== 0){
        numerosImpares.push(Number);
    }
    });
    

console.log(numerosImpares.reduce((a,b)=>a+b))

  
//    4. Itera un array: Escribe un programa que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14).  

function sumaArrays (arrayIngresado){
    console.log(arrayIngresado.reduce((a,b)=>a+b))
}

sumaArrays([2365,245,2,6,253,4,2131])


  //  5. Encuentra el mayor (max): Dado un array con múltiples valores, escribe un programa que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 
    

var arrayParaOrdenar = [2345,625,2562,7463524,34552,735,2462,100000000000000];
var numeroMayor = 0;

for(i=0;i<arrayParaOrdenar.length;i++){
    if(numeroMayor<arrayParaOrdenar[i]){
        numeroMayor=arrayParaOrdenar[i];
    }
  
}

console.log(numeroMayor)

  //  6. Encuentra el promedio (avg): Dado un array con múltiples valores, escribe un programa que devuelva el promedio de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).
  
var valoresAVG=[125,413,62,563,457,4568,4578,56]
var sumValoresAVG=[]
var promedioValoresAVG

function promedioValores(arrayIngresado2){
    sumValoresAVG = arrayIngresado2.reduce((a,b)=>(a+b));
    promedioValoresAVG = sumValoresAVG/arrayIngresado2.length;
    console.log(promedioValoresAVG)
}

promedioValores(valoresAVG)

      /*
    7. Array de impares: Escribe un programa que devuelva un array de todos los números impares entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.
    */