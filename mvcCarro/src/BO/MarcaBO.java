/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import DAO.MarcaDAO;
import DTO.MarcaDTO;
import java.util.List;

/**
 *
 * @author 110000636
 */
public class MarcaBO {

    public boolean inserir(MarcaDTO marcaDTO)
    {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.inserir(marcaDTO);
        return true;
    }

    public boolean alterar(MarcaDTO marcaDTO)
    {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.alterar(marcaDTO);
        return true;
    }

    public boolean excluir(MarcaDTO marcaDTO)
    {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.excluir(marcaDTO);
        return true;
    }

    public List<MarcaDTO> pesquisar()
    {
        List<MarcaDTO> lista;
        MarcaDAO marcaDAO = new MarcaDAO();
        lista = marcaDAO.pesquisar();
        return lista;
    }
    public MarcaDTO procurarPorCodigo(MarcaDTO marcaDTO)
    {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDTO = marcaDAO.procurarPorCodigo(marcaDTO);
        return marcaDTO;
    }
        public MarcaDTO procurarPorDescricao(MarcaDTO marcaDTO)
    {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDTO = marcaDAO.procurarPorDescricao(marcaDTO);
        return marcaDTO;
    }





}
