import javax.swing.JOptionPane;
public class MaiorDeIdade {
	public static void main(String[] args) {
		double idade;
		idade = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a sua idade"));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você ja tem 18 anos ou mais");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você ainda é de menor, nao tem 18 anos");
		}
	}
}
