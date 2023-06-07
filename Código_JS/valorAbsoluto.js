//valor absoluto
const prompt = require('prompt-sync')();
const numero = parseFloat(prompt("Ingresa un número ->"));
const valorAbsoluto = Math.abs(numero);

console.log("El valor absoluto es -> " + valorAbsoluto);

