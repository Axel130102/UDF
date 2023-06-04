<?php


//En este apartado ingresas tu numero 
echo "Ingresa un numero ";
fscanf(STDIN,"%d",$numero1);

//Condicion para determinar si el numero es par, para ello se utiliza una division modular.
if($numero1 % 2==0){
    echo "El numero ".$numero1." Es par";

}else{
    echo"El numero ".$numero1." Es impar";
}


?>
