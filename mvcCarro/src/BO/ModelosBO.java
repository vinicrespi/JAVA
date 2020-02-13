/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAO.ModelosDAO;
import DTO.ModelosDTO;
import java.util.List;

/**
 *
 * @author 110000636
 */
public class ModelosBO {

    public boolean inserir(ModelosDTO modelosDTO){
        if(existe(modelosDTO) != true)
        {
            ModelosDAO modelosDAO = new ModelosDAO();
            return modelosDAO.inserir(modelosDTO);
        }
        return false;
    }
    public boolean alterar(ModelosDTO modelosDTO){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.alterar(modelosDTO);
    }
    public boolean excluir(ModelosDTO modelosDTO){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.excluir(modelosDTO);
    }
    public ModelosDTO procurarPorCodigo(ModelosDTO modelosDTO){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.procurarPorCodigo(modelosDTO);
    }
    public ModelosDTO procurarPorDescricao(ModelosDTO modelosDTO){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.procurarPorDescricao(modelosDTO);
    }
    public boolean existe(ModelosDTO modelosDTO){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.existe(modelosDTO);
    }
    public List<ModelosDTO> PesquisarTodos(){
        ModelosDAO modelosDAO = new ModelosDAO();
        return modelosDAO.pesquisarTodos();
    }

}
