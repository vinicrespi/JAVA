/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploclasse;

/**
 *
 * @author 110000827
 */
public class Pessoa {

   //atributos e metodos


	//atributos da classe
	private int rg, idade;
	private String nome, sexo, maioridade;

	// métodos set, setando na memória

	public void setRG (int ParamRG)
	{
		this.rg = ParamRG;
	}
	public void setNome (String ParamNome)
	{
		this.nome = ParamNome;
	}
	public void setIdade (int ParamIdade)
	{
		this.idade = ParamIdade;
	}
	public void setSexo (String ParamSexo)
	{
		this.sexo = ParamSexo;
	}



	//método get- retorno
	public int getRg ()
	{
		return this.rg;
	}
	public String getNome()
	{
		return this.nome;
	}
	public int getIdade()
	{
		return this.idade;
	}
	public String getSexo()
	{
		return this.sexo;
	}

        public String MaiorIdade(){
            String mensagem;
            if(this.idade>=18){
                mensagem = "Você é maior de idade";
                return mensagem;
            }
            else{
                mensagem = "Você é menor de idade";
                return mensagem;
            }
        }

}
