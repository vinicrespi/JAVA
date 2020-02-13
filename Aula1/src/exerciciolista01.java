import javax.swing.JOptionPane;


public class exerciciolista01 {

	
	public static void main(String[] args) {
		
		int numero;
		
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe a porra do numero do mes!"));
		
			switch(numero){
			
				case 0:
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "January");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "February");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "March");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "April");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "May u r P.I.M.P.");
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "June");
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "July");
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "August");
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "September");
					break;
				case 10:
					JOptionPane.showMessageDialog(null, "October");
					break;
				case 11:
					JOptionPane.showMessageDialog(null, "November u r P.I.M.P.");
					break;
				case 12:
					JOptionPane.showMessageDialog(null, "December");
					break;
				default:
					JOptionPane.showMessageDialog(null, "informa até 12 FDP!");		
			}
		}while(numero!=0);

	}

}
