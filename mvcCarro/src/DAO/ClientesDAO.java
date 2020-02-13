/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mvccarro.Conexao;
import util.DataUtil;

/**
 *
 * @author 110000636
 */
public class ClientesDAO {

    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "clientes";

    public boolean inserir(ClientesDTO clientesDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "INSERT INTO " + NOMEDATABELA + " (cli_nome,cli_end,cli_bairro,cli_cidade,cli_cep,cli_uf,cli_fone,cli_email,cli_datanasc,cli_sexo) VALUES (?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, clientesDTO.getCli_nome());
            ps.setString(2, clientesDTO.getCli_end());
            ps.setString(3, clientesDTO.getCli_bairro());
            ps.setString(4, clientesDTO.getCli_cidade());
            ps.setString(5, clientesDTO.getCli_cep());
            ps.setString(6, clientesDTO.getCli_uf());
            ps.setString(7, clientesDTO.getCli_fone());
            ps.setString(8, clientesDTO.getCli_email());
            ps.setString(9, DataUtil.DataForStringMySQL(clientesDTO.getCli_datanasc()));
            ps.setString(10, clientesDTO.getCli_sexo()+"");
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

    public boolean alterar(ClientesDTO clientesDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA + " SET cli_nome = ?, cli_end = ?, cli_bairro = ?, cli_cidade = ?, cli_cep = ?, cli_uf = ?, cli_fone = ?, cli_email = ?, cli_datanasc = ?, cli_sexo = ? WHERE cli_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, clientesDTO.getCli_nome());
            ps.setString(2, clientesDTO.getCli_end());
            ps.setString(3, clientesDTO.getCli_bairro());
            ps.setString(4, clientesDTO.getCli_cidade());
            ps.setString(5, clientesDTO.getCli_cep());
            ps.setString(6, clientesDTO.getCli_uf());
            ps.setString(7, clientesDTO.getCli_fone());
            ps.setString(8, clientesDTO.getCli_email());
            ps.setString(9, DataUtil.DataForStringMySQL(clientesDTO.getCli_datanasc()));
            ps.setString(10, clientesDTO.getCli_sexo());
            ps.setInt(11, clientesDTO.getCli_cod());
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

    public boolean excluir(ClientesDTO clientesDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE cli_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, clientesDTO.getCli_cod());
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

    public ClientesDTO procurarPorCodigo(ClientesDTO clientesDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cli_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, clientesDTO.getCli_cod());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ClientesDTO obj = new ClientesDTO();
                obj.setCli_cod(rs.getInt(1));
                obj.setCli_nome(rs.getString(2));
                obj.setCli_end(rs.getString(3));
                obj.setCli_bairro(rs.getString(4));
                obj.setCli_cidade(rs.getString(5));
                obj.setCli_cep(rs.getString(6));
                obj.setCli_uf(rs.getString(7));
                obj.setCli_fone(rs.getString(8));
                obj.setCli_email(rs.getString(9));
                obj.setCli_datanasc(rs.getTimestamp(10));
                obj.setCli_sexo(rs.getString(11));
                rs.close();
                ps.close();
                conn.close();
                return obj;
            }else{
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }

public ClientesDTO procurarPorDescricao(ClientesDTO clientesDTO){
    try{
        Connection conn = Conexao.conectar(NOMEDOBANCO);
        String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cli_nome = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, clientesDTO.getCli_nome());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            ClientesDTO obj = new ClientesDTO();
            obj.setCli_cod(rs.getInt(1));
            obj.setCli_nome(rs.getString(2));
            obj.setCli_end(rs.getString(3));
            obj.setCli_bairro(rs.getString(4));
            obj.setCli_cidade(rs.getString(5));
            obj.setCli_cep(rs.getString(6));
            obj.setCli_uf(rs.getString(7));
            obj.setCli_fone(rs.getString(8));
            obj.setCli_email(rs.getString(9));
            obj.setCli_datanasc(rs.getTimestamp(10));
            obj.setCli_sexo(rs.getString(11));
            ps.close();
            rs.close();
            conn.close();
            return obj;
        }else{
            ps.close();
            rs.close();
            conn.close();
            return null;
        }
    }catch(Exception e){
        return null;
    }
}

public boolean existe(ClientesDTO clientesDTO){
    try{
        Connection conn = Conexao.conectar(NOMEDOBANCO);
        String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cli_nome = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, clientesDTO.getCli_nome());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            ps.close();
            rs.close();
            conn.close();
            return true;
        }
    }catch(Exception e){
        System.err.println("Erro: " + e.toString());
        e.printStackTrace();
        return false;
    }
    return false;
}

public List<ClientesDTO> pesquisarTodos(){
    try{
        Connection conn = Conexao.conectar(NOMEDOBANCO);
        String sql = "SELECT * FROM " + NOMEDATABELA + ";";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<ClientesDTO> listObj = montarLista(rs);
        return listObj;
    }catch(Exception e){
        System.err.println("Erro: " + e.toString());
        e.printStackTrace();
        return null;
    }
}

public List<ClientesDTO> montarLista(ResultSet rs){
    List<ClientesDTO> listObj = new ArrayList<ClientesDTO>();
    try{
        while(rs.next()){
            ClientesDTO obj = new ClientesDTO();
            obj.setCli_cod(rs.getInt(1));
            obj.setCli_nome(rs.getString(2));
            obj.setCli_end(rs.getString(3));
            obj.setCli_bairro(rs.getString(4));
            obj.setCli_cidade(rs.getString(5));
            obj.setCli_cep(rs.getString(6));
            obj.setCli_uf(rs.getString(7));
            obj.setCli_fone(rs.getString(8));
            obj.setCli_email(rs.getString(9));
            obj.setCli_datanasc(rs.getTimestamp(10));
            obj.setCli_sexo(rs.getString(11));
            listObj.add(obj);
        }
        return listObj;
    }catch(Exception e){
        System.err.println("Erro: " + e.toString());
        e.printStackTrace();
        return null;
    }

}



}
