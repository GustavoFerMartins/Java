import javax.swing.JOptionPane;
public class MaiorDeIdadeTernario {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade"));
		String idadeMaior;
		idadeMaior = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
		JOptionPane.showMessageDialog(null, idadeMaior);
	}
	
}
