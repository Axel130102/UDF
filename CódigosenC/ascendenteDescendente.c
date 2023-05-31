#include <stdio.h>
void main(){
    printf("De 0 a 100;\n");
    for (int a = 0; a <= 100; a++)
        printf("%i ,\t",a);
         printf("\nDe 100 a 0;\n");
    for (int i = 100; i >= 0; i--)
        printf("%i ,\t",i);
}
