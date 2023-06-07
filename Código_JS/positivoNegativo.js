//Determinar si un numero entero es positivo, negativo o neutro 

const prompt = require('prompt-sync')();

const numero = parseInt(prompt("Ingresa un número -> "));

if (numero > 0) {
  console.log("El número es positivo.");
}else if (numero < 0) {
  console.log("El número es negativo.");
}else {
  console.log("El número es neutro");
}
