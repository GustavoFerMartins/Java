import javax.swing.JOptionPane;
public class CustoDeUmCarro {
   public static void main (String[] args) {
    double custoDeFabrica;
    double porcetagemDistribuidor;
    double impostos;
    double valorTotal;
    custoDeFabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual é o custo de fábrica do carro? "));
    porcetagemDistribuidor = custoDeFabrica * 28 / 100;
    impostos = custoDeFabrica * 45 / 100;
    valorTotal = custoDeFabrica + porcetagemDistribuidor + impostos;
    JOptionPane.showMessageDialog(null, "O Valor total do carro com os custo do distribuido e impostos fica: " + valorTotal);
    
    }
}
