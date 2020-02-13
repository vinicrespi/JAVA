import javax.swing.JOptionPane;


public class Exercicio1 {
	public static String[] gabarito(){
		int cont, questoes = 10;
		String gabarito[] = new String[questoes];
				for (cont=0;cont<questoes;cont++){
			do{
				gabarito[cont] = JOptionPane.showInputDialog(null, "Informe a resposta da questão "+(cont+1)+":");
			}while(!(gabarito[cont].equals("a")) && !(gabarito[cont].equals("b")) && !(gabarito[cont].equals("c")) && !(gabarito[cont].equals("d")));
		}
		return gabarito;
	}
	public static String[][] respostas(){
		int resposta = 10, alunos = 100, cont, cont2;
		String respostas[][] = new String[resposta][alunos];
		for (cont = 0;cont<alunos;cont++){
			for (cont2=0;cont2<resposta;cont2++){
				do{
					respostas[cont2][cont] = JOptionPane.showInputDialog(null, "Informe a "+(cont2+1)+" resposta do "+(cont+1)+" aluno:");
				}while(!(respostas[cont2][cont].equals("a")) && !(respostas[cont2][cont].equals("b")) && !(respostas[cont2][cont].equals("c")) && !(respostas[cont2][cont].equals("d")));
			}
		}
		return respostas;
	}
	public static int []confere(String gabarito[], String resposta[][]){
		int perguntas = 10, alunos =100, cont, cont2, notas[] = new int[alunos];
		for (cont=0;cont<alunos;cont++) notas[cont] = 0;
		for (cont=0;cont<alunos;cont++){
			for(cont2=0;cont2<perguntas;cont2++){
				if(resposta[cont2][cont].equals(gabarito[cont2])){
					notas[cont]++;
				}
			}
		}
		return notas;
	}
	public static void mostraNotas(int notas[]){
		int alunos = 100, cont;
		for (cont=0;cont<alunos;cont++){
			JOptionPane.showMessageDialog(null, "nota do "+(cont+1)+" aluno: "+notas[cont]);
		}
	}
	public static void main(String[] args) {
		int questoes = 10, alunos = 100, notas[] = new int[alunos];
		String gabarito[] = new String[questoes], respostas[][] = new String[questoes][alunos];
		gabarito = gabarito();
		respostas = respostas();
		notas = confere(gabarito, respostas);
		mostraNotas(notas);
	}
}
