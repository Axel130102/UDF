package Valor_Absoluto.Valor_Absoluto.src;//la ubicacion varea de acuerdo a la estructura del programa JAVA
import javax.swing.JOptionPane;
public class Absoluto {
    static int n;
    public static void main(String[] args) throws Exception {
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero y te dare su \nValor Absoluto;\t") );
        JOptionPane.showMessageDialog(null,"El valor Absoluto es; "+( n=(n<0) ? (n * -1) : (n)));
    }
}
