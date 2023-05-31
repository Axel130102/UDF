//Determinar si un numero es par o impar

// Se le pide al usuario que ingrese un numero

//declaramos prompt para poder ocuparlo ya que este se ocupa en desarollo web 
const prompt = require('prompt-sync')();

const numero = parseInt(prompt("Ingresa un número ->"));

// Si el numero que ingresamos al dividrilo entre 2 y no tiene sobrante es para y entra en el if 
if (numero % 2 === 0) {
  console.log("El número es par.");
}
//si no entra en el else y es impar  
else { 
  console.log("El número es impar.");
}

