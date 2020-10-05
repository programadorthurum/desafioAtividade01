package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio02 {

	public static void executar() {

		Double temp = (double) 0;
		Double expressao = (double) 0;
		String mensagem = JOptionPane.showInputDialog("DIGITE O VALOR: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);

		System.out.println("Sequencial I");

		for (int i = 1; i <= valor; i++) {

			temp = temp + ((valor - i) / (i + 1));

		}

		expressao = valor + temp;

		System.out.println("ENTRADA: " + valor + " SAIDA: " + expressao);

	}

}
