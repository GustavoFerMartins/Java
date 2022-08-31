
import javax.swing.JOptionPane;
public class SomaQuadrados {
    public static void main(String[] args) {
        double primeiroValor;
        double segundoValor;
        double terceiroValor;
        double quartoValor;
        double resultadoDosQuadrado;
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        quartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        primeiroValor *= primeiroValor;
        segundoValor *= segundoValor;
        terceiroValor *= terceiroValor;
        quartoValor *= quartoValor;
        resultadoDosQuadrado = primeiroValor + segundoValor + terceiroValor + quartoValor;
        JOptionPane.showMessageDialog(null, "A SOMA DOS QUADRADO É " + resultadoDosQuadrado);
    
    }
}