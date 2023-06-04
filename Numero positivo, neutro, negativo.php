<?php
//En este apartado ingresas tu numero 
echo "Ingresa un numero ";
fscanf(STDIN,"%d",$numero1);

//Condicion: si el numero ingresado es mayor que cero, de ser asi entonces el numero ingresado es positivo 
if($numero1 >0){
    echo "El numero ".$numero1." es positivo";
}
//Condicion: si el numero ingresado es exactamente cero, entonces el numero ingresado es neutro.
if($numero1==0){
    echo "El numero ".$numero1." es neutro";
    
}else{
    echo "El numero ".$numero1." es negativo";
}

    
?>