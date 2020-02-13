import javax.swing.JOptionPane;


public class EX03LT02 {
	public static double salario(){
		double salario;
		do{
			salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o salario do Funcionario: "));
		}while(salario<0);
		return salario;
	}
	public static void main(String[] args) {
		int nFuncionarios = 58, cont;
		double funcionarioSalario[], total = 0, INSS =0;
		
		funcionarioSalario = new double[nFuncionarios];
		
		for (cont = 0; cont < nFuncionarios; cont++){
			funcionarioSalario[cont] = salario();
			total = total + funcionarioSalario[cont];
			if (funcionarioSalario[cont]<=911.70){
				INSS = INSS+((funcionarioSalario[cont]/100)*8);
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*8);
			}
			else if (funcionarioSalario[cont]>911.70 && funcionarioSalario[cont]<=1519.50){
				INSS = INSS+((funcionarioSalario[cont]/100)*9);
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*9);
			}
			else if (funcionarioSalario[cont]>1519.50 && funcionarioSalario[cont]<=3038.99){
				INSS = INSS+((funcionarioSalario[cont]/100)*11);
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*11);
			}
			else if (funcionarioSalario[cont]>3038.99){
				INSS = INSS+((funcionarioSalario[cont]/100)*20);
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*20);
			}
			if (funcionarioSalario[cont]>1434.60 && funcionarioSalario[cont]<=2886.70){
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*15);
			}
			else if (funcionarioSalario[cont]>2886.70){
				funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*27.5);
			}
			funcionarioSalario[cont] = funcionarioSalario[cont]-((funcionarioSalario[cont]/100)*4.5);
		}
		JOptionPane.showMessageDialog(null, "Valor total da folha de pagamentos:      "+total);
		for (cont = 0; cont < nFuncionarios; cont++){
			JOptionPane.showMessageDialog(null, "Salario liquido do funcionario "+ (cont+1)+":    "+funcionarioSalario[cont]);
		}
		JOptionPane.showMessageDialog(null, "Valor total a ser arrecadado do INSS:    "+INSS);
		
	}
}
