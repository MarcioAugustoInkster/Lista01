import javax.swing.JOptionPane;

public class Lista1Exercicio8 {
	public static void main(String[] args) {
		double contaLuz = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta de Luz:"));
		
		double contaAgua = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta de Agua:"));
		
		double contaNet = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta NET:"));
		
		double contaVivo = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta Vivo:"));
		
		double contaOi = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta OI:"));
		
		double contaIPTU = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor do IPTU:"));
		
		double contaIPVA = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor da Conta do IPVA:"));
		
		double contaCarro = Double.parseDouble(
			JOptionPane.showInputDialog(null, "Entre o valor do Seguro do carro:"));

		double contaTelefone = contaNet + contaVivo + contaOi;
		double valorImposto = contaIPTU + contaIPVA;
		double valorRestante = contaLuz + contaAgua + contaCarro;
		double totalValor = contaTelefone + valorImposto + valorRestante;
		
		JOptionPane.showMessageDialog(null,
			"Total conta Telefone: R$" + contaTelefone +
			"\nTotal conta Impostos: R$" + valorImposto +
			"\nTotal contas restantes: R$" + valorRestante +
			"\nTotal de Contas a Pagar: R$" + totalValor
		);
	}
}