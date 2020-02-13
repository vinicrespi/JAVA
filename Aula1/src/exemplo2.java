import javax.swing.JOptionPane;


public class exemplo2 {

	/**
	 * @param argsa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, soma;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma é "+soma);

	}

}
