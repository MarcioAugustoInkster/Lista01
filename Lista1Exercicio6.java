// Importação da classe visual JOptionPane
import javax.swing.JOptionPane;

public class Lista1Exercicio6 {
	public static void main(String[] args) {
		// Chama para o usuário a entrada dos valores
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota 1:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota 2:"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota 3:"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota 4:"));
		
		// Calcula as 4 notas informadas e gera a média das notas
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Condição para verificar a média informado e trazer o respectivo resultado
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "PARABENS voce foi aprovado!\n\nSua media final: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Desculpe, voce reprovou!\n\nSua media final: " + media);
		}
	}
}