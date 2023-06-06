#include <iostream> 
#include <cmath> 
int main() {
    int numero;
    std::cout << "Dime un número: ";
    std::cin >> numero;
    int valor_absoluto = abs(numero);
    
    std::cout << "El valor absoluto de " << numero << " es " << valor_absoluto << std::endl;
    
    return 0;
} 