//Determinar si un numero entero es positivo, negativo o neutro 
// pedimos que el usuario ingrese un numero 
//declaramos prompt para poder ocuparlo ya que este se ocupa en desarollo web 
const prompt = require('prompt-sync')();

const numero = parseInt(prompt("Ingresa un número -> "));

//si el numero es mayor a 0 es positivo si no sigue la siguiente opcion 
if (numero > 0) {
  console.log("El número es positivo.");
}
//si el numero es menor que 0 es negativo, si no sigue la siguiente opcion 
else if (numero < 0) {
  console.log("El número es negativo.");
}
//si el numero es no es ninguno de las anteriores osea que sea mayor o menor que 0 por ende solo queda el 0 asi que es neutro 
else {
  console.log("El número es neutro");
}
