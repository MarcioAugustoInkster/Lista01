// Importa lib de painel visual JOptionPan
import javax.swing.JOptionPane;

public class Lista1Exercicio4 {
	public static void main(String[] args) {
		// Inicia variável para receber valor digitado do usuário
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero de Tabuada:"));
		
		// Define uma variável sequencial individual
		int n1 = numero * 1;
		int n2 = numero * 2;
		int n3 = numero * 3;
		int n4 = numero * 4;
		int n5 = numero * 5;
		int n6 = numero * 6;
		int n7 = numero * 7;
		int n8 = numero * 8;
		int n9 = numero * 9;
		int n10 = numero * 10;
		
		// Mostra o resultado individual para cada fator
		// A repetição manual de cada multiplicação gera a sequencia em tabela
		JOptionPane.showMessageDialog(null,
			numero + "x" + 1 + " = " + n1 + "\n" +
			numero + "x" + 2 + " = " + n2 + "\n" +
			numero + "x" + 3 + " = " + n3 + "\n" +
			numero + "x" + 4 + " = " + n4 + "\n" +
			numero + "x" + 5 + " = " + n5 + "\n" +
			numero + "x" + 6 + " = " + n6 + "\n" +
			numero + "x" + 7 + " = " + n7 + "\n" +
			numero + "x" + 8 + " = " + n8 + "\n" +
			numero + "x" + 9 + " = " + n9 + "\n" +
			numero + "x" + 10 + " = " + n10
		);
	}
}