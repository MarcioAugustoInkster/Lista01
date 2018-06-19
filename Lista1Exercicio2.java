// Importa lib de Paineis Java
import javax.swing.JOptionPane;

/*
 * Calcule a quantidade de Litros de água ingeridos em determinado período e o valor pago. 
 * Para tal, deve-se solicitar ao usuário a média da quantidade de litros ingeridos por dia,
 * a quantidade de anos e o valor pago pela água.
 *
 * Exemplo:
 * - Quantidade: 3 Litros
 * - Quantidade anos: 17
 * - Valor por litro: R$9,75
 *
 * Litros consumidos: 18,615
 * Valor pago: R$181,496,25
*/

public class Lista1Exercicio2 {
	// Inicia a execução do sistema
	public static void main(String[] args) {
		// Inicia variáveis para receber valor do usuário no campo
		int litro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos litros de agua voce consome por dia?"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Por quantos anos voce consome " + litro + " litros de agua?"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor pago de agua?"));
		// Calcula litros por ano
		int litroAno = (365 * ano) * litro;
		// Calcula total de Litros em X anos
		double valorTotal = valor * litroAno;
		
		// Mostra o resultado na Tela do valor total pago em Litro-Anos
		JOptionPane.showMessageDialog(null, "*** Resumo de Litros e Valor pago de agua ***"
			+ "\n\nLitros Consumidos: " + litroAno
			+ "\nTotal Pago: " + valorTotal);
	}
}