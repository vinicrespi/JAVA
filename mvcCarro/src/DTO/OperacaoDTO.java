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
public class OperacaoDTO {
    private int opr_cod;
    protected ClientesDTO cliente = new ClientesDTO();
    protected FuncionariosDTO funcionario = new FuncionariosDTO();
    protected AutomoveisDTO automovel = new AutomoveisDTO();
    private Date opr_data;
    private Date opr_hora;
    private String opr_tipo;

    public AutomoveisDTO getAutomovel() {
        return automovel;
    }

    public void setAutomovel(AutomoveisDTO automovel) {
        this.automovel = automovel;
    }

    public ClientesDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClientesDTO cliente) {
        this.cliente = cliente;
    }

    public FuncionariosDTO getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionariosDTO funcionario) {
        this.funcionario = funcionario;
    }

    public int getOpr_cod() {
        return opr_cod;
    }

    public void setOpr_cod(int opr_cod) {
        this.opr_cod = opr_cod;
    }

    public Date getOpr_data() {
        return opr_data;
    }

    public void setOpr_data(Date opr_data) {
        this.opr_data = opr_data;
    }

    public Date getOpr_hora() {
        return opr_hora;
    }

    public void setOpr_hora(Date opr_hora) {
        this.opr_hora = opr_hora;
    }

    public String getOpr_tipo() {
        return opr_tipo;
    }

    public void setOpr_tipo(String opr_tipo) {
        this.opr_tipo = opr_tipo;
    }
    
    

}
