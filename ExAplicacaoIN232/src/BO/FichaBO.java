/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAO.FichaDAO;
import DTO.FichaDTO;
import java.util.List;

/**
 *
 * @author 109005138
 */
public class FichaBO {

    public boolean inserir(FichaDTO fichaDTO){
        //criando objeto
        FichaDAO fichaDAO = new FichaDAO();
        fichaDAO.inserir(fichaDTO);
        return true;

    }
    public boolean alterar(FichaDTO fichaDTO){
        FichaDAO fichaDAO = new FichaDAO();
        fichaDAO.alterar(fichaDTO);
        return true;
    }
    public boolean excluir (FichaDTO fichaDTO){
        FichaDAO fichaDAO = new FichaDAO();
        fichaDAO.excluir(fichaDTO);
        return true;
    }
    public List<FichaDTO> pesquisar(){
        List<FichaDTO> lista;
        FichaDAO fichaDAO = new FichaDAO();
        lista = fichaDAO.pesquisar();
        return lista;
    }
    public FichaDTO procurar (FichaDTO fichaDTO)
    {
        FichaDAO fichaDAO = new FichaDAO();
        fichaDTO = fichaDAO.procurar(fichaDTO);
        return fichaDTO;
    }
    



    }

