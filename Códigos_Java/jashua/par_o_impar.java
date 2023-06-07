import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class par_o_impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Hola bienvenido al segundo ejercicio, por favor ingresa un número entero que no sea cero: ");
        int numero;

        numero = entrada.nextInt();

            if(numero %2 == 0) {
                System.out.println("El número "+numero+" es par.");
            } else {
                System.out.println("El número "+numero+" es impar.");
            }
    }

}
