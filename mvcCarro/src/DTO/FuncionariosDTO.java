/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.util.Date;

/**
 *
 * @author 110000636
 */
public class FuncionariosDTO {

    private int func_cod;
    private String func_nome;
    private String func_end;
    private String func_bairro;
    private String func_cidade;
    private String fun_cep;
    private String fun_uf;
    private String func_fone;
    private String func_email;
    private Date func_datanasc;
    private String func_sexo;

    public String getFun_cep() {
        return fun_cep;
    }

    public void setFun_cep(String fun_cep) {
        this.fun_cep = fun_cep;
    }

    public String getFun_uf() {
        return fun_uf;
    }

    public void setFun_uf(String fun_uf) {
        this.fun_uf = fun_uf;
    }

    public String getFunc_bairro() {
        return func_bairro;
    }

    public void setFunc_bairro(String func_bairro) {
        this.func_bairro = func_bairro;
    }

    public String getFunc_cidade() {
        return func_cidade;
    }

    public void setFunc_cidade(String func_cidade) {
        this.func_cidade = func_cidade;
    }

    public int getFunc_cod() {
        return func_cod;
    }

    public void setFunc_cod(int func_cod) {
        this.func_cod = func_cod;
    }

    public Date getFunc_datanasc() {
        return func_datanasc;
    }

    public void setFunc_datanasc(Date func_datanasc) {
        this.func_datanasc = func_datanasc;
    }

    public String getFunc_email() {
        return func_email;
    }

    public void setFunc_email(String func_email) {
        this.func_email = func_email;
    }

    public String getFunc_end() {
        return func_end;
    }

    public void setFunc_end(String func_end) {
        this.func_end = func_end;
    }

    public String getFunc_fone() {
        return func_fone;
    }

    public void setFunc_fone(String func_fone) {
        this.func_fone = func_fone;
    }

    public String getFunc_nome() {
        return func_nome;
    }

    public void setFunc_nome(String func_nome) {
        this.func_nome = func_nome;
    }

    public String getFunc_sexo() {
        return func_sexo;
    }

    public void setFunc_sexo(String func_sexo) {
        this.func_sexo = func_sexo;
    }

    

}
