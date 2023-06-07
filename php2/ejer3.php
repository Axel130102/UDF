<?php
echo "Ingrese un número: ";
$numero = (float) readline();

if ($numero > 0) {
    echo "$numero es un número positivo." . PHP_EOL;
} elseif ($numero < 0) {
    echo "$numero es un número negativo." . PHP_EOL;
} else {
    echo "El número ingresado es neutro (cero)." . PHP_EOL;
}
?>
