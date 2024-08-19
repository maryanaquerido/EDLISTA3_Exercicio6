package view;
import controller.ControllerSerie;
import javax.swing.JOptionPane;
public class PrincipalSerie {
	public static void main (String [] args) {
		
		ControllerSerie m = new ControllerSerie();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		double serie = m.Serie(num);
		System.out.println("O resultado da série quando N for " + num + " é: " + serie);
		
	}

}