package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio06 {

	public static void executar() {
		System.out.println("== MAIOR PALAVRA ==");
		String mensagem = JOptionPane.showInputDialog("DIGITE UMA FRASE: ");

		String[] frase = mensagem.split(" ");

		String maiorPalavra = "";

		for (String frases : frase) {

			if (frases.length() > maiorPalavra.length()) {

				maiorPalavra = frases;

			}

		}

		System.out.println("MAIOR PALAVRA: " + maiorPalavra);

	}
}
