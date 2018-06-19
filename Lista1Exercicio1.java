import javax.swing.JOptionPane;

// Aluno: Marcio Augusto Schlosser
// Exercicio1 - 01

public class Lista1Exercicio1 {
   public static void main(String[] args) {
	   int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: "));
	   
	   JOptionPane.showMessageDialog(null, "Numero informado: " + numero
	        + "\n\nAntecessor: " + (numero - 1)
			+ "\nSucessor: " + (numero + 1));
	   
   }
}