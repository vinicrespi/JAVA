/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAO.FuncionariosDAO;
import DTO.FuncionariosDTO;
import java.util.List;

/**
 *
 * @author 110000636
 */
public class FuncionariosBO {

    public boolean inserir(FuncionariosDTO funcionariosDTO){
        if(existe(funcionariosDTO) != true)
        {
            FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
            return funcionariosDAO.inserir(funcionariosDTO);
        }
        return false;
    }

    public boolean alterar(FuncionariosDTO funcionariosDTO)
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.alterar(funcionariosDTO);
    }

    public boolean excluir(FuncionariosDTO funcionariosDTO)
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.excluir(funcionariosDTO);
    }
    public FuncionariosDTO procurarPorCodigo(FuncionariosDTO funcionariosDTO)
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.procurarPorCodigo(funcionariosDTO);
    }
    public FuncionariosDTO procurarPorDescricao(FuncionariosDTO funcionariosDTO)
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.procurarPorDescricao(funcionariosDTO);
    }
    public boolean existe(FuncionariosDTO funcionariosDTO)
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.existe(funcionariosDTO);
    }
    public List<FuncionariosDTO> PesquisarTodos()
    {
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        return funcionariosDAO.pesquisarTodos();
    }

}
