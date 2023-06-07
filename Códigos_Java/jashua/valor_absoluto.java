import java.util.Scanner;

public class valor_absoluto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        long resultado;

        System.out.println("Hola bienvenido al primer ejercicio, por favor ingresa un número con decimales y mira lo que sucede: ");
        numero = entrada.nextDouble();
        resultado = Math.round(numero);
 
        System.out.println("El resultado es: "+resultado+" cualquier número que ingreses se redondeara :3 jiji");


    }
}
