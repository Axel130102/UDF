import java.util.Scanner;

import javax.xml.transform.Source;

public class positivo_negativo_neutro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double numero;

        System.out.println("Hola bienvenido al tercer ejercicio, por favor ingresa un número :");

        numero = entrada.nextDouble();

        if(numero > 0) {
            System.out.println("Tu número es positivo");
        }

        else if (numero < 0) {
            System.out.println("Tu número es negativo");
        }
        else if (numero == 0) {
            System.out.println("Tu número es neutro");
        }
    }
}
