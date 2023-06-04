#include <stdio.h>
int n;
void main(){
    printf("Ingresa un Numero;\n");
    scanf("%i", &n);
    n=((n%2)== 0) ? (printf("%i Es par", n)) : (printf("%i Es impar", n));
}
