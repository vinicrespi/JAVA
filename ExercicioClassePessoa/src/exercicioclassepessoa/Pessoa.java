/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioclassepessoa;

/**
 *
 * @author 110000827
 */
public class Pessoa {

    private String nome, endereco, email, telefone;

    public void setNome (String ParamNome)
	{
		this.nome = ParamNome;
	}
    public void setEndereco (String ParamEndereco)
	{
		this.endereco = ParamEndereco;
	}
    public void setEmail (String ParamEmail)
	{
		this.nome = ParamEmail;
	}
    public void setTel (String ParamTel)
	{
		this.telefone = ParamTel;
	}

    public String getNome ()
	{
		return this.nome;
	}
    public String getEndereco ()
	{
		return this.endereco;
	}
     public String getEmail ()
	{
		return this.email;
	}

    public String getTel ()
	{
		return this.telefone;
	}


}
