/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioclasse01;

/**
 *
 * @author 110000827
 */
public class Aluno {


    private String nome;
    private float nota1,nota2,nota3,nota4,media;

    public void setNome(String ParamNome) {
        this.nome = ParamNome;
    }

    public void setNota1(float ParamNota1) {
        this.nota1 = ParamNota1;
    }

    public void setNota2(float ParamNota2) {
        this.nota2 = ParamNota2;
    }

    public void setNota3(float ParamNota3) {
        this.nota3 = ParamNota3;
    }

    public void setNota4(float ParamNota4) {
        this.nota4 = ParamNota4;
    }

    public String getNome(){
        return this.nome;
    }

    public float Media(){

        media=(nota1+nota2+nota3+nota4)/4;
        return media;
    }

    public String Situacao(){
            String situacao;
            if(this.media>=7.0){

                situacao = "Aprovado.";
                
            }
            else{
                situacao = "Reprovado";
                
            }
    return situacao;
}
}
