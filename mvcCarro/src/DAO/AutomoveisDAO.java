/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.AutomoveisDTO;
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
public class AutomoveisDAO {

    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "automoveis";

    public boolean inserir(AutomoveisDTO automoveisDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "INSERT INTO " + NOMEDATABELA + " (aut_placa, Modelos_mod_cod, aut_ano, aut_preco, aut_cor, aut_combustivel, aut_km, aut_arcondicionado, aut_vidroeletrico, aut_airbag, aut_travaeletrica, aut_alarme, aut_desembacador, aut_rodaliga, aut_volantehidraulico, aut_arquente, aut_abs, aut_cambioaut, aut_cdplayer, aut_isufilm, aut_limpadortraseiro, aut_outros, aut_vendido) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, automoveisDTO.getAut_placa());
        ps.setInt(2, automoveisDTO.getModelo().getMod_cod());
        ps.setInt(3, automoveisDTO.getAut_ano());
        ps.setDouble(4, automoveisDTO.getAut_preco());
        ps.setString(5, automoveisDTO.getAut_cor());
        ps.setString(6, automoveisDTO.getAut_combustivel());

            ps.setDouble(7, automoveisDTO.getAut_km());
            ps.setInt(8, automoveisDTO.getAut_arcondicionado());
            ps.setInt(9, automoveisDTO.getAut_vidroeletrico());
            ps.setInt(10, automoveisDTO.getAut_airbag());
            ps.setInt(11, automoveisDTO.getAut_travaeletrica());
            ps.setInt(12, automoveisDTO.getAut_alarme());
            ps.setInt(13, automoveisDTO.getAut_desembacador());
            ps.setInt(14, automoveisDTO.getAut_rodaliga());
            ps.setInt(15, automoveisDTO.getAut_volantehidraulico());
            ps.setInt(16, automoveisDTO.getAut_arquente());
            ps.setInt(17, automoveisDTO.getAut_abs());
            ps.setInt(18, automoveisDTO.getAut_cambioaut());
            ps.setInt(19, automoveisDTO.getAut_cdplayer());
            ps.setInt(20, automoveisDTO.getAut_isufilm());
            ps.setInt(21, automoveisDTO.getAut_limpadortraseiro());
            ps.setString(22, automoveisDTO.getAut_outros());
            ps.setInt(23, automoveisDTO.getAut_vendido());
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

    public boolean alterar(AutomoveisDTO automoveisDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA + " SET Modelos_mod_cod = ?, aut_ano = ?, aut_preco = ?, aut_cor = ?, aut_combustivel = ?, aut_km = ?, aut_arcondicionado = ?, aut_vidroeletrico = ?, aut_airbag = ?, aut_travaeletrica = ?, aut_alarme = ?, aut_desembacador = ?, aut_rodaliga = ?, aut_volantehidraulico = ?, aut_arquente = ?, aut_abs = ?, aut_cambioaut = ?, aut_cdplayer = ?, aut_isufilm = ?, aut_limpadortraseiro = ?, aut_outros = ?, aut_vendido = ? WHERE aut_placa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, automoveisDTO.getModelo().getMod_cod());
            ps.setInt(2, automoveisDTO.getAut_ano());
            ps.setDouble(3, automoveisDTO.getAut_preco());
            ps.setString(4, automoveisDTO.getAut_cor());
            ps.setString(5, automoveisDTO.getAut_combustivel());
            ps.setDouble(6, automoveisDTO.getAut_km());
                
                ps.setInt(7, automoveisDTO.getAut_arcondicionado());
                ps.setInt(8, automoveisDTO.getAut_vidroeletrico());
                ps.setInt(9, automoveisDTO.getAut_airbag());
                ps.setInt(10, automoveisDTO.getAut_travaeletrica());
                ps.setInt(11, automoveisDTO.getAut_alarme());
                ps.setInt(12, automoveisDTO.getAut_desembacador());
                ps.setInt(13, automoveisDTO.getAut_rodaliga());
                ps.setInt(14, automoveisDTO.getAut_volantehidraulico());
                ps.setInt(15, automoveisDTO.getAut_arquente());
                ps.setInt(16, automoveisDTO.getAut_abs());
                ps.setInt(17, automoveisDTO.getAut_cambioaut());
                ps.setInt(18, automoveisDTO.getAut_cdplayer());
                ps.setInt(19, automoveisDTO.getAut_isufilm());
                ps.setInt(20, automoveisDTO.getAut_limpadortraseiro());
                ps.setString(21, automoveisDTO.getAut_outros());
                ps.setInt(22, automoveisDTO.getAut_vendido());
                ps.setString(23, automoveisDTO.getAut_placa());
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

    public boolean excluir(AutomoveisDTO automoveisDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE aut_placa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, automoveisDTO.getAut_placa());
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

    public AutomoveisDTO procurarPorPlaca(AutomoveisDTO automoveisDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE aut_placa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, automoveisDTO.getAut_placa());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                AutomoveisDTO obj = new AutomoveisDTO();
                obj.setAut_placa(rs.getString(1));
                obj.getModelo().setMod_cod(rs.getInt(2));
                obj.setModelo(buscarModelo(obj));
                obj.setAut_ano(rs.getInt(3));
                obj.setAut_preco(rs.getDouble(4));
                obj.setAut_cor(rs.getString(5));
                obj.setAut_combustivel(rs.getString(6));
                obj.setAut_km(rs.getDouble(7));
                obj.setAut_arcondicionado(rs.getInt(8));
                obj.setAut_vidroeletrico(rs.getInt(9));
                obj.setAut_airbag(rs.getInt(10));
                obj.setAut_travaeletrica(rs.getInt(11));
                obj.setAut_alarme(rs.getInt(12));
                obj.setAut_desembacador(rs.getInt(13));
                obj.setAut_rodaliga(rs.getInt(14));
                obj.setAut_volantehidraulico(rs.getInt(15));
                obj.setAut_arquente(rs.getInt(16));
                obj.setAut_abs(rs.getInt(17));
                obj.setAut_cambioaut(rs.getInt(18));
                obj.setAut_cdplayer(rs.getInt(19));
                obj.setAut_isufilm(rs.getInt(20));
                obj.setAut_limpadortraseiro(rs.getInt(21));
                obj.setAut_outros(rs.getString(22));
                obj.setAut_vendido(rs.getInt(23));
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

    public boolean existe(AutomoveisDTO automoveisDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE aut_placa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, automoveisDTO.getAut_placa());
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

    public List<AutomoveisDTO> pesquisarTodos(){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<AutomoveisDTO> listObj = montarLista(rs);
            return listObj;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }

    public List<AutomoveisDTO> montarLista(ResultSet rs){
        List<AutomoveisDTO> listObj = new ArrayList<AutomoveisDTO>();
        try{
            while(rs.next()){
                AutomoveisDTO obj = new AutomoveisDTO();
                obj.setAut_placa(rs.getString(1));
                obj.getModelo().setMod_cod(rs.getInt(2));
                obj.setModelo(buscarModelo(obj));
                obj.setAut_ano(rs.getInt(3));
                obj.setAut_preco(rs.getInt(4));
                obj.setAut_cor(rs.getString(5));
                obj.setAut_combustivel(rs.getString(6));
                obj.setAut_km(rs.getDouble(7));
                obj.setAut_arcondicionado(rs.getInt(8));
              obj.setAut_vidroeletrico(rs.getInt(9));
              obj.setAut_airbag(rs.getInt(10));
              obj.setAut_travaeletrica(rs.getInt(11));
              obj.setAut_alarme(rs.getInt(12));
              obj.setAut_desembacador(rs.getInt(13));
              obj.setAut_rodaliga(rs.getInt(14));
              obj.setAut_volantehidraulico(rs.getInt(15));
              obj.setAut_arquente(rs.getInt(16));
              obj.setAut_abs(rs.getInt(17));
              obj.setAut_cambioaut(rs.getInt(18));
              obj.setAut_cdplayer(rs.getInt(19));
              obj.setAut_isufilm(rs.getInt(20));
              obj.setAut_limpadortraseiro(rs.getInt(21));
              obj.setAut_outros(rs.getString(22));
              obj.setAut_vendido(rs.getInt(23));
              listObj.add(obj);
              
        }
            return listObj;
    }catch(Exception e){
        System.err.println("Erro: " + e.toString());
        e.printStackTrace();
        return null;
    }
}

    
    
    
    
    
    
    public ModelosDTO buscarModelo(AutomoveisDTO automoveisDTO){
        ModelosDTO modelosDTO = new ModelosDTO();
        modelosDTO.setMod_cod(automoveisDTO.getModelo().getMod_cod());
        ModelosDAO modelosDAO = new ModelosDAO();
        modelosDTO = modelosDAO.procurarPorCodigo(modelosDTO);
        return modelosDTO;
    }
}
