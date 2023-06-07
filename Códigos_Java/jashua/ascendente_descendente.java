import java.util.Scanner;

public class ascendente_descendente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Orden ascendente del 0 al 100");

        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("Orden descendente del 0 al -100");

        for (int i = 0; i >= -100; i--){
            System.out.println(i);
        }
    }
}
