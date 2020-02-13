/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.AutomoveisDAO;
import DTO.AutomoveisDTO;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class AutomoveisBO {
    
    public boolean inserir(AutomoveisDTO automoveisDTO){
        if(existe(automoveisDTO) != true){
            AutomoveisDAO automoveisDAO = new AutomoveisDAO();
            return automoveisDAO.inserir(automoveisDTO);
        }
    return false;
    }
    
    public boolean alterar(AutomoveisDTO automoveisDTO){
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        return automoveisDAO.alterar(automoveisDTO);
    }
    
    public boolean excluir(AutomoveisDTO automoveisDTO){
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        return automoveisDAO.excluir(automoveisDTO);
    }
    
    public AutomoveisDTO procurarPorPlaca(AutomoveisDTO automoveisDTO){
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        return automoveisDAO.procurarPorPlaca(automoveisDTO);
    }
    
    public boolean existe(AutomoveisDTO automoveisDTO){
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        return automoveisDAO.existe(automoveisDTO);
    }
    
    
    public List<AutomoveisDTO> PesquisarTodos(){
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        return automoveisDAO.pesquisarTodos();
    }
    
}

  
