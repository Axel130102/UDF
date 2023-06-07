r = 1
while r == 1:  
    n = int (input("INGRESA UN  NUMERO: "))
    if n == 0:
        print("EL NUMERO ",n," ES NEUTRO")
    else: 
        if n < 0:
            print("EL NUMERO ",n," ES NEGATIVO")
        else:
             print("EL NUMERO ",n," ES POSITIVO")
    r = int (input("QUIERES REPETIR EL PROGRAMA?\n1 = SI\n2 = NO\n"))