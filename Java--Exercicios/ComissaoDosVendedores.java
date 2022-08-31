import javax.swing.JOptionPane;
public class ComissaoDosVendedores {
    public static void main(String[] args){
        double precoUnitario;
        double quantidadeVendida;
        double valorTotal;
        double porcentagem;
        double resultadoDaComissao;
        precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Unitario da peça"));
        quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade dea peça"));
        valorTotal = precoUnitario * quantidadeVendida;
        porcentagem = valorTotal * 5 / 100;
        resultadoDaComissao = porcentagem + valorTotal;

        JOptionPane.showMessageDialog(null, "O resultado do valor de todas as peça é " + valorTotal );
        JOptionPane.showMessageDialog(null, "O resultado da comissão do vendedor é " + porcentagem );
        JOptionPane.showMessageDialog(null, "O valor total da comissão é " + resultadoDaComissao);
    }
}
