package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio01 {

	/**
	 * �nico m�todo de execu��o do desafio
	 */
	public static void executar() {

		System.out.println("RAINHA E O MONGE");
		
		Double qtd = (double) 1;
		Double soma = null;

		
		for (int i = 1; i <= 64; i++) {
			if (i == 1) {

				System.out.println("Casa: " + i + "- Qtd: " + qtd + "- Soma: " + i);

			} else {

				qtd = qtd * 2;
				soma = qtd + (qtd - 1);

				System.out.println("Casa: " + i + " - Qtd: " + qtd + " - Soma: " + soma);
			}
		}

	}
}
