import javax.swing.JOptionPane;
public class RevendedoraDeCarros {
    public static void main (String[] args){
        double carrosVendidos;
        double valorTotalDeVendas;
        double salarioFixo;
        double comissaoPorCarro;
        double comissaoTotal;
        double salarioFinal;
        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario fixo"));
        valorTotalDeVendas = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o seu valor total de vendas"));
        carrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros você vendeu?"));
        comissaoPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da comissão por carro vendido?"));
        
        comissaoTotal = carrosVendidos * comissaoPorCarro;
        comissaoTotal = comissaoTotal + ( valorTotalDeVendas * 5/100 );
        salarioFinal = comissaoTotal + salarioFixo;
        JOptionPane.showMessageDialog(null, "O salario final é" + salarioFinal);
        JOptionPane.showMessageDialog(null, "O salario final é" + comissaoTotal);
    
        
    }

}
