import java.util.Scanner;

public class num_letras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

           System.out.println("Inserta un número entero: ");
           numero = entrada.nextInt();
            String digitos = Integer.toString(numero);
           System.out.println("tu cantidad contiene "+digitos.length()+" digitos.");


        
        
    }
}
