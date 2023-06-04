#include <stdio.h>
int n;
void main(){
    printf("Ingresa un Numero;\n");
    scanf("%i", &n);
    n=(n<0) ? (n * -1) : (n);
    printf("Valor absoluto; %i", n);
}
