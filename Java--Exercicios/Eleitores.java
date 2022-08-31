import javax.swing.JOptionPane;
public class Eleitores {
    public static void main (String [] args) {
        //Variavel para ler a quantidade de eleitores
        double eleitoresTotal;
        //Variavel para ler os votos
        double votosBrancos, votosNulos, votosValidos;
        //Variavel para ler os percentual
        double percentualValidos, percentualBrancos, percentualNulos;
        eleitoresTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número total de Eleitores do seu município? "));
        votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número total de votos válidos? "));
        votosBrancos = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número total de votos brancos? "));
        votosNulos = Double.parseDouble(JOptionPane.showInputDialog("Qual é o número total de votos nulos? "));
        //Faz o calculo do percentual dos votos
        percentualBrancos = (votosBrancos / eleitoresTotal) * 100;
        percentualNulos = (votosNulos / eleitoresTotal) * 100;
        percentualValidos = (votosValidos / eleitoresTotal) * 100;
        JOptionPane.showMessageDialog(null, "O Total de eleitores é " + eleitoresTotal);
        //Mostra ao usuario o percentual dos votos
        JOptionPane.showMessageDialog(null, "O percentual de votos validos é " + percentualValidos);
        JOptionPane.showMessageDialog(null, "O percentual de votos brancos é " + percentualBrancos);
        JOptionPane.showMessageDialog(null, "O percentual de votos nulos é " + percentualNulos);
    }
}
