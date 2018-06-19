import javax.swing.JOptionPane;

public class Lista1Exercicio10 {
    public static void main(String[] args) {
        int nascimento = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre com teu ano de nascimento:"));

        int anoAtual = 2018;
        int calculoIdade = anoAtual - nascimento;

        JOptionPane.showMessageDialog(null, "Sua idade atual: " + calculoIdade);
    }
}