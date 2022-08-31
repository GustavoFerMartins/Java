import javax.swing.JOptionPane;
public class IdadePessoa {
    public static void main (String[] args){
        int idade;
        int dias;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        dias = idade * 365;
        JOptionPane.showMessageDialog(null, "A sua idade é:  " + idade );
        JOptionPane.showMessageDialog(null, "A sua expressa em dias é:  " + dias );

    }
}
