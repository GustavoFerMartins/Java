import javax.swing.JOptionPane;
public class IdadePessoaDois {
    public static void main (String[] args){
        int dia;
        int mes;
        int ano;
        int anoEmDias;
        int mesesEmDias;
        int idadeExpressaEmDias;
        JOptionPane.showMessageDialog(null, "INFORME A SUA IDADE:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Anos: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Meses: "));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Dias: "));
        anoEmDias = ano * 365;
        mesesEmDias = mes * 30;
        idadeExpressaEmDias = anoEmDias + mesesEmDias + dia;
        JOptionPane.showMessageDialog(null, "A sua idade expressa em dias é:  " + idadeExpressaEmDias);

    }
}
