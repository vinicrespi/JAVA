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
public class ClientesDTO {

    private int cli_cod;
    private String cli_nome;
    private String cli_end;
    private String cli_bairro;
    private String cli_cidade;
    private String cli_cep;
    private String cli_uf;
    private String cli_fone;
    private String cli_email;
    private Date cli_datanasc;
    private String cli_sexo;

    public String getCli_bairro() {
        return cli_bairro;
    }

    public void setCli_bairro(String cli_bairro) {
        this.cli_bairro = cli_bairro;
    }

    public String getCli_cep() {
        return cli_cep;
    }

    public void setCli_cep(String cli_cep) {
        this.cli_cep = cli_cep;
    }

    public String getCli_cidade() {
        return cli_cidade;
    }

    public void setCli_cidade(String cli_cidade) {
        this.cli_cidade = cli_cidade;
    }

    public int getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(int cli_cod) {
        this.cli_cod = cli_cod;
    }

    public Date getCli_datanasc() {
        return cli_datanasc;
    }

    public void setCli_datanasc(Date cli_datanasc) {
        this.cli_datanasc = cli_datanasc;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public String getCli_end() {
        return cli_end;
    }

    public void setCli_end(String cli_end) {
        this.cli_end = cli_end;
    }

    public String getCli_fone() {
        return cli_fone;
    }

    public void setCli_fone(String cli_fone) {
        this.cli_fone = cli_fone;
    }

    public String getCli_nome() {
        return cli_nome;
    }

    public void setCli_nome(String cli_nome) {
        this.cli_nome = cli_nome;
    }

    public String getCli_sexo() {
        return cli_sexo;
    }

    public void setCli_sexo(String cli_sexo) {
        this.cli_sexo = cli_sexo;
    }

    public String getCli_uf() {
        return cli_uf;
    }

    public void setCli_uf(String cli_uf) {
        this.cli_uf = cli_uf;
    }

    

}
