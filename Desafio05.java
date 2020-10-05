package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio05 {

	public static void executar() {

		System.out.println(" SEQU�NCIA DE FIBONACCI");
		String mensagem = JOptionPane.showInputDialog("INFORME A QUANTIDADE DE SAIDA: ");
		mensagem = mensagem.replace(",", ".");
		double valor = Double.parseDouble(mensagem);

		for (int i = 1; i <= valor; i++) {

			System.out.println(metodo(i));
		}

	}

	/**
	 * M�todo que executa a l�gica fibonacci
	 * 
	 * @param num valores da equa��o
	 * @return retorna o valor para executar o m�todo
	 */
	public static int metodo(int num) {
		if (num == 1 || num == 2) {

			return 1;
		} else {

			return metodo(num - 1) + metodo(num - 2);
		}

	}

}
