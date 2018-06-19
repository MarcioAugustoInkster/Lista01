// Importar lib de Painel visual
import javax.swing.JOptionPane;

/*
 * 3. Solicitar 2 números inteiros e apresentar os valores:
 * a. A soma
 * b. A subtração
 * c. A multiplicação
 * d. A divisão
 * e. O produto
 */
 
public class Lista1Exercicio3 {
	public static void main(String[] args) {
		// Inicia  a variável dos valores para o usuário
		int valorA = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero:"));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro numero:"));
		
		// Inicia o cálculo dos valores apresentados. Soma, Subtração, Multiplicação e Divisão
		int soma = valorA + valorB;
		int subtracao = valorA - valorB;
		int multi = valorA * valorB;
		double divisao = (valorA / valorB);
		int produto = (valorA * valorA) + (valorB * valorB);
		
		// Monstra para usuário os resultados obtidos
		JOptionPane.showMessageDialog(null, "Os calculos de " + valorA + " e " + valorB + " ficam:\n\n"
			+ valorA + " + " + valorB + " = " + soma + "\n"
			+ valorA + " - " + valorB + " = " + subtracao + "\n"
			+ valorA + " * " + valorB + " = " + multi + "\n"
			+ valorA + " / " + valorB + " = " + divisao + "\n"
			+ "Produto de " + valorA + " e " + valorB + " = " + produto
		);
	}
}