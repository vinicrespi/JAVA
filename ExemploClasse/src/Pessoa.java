import javax.swing.JOptionPane;

public class Pessoa {
	
	private int rg;
	private int idade;
	private String nome;
	private String endereco;
	private String sexo;
	
	public void setRg(int rg){
		this.rg = rg;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public int getRg(){
		return this.rg;
	}
	public int getIdade(){
		return this.idade;
	}
	public String getNome(){
		return this.nome;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public String getSexo(){
		return this.sexo;
	}
	public String MaiorIdade(){
		String mensagem;
		if(this.idade >= 18){
			mensagem = "Você é maior de idade!!!";
			return mensagem;
		}
		else{
			mensagem = "Você é de menor, espere mais alguns aninhos fofo!!!";
			return mensagem;
		}
	}
}

