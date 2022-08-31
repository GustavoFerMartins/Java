import javax.swing.JOptionPane;
public class Antecessor {
        public static void main(String[] args){
            int numero;
            int antecessor;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você quer saber o antecessor")); 
            antecessor = numero - 1;
            JOptionPane.showMessageDialog(null, "O antecessor é:  " + antecessor );
        }
}
