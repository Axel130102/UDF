<?php
echo "Ingrese un número: ";
$numero = (int) readline();

if ($numero % 2 === 0) {
    echo "$numero es un número par." . PHP_EOL;
} else {
    echo "$numero es un número impar." . PHP_EOL;
}
?>
