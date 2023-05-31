package Valor_Absoluto.Valor_Absoluto.src;
import javax.swing.JOptionPane;
public class ParImpar {
    static int n;
    public static void main(String[] args) throws Exception {
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero y te diré si es\nPar o Impar;\t") );
        JOptionPane.showMessageDialog(null,"El  Numero "+n+" es; "+(((n%2)== 0) ? ("par") : ("impar")));
    }
}
