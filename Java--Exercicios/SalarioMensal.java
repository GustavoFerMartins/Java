import javax.swing.JOptionPane;
public class SalarioMensal {
    public static void main (String[] args){
        double salarioMensalAtual;
        double percentual;
        double salarioComReajuste;
        salarioMensalAtual = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salario mensal atual? "));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual é o percentual para o reajuste? "));
        salarioComReajuste = salarioMensalAtual + (salarioMensalAtual * (percentual / 100));
        JOptionPane.showMessageDialog(null, "O seu salário atual com reajuste é:  " + salarioComReajuste );
    }
}
