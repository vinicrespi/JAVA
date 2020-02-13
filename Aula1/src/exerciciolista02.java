import javax.swing.JOptionPane;


public class exerciciolista02 {

	public static void main(String[] args) {
		
		int cont = 10, contdo = 10;
		
		while(cont<=20){
			JOptionPane.showMessageDialog(null, cont);
			cont++;
		}
		do{
			JOptionPane.showMessageDialog(null, contdo);
			contdo++;
		}while(contdo<=20);

	}

}
