import javax.swing.JOptionPane;
public class SalarioMinimo {
	
	public static void main(String[] args) {
		double salario;
		double salarioMinimo;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu salario?"));
		salarioMinimo = 1212;
		
		if (salario >= salarioMinimo) {
			JOptionPane.showMessageDialog(null, "Seu salario é maior que o salario minimo");
		}
		else if (salario <= salarioMinimo) {
			JOptionPane.showMessageDialog(null, "Seu salario é menor que o salario minimo");
		}
	}
}
