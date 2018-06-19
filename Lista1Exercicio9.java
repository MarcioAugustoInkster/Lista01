import javax.swing.JOptionPane;

public class Lista1Exercicio9 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "*** Inversao de Numeros ***");
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um numero:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um outro numero:"));

        JOptionPane.showMessageDialog(null, "Voce digitou:" 
            + "\n\nNumero 1: " + valor1 +
            "\nNumero 2: " + valor2 +
            "\n\n\n[Pressione 'OK' para inverter os numeros]");
        
        JOptionPane.showMessageDialog(null, "*** Agora os numeros sao: ***" +
            "\n\nNumero 1: " + valor2 + "\nNumero 2: " + valor1 +
            "\n\n[Pressione 'Ok' para inverter os valores]");
        
        int valor3 = valor2;
        valor2 = valor1;

        JOptionPane.showMessageDialog(null, "*** Valores dos numeros agora: ***" +
            "\n\nNumero 1: " + valor3 + "\nNumero 2: " + valor2);
    }
}