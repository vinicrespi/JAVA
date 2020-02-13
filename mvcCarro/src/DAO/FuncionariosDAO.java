/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.FuncionariosDTO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mvccarro.Conexao;
import util.DataUtil;

/**
 *
 * @author 110000636
 */
public class FuncionariosDAO {

    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "funcionarios";

    public boolean inserir (FuncionariosDTO funcionariosDTO){

        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "INSERT INTO " + NOMEDATABELA + " (func_nome,func_end,func_bairro,func_cidade,func_cep,func_uf,func_fone,func_email,func_datanasc,func_sexo) VALUES (?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionariosDTO.getFunc_nome());
            ps.setString(2, funcionariosDTO.getFunc_end());
            ps.setString(3, funcionariosDTO.getFunc_bairro());
            ps.setString(4, funcionariosDTO.getFunc_cidade());
            ps.setString(5, funcionariosDTO.getFun_cep());
            ps.setString(6, funcionariosDTO.getFun_uf());
            ps.setString(7, funcionariosDTO.getFunc_fone());
            ps.setString(8, funcionariosDTO.getFunc_email());
            ps.setString(9, DataUtil.DataForStringMySQL(funcionariosDTO.getFunc_datanasc()));
            ps.setString(10, funcionariosDTO.getFunc_sexo()+"");
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

    public boolean alterar(FuncionariosDTO funcionariosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA + " SET func_nome = ?, func_end = ?, func_bairro = ?, func_cidade = ?, func_cep = ?, func_uf = ?, func_fone = ?, func_email = ?, func_datanasc = ?, func_sexo = ? WHERE func_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionariosDTO.getFunc_nome());
            ps.setString(2, funcionariosDTO.getFunc_end());
            ps.setString(3, funcionariosDTO.getFunc_bairro());
            ps.setString(4, funcionariosDTO.getFunc_cidade());
            ps.setString(5, funcionariosDTO.getFun_cep());
            ps.setString(6, funcionariosDTO.getFun_uf());
            ps.setString(7, funcionariosDTO.getFunc_fone());
            ps.setString(8, funcionariosDTO.getFunc_email());
            ps.setString(9, DataUtil.DataForStringMySQL(funcionariosDTO.getFunc_datanasc()));
            ps.setString(10, funcionariosDTO.getFunc_sexo());
            ps.setInt(11, funcionariosDTO.getFunc_cod());
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

    public boolean excluir(FuncionariosDTO funcionariosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sqp = "DELETE FROM " +NOMEDATABELA + " WHERE func_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sqp);
            ps.setInt(1, funcionariosDTO.getFunc_cod());
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

    public boolean existe(FuncionariosDTO funcionariosDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE func_nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionariosDTO.getFunc_nome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
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


    public FuncionariosDTO procurarPorCodigo(FuncionariosDTO funcionariosDTO){

        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE func_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,funcionariosDTO.getFunc_cod());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                FuncionariosDTO obj = new FuncionariosDTO();
                obj.setFunc_cod(rs.getInt(1));
                obj.setFunc_nome(rs.getString(2));
                obj.setFunc_end(rs.getString(3));
                obj.setFunc_bairro(rs.getString(4));
                obj.setFunc_cidade(rs.getString(5));
                obj.setFun_cep(rs.getString(6));
                obj.setFun_uf(rs.getString(7));
                obj.setFunc_fone(rs.getString(8));
                obj.setFunc_email(rs.getString(9));
                obj.setFunc_datanasc(rs.getTimestamp(10));
                obj.setFunc_sexo(rs.getString(11));
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

       public FuncionariosDTO procurarPorDescricao(FuncionariosDTO funcionariosDTO){

        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE func_nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,funcionariosDTO.getFunc_cod());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                FuncionariosDTO obj = new FuncionariosDTO();
                obj.setFunc_cod(rs.getInt(1));
                obj.setFunc_nome(rs.getString(2));
                obj.setFunc_end(rs.getString(3));
                obj.setFunc_bairro(rs.getString(4));
                obj.setFunc_cidade(rs.getString(5));
                obj.setFun_cep(rs.getString(6));
                obj.setFun_uf(rs.getString(7));
                obj.setFunc_fone(rs.getString(8));
                obj.setFunc_email(rs.getString(9));
                obj.setFunc_datanasc(rs.getTimestamp(10));
                obj.setFunc_sexo(rs.getString(11));
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


       public List<FuncionariosDTO> pesquisarTodos(){
           try{
               Connection conn = Conexao.conectar(NOMEDOBANCO);
               String sql = "SELECT * FROM " + NOMEDATABELA + ";";
               PreparedStatement ps = conn.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               List<FuncionariosDTO> listObj = montarLista(rs);
               return listObj;
           }catch(Exception e){
               System.err.println("Erro: " + e.toString());
               e.printStackTrace();
               return null;
           }
    }

       public List<FuncionariosDTO> montarLista(ResultSet rs){
           List<FuncionariosDTO> listObj = new ArrayList<FuncionariosDTO>();
           try{
               while(rs.next()){
                   FuncionariosDTO obj = new FuncionariosDTO();
                   obj.setFunc_cod(rs.getInt(1));
                   obj.setFunc_nome(rs.getString(2));
                   obj.setFunc_end(rs.getString(3));
                   obj.setFunc_bairro(rs.getString(4));
                   obj.setFunc_cidade(rs.getString(5));
                   obj.setFun_cep(rs.getString(6));
                   obj.setFun_uf(rs.getString(7));
                   obj.setFunc_fone(rs.getString(8));
                   obj.setFunc_email(rs.getString(9));
                   obj.setFunc_datanasc(rs.getTimestamp(10));
                   obj.setFunc_sexo(rs.getString(11));
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
