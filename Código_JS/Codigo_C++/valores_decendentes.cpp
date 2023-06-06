#include <iostream>

int main() {
    // Imprimir en orden descendente
    std::cout << "Números en orden descendente:" << std::endl;
    for (int i = 100; i >= 0; i--) {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    return 0;
}