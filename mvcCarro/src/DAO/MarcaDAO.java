/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.MarcaDTO;
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
public class MarcaDAO {

    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "marcas";

    public boolean  inserir(MarcaDTO marcaDTO)
    {
        {
            try{
                Connection conn = Conexao.conectar(NOMEDOBANCO);
                String sql = "INSERT INTO " + NOMEDATABELA +" (marca_desc) VALUES (?);";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, marcaDTO.getMarca_desc());
                ps.executeUpdate();
                ps.close();
                conn.close();
                return true;
            }catch(Exception e)
            {
                System.err.println("Erro: "+e.toString());
                e.printStackTrace();
                return false;
            }
        }
    }
    public boolean alterar(MarcaDTO marcaDTO)
    {
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA +" SET marca_desc = ? WHERE marca_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marcaDTO.getMarca_desc());
            ps.setInt(2, marcaDTO.getMarca_cod());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        }catch(Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return false;
        }
    }
    public MarcaDTO procurarPorCodigo(MarcaDTO marcaDTO)
    {
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marcaDTO.getMarca_cod());

            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                MarcaDTO Registro = new MarcaDTO();
                Registro.setMarca_cod(rs.getInt(1));
                Registro.setMarca_desc(rs.getString(2));
                ps.close();
                rs.close();
                return Registro;
            }
            else
            {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e)
        {
            return null;
        }
    }
        public MarcaDTO procurarPorDescricao(MarcaDTO marcaDTO)
    {
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca_desc = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marcaDTO.getMarca_desc());

            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                MarcaDTO Registro = new MarcaDTO();
                Registro.setMarca_cod(rs.getInt(1));
                Registro.setMarca_desc(rs.getString(2));
                ps.close();
                rs.close();
                return Registro;
            }
            else
            {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e)
        {
            return null;
        }
    }
    public boolean excluir(MarcaDTO marcaDTO)
    {
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE marca_cod = ? ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            return true;

        }catch(Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return false;
        }
    }
    public List<MarcaDTO> montarlista (ResultSet rs)
    {
        List<MarcaDTO> listModel = new ArrayList<MarcaDTO>();
        try{
            while(rs.next())
            {
                MarcaDTO registro = new MarcaDTO();
                registro.setMarca_cod(rs.getInt(1));
                registro.setMarca_desc(rs.getString(2));
                listModel.add(registro);
            }
            return listModel;
        }catch(Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return null;
        }
    }
    public List<MarcaDTO> pesquisar()
    {
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<MarcaDTO> listRegistro = montarlista(rs);
            ps.close();
            rs.close();
            conn.close();

            return listRegistro;
        }catch(Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return null;
        }
    }

}
