package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio05 {

	public static void executar() {

		System.out.println(" SEQUÊNCIA DE FIBONACCI");
		String mensagem = JOptionPane.showInputDialog("INFORME A QUANTIDADE DE SAIDA: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);

		for (int i = 1; i <= valor; i++) {

			System.out.println(metodo(i));
		}

	}

	/**
	 * Método que executa a lógica fibonacci
	 * 
	 * @param num valores da equação
	 * @return retorna o valor para executar o método
	 */
	public static int metodo(int num) {
		if (num == 1 || num == 2) {

			return 1;
		} else {

			return metodo(num - 1) + metodo(num - 2);
		}

	}

}
