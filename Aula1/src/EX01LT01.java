import javax.swing.JOptionPane;


public class EX01LT01 {

	public static void main(String[] args) {
		
		int anosMesma=0, anosMaior=0,cont=0;
		double alturaP = 1.50, alturaM = 1.10;
		do{
			//altura Pedro
			alturaP = alturaP + 0.02;
			//altura Marcos
			alturaM = alturaM + 0.03;
			//contador de anos
			cont++;			
		}while(alturaM < alturaP);
		anosMesma = cont;
		anosMaior = cont+1;
		JOptionPane.showMessageDialog(null, "Vai demorar "+anosMesma+" para marcos alcançar Pedro \n e para Marcos passar ira demorar "+anosMaior);		
	}

}
