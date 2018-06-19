// Importa a lib de Painel visual
import javax.swing.JOptionPane;

public class Lista1Exercicio5 {
	public static void main(String[] args) {
		// Declaracao das variaveis de acesso
		String carroNome = JOptionPane.showInputDialog(null, "Entre com nome do Carro:");
		double carroPreco = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com preco do Carro:"));
		double parcelaValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre o valor da Parcela:"));
		int parcela = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Parcelas:"));
		
		// Calculo para realizacao dos resultados
		double totalParcela = parcela * parcelaValor;
		double diferenca = totalParcela - parcelaValor;
		
		// Monstra na tela os resultados informados do usuario
		JOptionPane.showMessageDialog(null, "*** Consorcio Meu Carro ***"
			+ "\n\nCarro: " + carroNome
			+ "\nPreco (R$): " + carroPreco
			+ "\nValor Parcela (R$): " + parcelaValor
			+ "\nParcelado em " + parcela + " meses"
			+ "\nTotal a pagar: R$" + totalParcela
			+ "\nFinanciamento: R$" + diferenca
		);
	}
}