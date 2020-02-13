/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioclassejava;

/**
 *
 * @author 110000636
 */
public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;
    

    public void setNome(String nome){

        this.nome = nome;
    }
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
        public void setNota2(float nota2){
        this.nota2 = nota2;
    }
            public void setNota3(float nota3){
        this.nota3 = nota3;
    }
                public void setNota4(float nota4){
        this.nota4 = nota4;
    }
    public void setMedia(float media){
        this.media = media;
    }
    public String getNome(){
        return this.nome;
    }
    public float getNota1(){
        return this.nota1;
    }
        public float getNota2(){
        return this.nota2;
    }
            public float getNota3(){
        return this.nota3;
    }
                public float getNota4(){
        return this.nota4;
    }
    public float getMedia(){
        return this.media;
    }
     public String Resultado(){
         String mensagem;
         if(this.media>=7){
             mensagem = "Aprovado";
         return mensagem;
         }
         else{
             mensagem = "Reprovado";
         return mensagem;
         }
     }

}
