package Valor_Absoluto.Valor_Absoluto.src;
import javax.swing.JOptionPane;
public class AcendenteDecendente {
    static int[] arr= new int[100];
    static int n;
    public static void main(String[] args) throws Exception {
        for (n = 0; n <= arr.length; n++) {
            arr[n] = n + 1;
        }
        JOptionPane.showMessageDialog(null,arr);
        for (n =100; n >= 0; n--) {
            arr[n] = n + 1;
        }
    }
}
