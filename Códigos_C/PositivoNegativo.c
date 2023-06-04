#include <stdio.h>
int n;
void main(){
    printf("Ingresa un Numero;\n");
    scanf("%i", &n);
    if(n!=0) n=(n>0) ? ( printf("%i Es positivo", n)) : ( printf("%i Es negativo", n));
    else printf("Es neutro");
}
