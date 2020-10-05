package desafioAtividade01;

import javax.swing.JOptionPane;

public class Desafio08 {

	public static void executar() {

		System.out.println("Raízes de Uma Equação de 2º Grau");
		String mensagem1 = JOptionPane.showInputDialog("Coeficiente A: ");
		mensagem1 = mensagem1.replace(",", ".");
		double a = Double.parseDouble(mensagem1);

		String mensagem2 = JOptionPane.showInputDialog("Coeficiente B: ");
		mensagem2 = mensagem2.replace(",", ".");
		double b = Double.parseDouble(mensagem2);

		String mensagem3 = JOptionPane.showInputDialog("Coeficiente C: ");
		mensagem3 = mensagem3.replace(",", ".");
		double c = Double.parseDouble(mensagem3);

		double delta = ((b * b) - (4 * a * c));
		System.out.println(delta);
		if (delta == 0) {

			double x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));
			System.out.println("X1: " + x1);

		} else if (delta > delta) {
			double x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));
			System.out.println("X1: " + x1);
			double x2 = (((-b) + (Math.sqrt(delta))) / (2 * a));
			System.out.println("X2: " + x2);
		} else {

			System.out.println("Indeterminadas");

		}

	}

}
