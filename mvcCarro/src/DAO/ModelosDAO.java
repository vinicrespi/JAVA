/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.MarcaDTO;
import DTO.ModelosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mvccarro.Conexao;

/**
 *
 * @author 110000636
 */
public class ModelosDAO {

    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "modelos";

    public boolean inserir(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "INSERT INTO " + NOMEDATABELA + " (Marca_marca_cod,mod_desc) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, modelosDTO.getMarca().getMarca_cod());
            ps.setString(2, modelosDTO.getMod_desc());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        }catch(Exception e)
        {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }


    }

    public boolean alterar(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA + " SET Marca_marca_cod = ?, mod_desc = ? WHERE mod_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, modelosDTO.getMarca().getMarca_cod());
            ps.setString(2, modelosDTO.getMod_desc());
            ps.setInt(3, modelosDTO.getMod_cod());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;

        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE mod_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, modelosDTO.getMod_cod());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        }catch(Exception e)
        {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
    }

    public ModelosDTO procurarPorCodigo(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE mod_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, modelosDTO.getMod_cod());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                ModelosDTO obj = new ModelosDTO();
                obj.setMod_cod(rs.getInt(1));
                obj.getMarca().setMarca_cod(rs.getInt(2));
                obj.setMarca(buscarMarca(obj));
                obj.setMod_desc(rs.getString(3));
                ps.close();
                ps.close();
                conn.close();
                return obj;
            }
            else
            {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }



        public ModelosDTO procurarPorDescricao(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE mod_desc = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, modelosDTO.getMod_desc());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                ModelosDTO obj = new ModelosDTO();
                obj.setMod_cod(rs.getInt(1));
                obj.getMarca().setMarca_cod(rs.getInt(2));
                obj.setMarca(buscarMarca(obj));
                obj.setMod_desc(rs.getString(3));
                ps.close();
                ps.close();
                conn.close();
                return obj;
            }
            else
            {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }

        public List<ModelosDTO> pesquisarTodos(){
            try{
                Connection conn = Conexao.conectar(NOMEDOBANCO);
                String sql = "SELECT * FROM " + NOMEDATABELA + ";";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                List<ModelosDTO> listObj = montarLista(rs);
                return listObj;
            }catch(Exception e)
            {
                System.err.println("Erro: " + e.toString());
                e.printStackTrace();
                return null;
            }
        }

        public boolean existe(ModelosDTO modelosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE mod_desc = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, modelosDTO.getMod_desc());
            ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            ps.close();
            rs.close();
            conn.close();
            return true;
        }
    }catch(Exception e)
        {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
        return false;
    }

        public List<ModelosDTO> montarLista(ResultSet rs){
            List<ModelosDTO> listObj = new ArrayList<ModelosDTO>();
            try{
                while(rs.next())
                {
                    ModelosDTO obj = new ModelosDTO();
                    obj.setMod_cod(rs.getInt(1));
                    obj.getMarca().setMarca_cod(rs.getInt(2));
                    obj.setMarca(buscarMarca(obj));
                    obj.setMod_desc(rs.getString(3));
                    listObj.add(obj);
                }
                return listObj;
            }catch(Exception e)
            {
                System.err.println("Erro: " + e.toString());
                e.printStackTrace();
                return null;
            }
        }

        public MarcaDTO buscarMarca(ModelosDTO modelosDTO){
            MarcaDTO marcaDTO = new MarcaDTO();
            marcaDTO.setMarca_cod(modelosDTO.getMarca().getMarca_cod());
            MarcaDAO marcaDAO = new MarcaDAO();
            marcaDTO = marcaDAO.procurarPorCodigo(marcaDTO);
            return marcaDTO;
        }


}
