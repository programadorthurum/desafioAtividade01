package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio03 {


		public static void executar() {
			
			System.out.println("Manipulando Texto I");
			String mensagem = JOptionPane.showInputDialog("Digite o texto: ");
			mensagem = mensagem.toLowerCase();
			int cont = 0;
			
			for(int i=0; i < mensagem.length(); i++) {
				
							
				if(mensagem.charAt(i)=='a') {
					
					cont++;
					
				}
			} 
			System.out.println("Total de A: " + cont);
		
	}
		
	}


