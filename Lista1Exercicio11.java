import javax.swing.JOptionPane;

public class Exercicio0110 {
    public static void main(String[] args) {
        /**
         * 11. Solicite o dia, mes e ano de nascimento e apresente 
         * as seguintes informacoes:
         * 
         * Quantidade de dias vivo
         * Quantidade de anos vivo
         * Quantidade de meses vivo
         * Quantidade de horas vivo
         * Quantidade de minutos vivo
         * Quantidade de segundos vivo
        */
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia de nascimento:")), 
            mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de nascimento:")), 
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento:")), 
            anoNascimento = 2018 - 1990,
            calculaDia = 365 * anoNascimento, calculaMes = 12 * anoNascimento;

        //
    }
}