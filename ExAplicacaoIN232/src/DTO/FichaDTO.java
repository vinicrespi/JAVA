/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author 109005138
 */
public class FichaDTO {

    private int matricula;
    private String nome;

    public void setMatricula (int ParaMatricula)
    {
        this.matricula = ParaMatricula;
    }
     public int getMatricula()
    {
         return this.matricula;
     }

     public void setNome (String ParamNome)
    {
        this.nome = ParamNome;
    }
     public String getNome()
    {
         return this.nome;
     }
     


}
