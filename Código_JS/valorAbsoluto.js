//valor absoluto
//declaramos prompt para poder ocuparlo ya que este se ocupa en desarollo web 
const prompt = require('prompt-sync')();

// pedimos un numero al usuario que soporta numeros decimales 
const numero = parseFloat(prompt("Ingresa un número ->"));
// hacemos una variable que almacenara el numero absoluto donde con la funcion Math.abs el numero que le pasemos 
// nos dara el valor absoluto
const valorAbsoluto = Math.abs(numero);

// Al final imprimimos el valor absoluto 
console.log("El valor absoluto es -> " + valorAbsoluto);

