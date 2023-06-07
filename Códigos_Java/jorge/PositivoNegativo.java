package Valor_Absoluto.Valor_Absoluto.src;
import javax.swing.JOptionPane;
public class PositivoNegativo {
    static int n;
    public static void main(String[] args) throws Exception {
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero y te diré si es\nPositivo o Negativo;\t") );
        if (n!=0) JOptionPane.showMessageDialog(null,"El  Numero "+n+" es; "+((n< 0) ? ("Negativo") : ("Positivo")));
        else JOptionPane.showMessageDialog(null,"El  Numero "+n+" es;Neutro");
    }
}
