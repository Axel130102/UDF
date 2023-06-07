x = 0  #se asigna valor a la variable impar
y = 0  #se asigna valor a la variable impar
while x <= 100:   #se crea ciclo, mientras que la variable x empieza valiendo 0 sea igual o menor a 100
    if x % 2 == 0:  #Si la variable x se divide entre 2, el residuo será igual acero. OPERADOR MOD DEVUELVE EL RESIDUO DE UNA DIVISIÓN.
        print(x)    #se muestra en pantalla el resultado de la división
    x = x + 1       #se incrementa la vartiable x para que no se quede en un ciclo infinito

while y <= 100:   #se crea ciclo, mientras que la variable x empieza valiendo 0 sea igual o menor a 100  
    if y % 2 == 1: #Si la variable x se divide entre 2, el residuo será igual acero. OPERADOR MOD DEVUELVE EL RESIDUO DE UNA DIVISIÓN.
        print(y) #se muestra en pantalla el resultado de la división
    y += 1