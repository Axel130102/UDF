// imprimir los 100 primeros numeros pares y los 100 primeros numeros impares  

/*Imprimir los primeros 100 números pares
i que vale 0 se le suma de 2 en 2 en cada iteración para asi darnos solo números pares.
donde primero se declara i, despues le damos el rango que es hasta 200 y la instruccion es que se le sumara 
de 2 y no termina el ciclo hasta que se llegue a 200*/
console.log("Numeros pares");
for (let i = 0; i <= 200; i += 2) {
    console.log(i);
  }

/*Imprimir los primeros 100 números impares
i que vale 0 se le suma de 2 en 2 en cada iteracion la diferencia es que ahora i tiene un valor de 1 para que nos de numeros impares
donde primero se declara i que vale 1, despues el rango de 200 para que nos de los primeros 100 y la instruccion que suma*/
console.log("Numeros impares");
for (let i = 1; i <= 199; i += 2) {
    console.log(i);
  }
  