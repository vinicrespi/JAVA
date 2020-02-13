
import javax.swing.JOptionPane;


public class EX02LT02 {
	public static int idade(){
		int idadefunc;
		do{
			idadefunc = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade:"));
		}while(idadefunc <= 0|| idadefunc >100);
		return idadefunc;
	}
	public static void main(String[] args) {
		String sexo, resposta, experiencia;
		int f = 101;
		int a = 0, b = 0, c = 0, d = 0, d2 = 0, e = 0, g1 = 0,g2 = 0,g3 = 0,g4 = 0, idade = 0,  nivel;
		do{
			do{
				sexo = JOptionPane.showInputDialog(null, "Informe o sexo: [M-F]");
				sexo = sexo.toLowerCase();
			}while(!(sexo.equals("m")) && !(sexo.equals("f")));
			if (sexo.equals("f")){
				do{
					a++;
					experiencia = JOptionPane.showInputDialog(null, "Você tem experiencia para esta vaga?[S-N]");
					experiencia = experiencia.toLowerCase();
				}while(!(experiencia.equals("s")) && !(experiencia.equals("n")));
				if (experiencia.equals("s")){
					idade = idade();
					d++;
					d2=d2+idade;
				}
			/*	if (a == 1){
					f = idade;
				}
				else{*/
					if(idade<f){
						f=idade;
					}
				}
			//}
			else{ 
				idade = idade();
				b++;
				c = c + idade;
				if (idade>=18 && idade<=35){
					e++;
				}
			}
			do{
				nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu nivel de graduação:\n1 - Ensino Fundamental\n2 - Ensino Médio\n3 - Graduação\n4 - Pós-Graduação\n"));
			}while(nivel != 1 && nivel != 2 && nivel != 3 && nivel != 4);
			switch (nivel){
				case 1:
					g1++;
					break;
				case 2:
					g2++;
					break;
				case 3:
					g3++;
					break;
				case 4:
					g4++;
					break;
				default:
			}
			resposta = JOptionPane.showInputDialog(null,"Deseja Reptir?[S-N]");
			resposta = resposta.toLowerCase();
		}while(!(resposta.equals("n")));
		if(b!=0)
			c=c/b;
		if(d!=0)
			d2=d2/d;
		e = (b/100)*e;
		JOptionPane.showMessageDialog(null, "N° de candidatas Mulheres:            "+a+"\n" +"N° de candidatos Homens:              "+b+"\n"+"Idade Media dos Homens:               "+c+"\n"+"Porcentagen de Homens entre 18 e 35:  "+d2+"%\n"+"Menor Idade Feminina com experiência: "+f+"\n\n\n"+"Niveis de Ecolaridade:\n"+"Ensino Fundamental:                   "+g1+"\n"+"Ensino Médio:                         "+g2+"\n"+"Graduação:                            "+g3+"\n"+"Pós-Graduação:                        "+g4+"\n\n\n");
		
	}

}
