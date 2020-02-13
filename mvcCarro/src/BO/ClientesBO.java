/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAO.ClientesDAO;
import DTO.ClientesDTO;
import java.util.List;

/**
 *
 * @author 110000636
 */
public class ClientesBO {

    public boolean inserir(ClientesDTO clientesDTO){
        if(existe(clientesDTO) != true){
            ClientesDAO clientesDAO = new ClientesDAO();
            return clientesDAO.inserir(clientesDTO);
        }
        return false;
    }
    public boolean alterar(ClientesDTO clientesDTO){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.alterar(clientesDTO);
    }
    public boolean excluir(ClientesDTO clientesDTO){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.excluir(clientesDTO);
    }
    public ClientesDTO procurarPorCodigo(ClientesDTO clientesDTO){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.procurarPorCodigo(clientesDTO);
    }
    public ClientesDTO procurarPorDescricao(ClientesDTO clientesDTO){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.procurarPorDescricao(clientesDTO);
    }
    public boolean existe(ClientesDTO clientesDTO){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.existe(clientesDTO);

    }
    public List<ClientesDTO> PesquisarTodos(){
        ClientesDAO clientesDAO = new ClientesDAO();
        return clientesDAO.pesquisarTodos();
    }
}
