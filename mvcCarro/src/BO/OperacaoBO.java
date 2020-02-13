/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.OperacaoDAO;
import DTO.OperacaoDTO;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class OperacaoBO {
    
    public boolean inserir(OperacaoDTO operacaoDTO){
        if(existe(operacaoDTO) != true){
            OperacaoDAO operacaoDAO = new OperacaoDAO();
            return operacaoDAO.inserir(operacaoDTO);
        }
        return false;
    }
    
    public boolean alterar(OperacaoDTO operacaoDTO){
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        return operacaoDAO.alterar(operacaoDTO);
    }
    
    public boolean excluir(OperacaoDTO operacaoDTO){
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        return operacaoDAO.excluir(operacaoDTO);
    }
    
    public OperacaoDTO procurarPorCodigo(OperacaoDTO operacaoDTO){
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        return operacaoDAO.procurarPorCodigo(operacaoDTO);
    }
    
    public boolean existe(OperacaoDTO operacaoDTO){
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        return operacaoDAO.existe(operacaoDTO);
    }
    
    public List<OperacaoDTO> PesquisarTodos(){
        OperacaoDAO operacaoDAO = new OperacaoDAO();
        return operacaoDAO.pesquisarTodos();
    }
    
}
