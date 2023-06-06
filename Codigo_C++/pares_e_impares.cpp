#include <iostream>

int main() {

    std::cout << "Números pares:" << std::endl;
    for (int i = 0; i < 100; i += 2) {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    std::cout << "Números impares:" << std::endl;
    for (int i = 1; i < 100; i += 2) {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    return 0;
}