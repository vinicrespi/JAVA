import javax.swing.JOptionPane;


public class exerciciolista03 {

	public static void main(String[] args) {
		
		int soma=0, cont;
		long mult = 1;
		for (cont=1;cont<=30;cont++){
			if (cont%2 == 1){
				soma=soma+cont;
			}
			else if (cont%2 == 0){
				mult=mult*cont;
			}
		}
		JOptionPane.showMessageDialog(null, "A soma de todos os numero impares at� 30 e "+soma+"\n\n\n E a multiplica��o dos numeros pares at� 30 e de "+mult);
		
	}

}
