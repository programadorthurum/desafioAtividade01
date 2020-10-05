package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio04 {


		public static void executar() {

			System.out.println("MANIPULANDO TEXTO II");
			String mensagem = JOptionPane.showInputDialog("DIGITE O TEXTO: ");

			String[] texto = texto = mensagem.split(" ");
			System.out.println("TOTAL DE PALAVRAS: " + texto.length);

		}

		
	}


