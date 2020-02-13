/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioclasse2;

/**
 *
 * @author 110000827
 */
public class Pessoa {

    private String nome;
    private int idade;
    private float peso,altura,pesoIdeal,imc;

    public void setAltura(float ParamAltura) {
        this.altura = ParamAltura;
    }

    public void setIdade(int ParamIdade) {
        this.idade = ParamIdade;
    }

    public void setNome(String ParamNome) {
        this.nome = ParamNome;
    }

    public void setPeso(float ParamPeso) {
        this.peso = ParamPeso;
    }


    public String getNome()
    {
        return this.nome;
    }

    public void calcularPesoIdeal(){
    imc=peso/(altura*altura);
    }

    public String getSituacao()
    {
        String situacao;

        if(imc<=18.4)
        {
            situacao= "Abaixo do peso.";
        }
        else if(imc>18.4 && imc<=24.9)
        {
            situacao= "Peso normal.";
        }
        else if(imc>24.9 && imc<=29.9)
        {
            situacao= "Sobrepeso.";
        }
        else if(imc>29.9 && imc<=34.9)
        {
            situacao= "Obesidade Grau I.";
        }
        else if(imc>34.9 && imc<=39.9)
        {
            situacao= "Obesidade Grau II.";
        }
        else
        {
            situacao= "Obesidade Grau III.";
        }
        return situacao;
    }
}
