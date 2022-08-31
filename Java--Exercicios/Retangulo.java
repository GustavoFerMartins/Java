import javax.swing.JOptionPane;
public class Retangulo {
    public static void main(String[] args) {
        double baseRetangulo;
        double alturaRetangulo;
        double dimensaoRetangulo;
        baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do Retangulo"));
        alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Retangulo"));
        dimensaoRetangulo = baseRetangulo * alturaRetangulo;
        JOptionPane.showMessageDialog(null, "A dimensão do retangulo é " + dimensaoRetangulo);
    }
}
