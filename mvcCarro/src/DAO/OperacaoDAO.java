/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AutomoveisDTO;
import DTO.ClientesDTO;
import DTO.FuncionariosDTO;
import DTO.OperacaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mvccarro.Conexao;
import util.DataUtil;

/**
 *
 * @author Vinicius
 */
public class OperacaoDAO {
    
    final String NOMEDOBANCO = "carros";
    final String NOMEDATABELA = "operacao";
    
    public boolean inserir(OperacaoDTO operacaoDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "INSERT INTO " + NOMEDATABELA + " (CLientes_cli_cod, Funcionarios_func_cod, Automoveis_aut_placa, opr_data, opr_hora, opr_tipo) VALUES (?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, operacaoDTO.getCliente().getCli_cod());
            ps.setInt(2, operacaoDTO.getFuncionario().getFunc_cod());
            ps.setString(3, operacaoDTO.getAutomovel().getAut_placa());
            ps.setString(4, DataUtil.DataForStringMySQL(operacaoDTO.getOpr_data()));
            ps.setString(5, DataUtil.DataHoraForStringMySQLHoraDia(operacaoDTO.getOpr_hora()));
            ps.setString(6, operacaoDTO.getOpr_tipo());
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
    
    public boolean alterar(OperacaoDTO operacaoDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE " + NOMEDATABELA + " SET Clientes_cli_cod = ?, Funcionarios_func_cod = ?, Automoveis_aut_placa = ?, opr_data = ?, opr_hora = ?, opr_tipo = ? WHERE opr_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, operacaoDTO.getCliente().getCli_cod());
            ps.setInt(2, operacaoDTO.getFuncionario().getFunc_cod());
            ps.setString(3, operacaoDTO.getAutomovel().getAut_placa());
            ps.setString(4, DataUtil.DataForStringMySQL(operacaoDTO.getOpr_data()));
            ps.setString(5, DataUtil.DataHoraForStringMySQLHoraDia(operacaoDTO.getOpr_hora()));
            ps.setString(6, operacaoDTO.getOpr_tipo());
            ps.setInt(7, operacaoDTO.getOpr_cod());
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
    
    public boolean excluir(OperacaoDTO operacaoDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE opr_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, operacaoDTO.getOpr_cod());
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
    
    public OperacaoDTO procurarPorCodigo(OperacaoDTO operacaoDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE opr_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, operacaoDTO.getOpr_cod());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                OperacaoDTO obj = new OperacaoDTO();
                obj.setOpr_cod(rs.getInt(1));
                obj.getCliente().setCli_cod(rs.getInt(2));
                obj.setCliente(buscarCliente(obj));
                obj.getFuncionario().setFunc_cod(rs.getInt(3));
                obj.setFuncionario(buscarFuncionario(obj));
                obj.getAutomovel().setAut_placa(rs.getString(4));
                obj.setAutomovel(buscarAutomovel(obj));
                obj.setOpr_data(rs.getTimestamp(5));
                obj.setOpr_hora(rs.getTimestamp(6));
                obj.setOpr_tipo(rs.getString(7));
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
    
    public boolean existe(OperacaoDTO operacaoDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE opr_cod = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, operacaoDTO.getOpr_cod());
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
    
    public List<OperacaoDTO> pesquisarTodos(){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<OperacaoDTO> listObj = montarLista(rs);
            return listObj;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
            
        }
    }
    
    public List<OperacaoDTO> montarLista(ResultSet rs){
        List<OperacaoDTO> listObj = new ArrayList<OperacaoDTO>();
        try{
            while(rs.next()){
                OperacaoDTO obj = new OperacaoDTO();
                
                obj.setOpr_cod(rs.getInt(1));
                
                obj.getCliente().setCli_cod(rs.getInt(2));
                obj.setCliente(buscarCliente(obj));
                
                obj.getFuncionario().setFunc_cod(rs.getInt(3));
                obj.setFuncionario(buscarFuncionario(obj));
                
                obj.getAutomovel().setAut_placa(rs.getString(4));
                obj.setAutomovel(buscarAutomovel(obj));
                
                obj.setOpr_data(rs.getTimestamp(5));
                obj.setOpr_hora(rs.getTimestamp(6));
                obj.setOpr_tipo(rs.getString(7));
                listObj.add(obj);                
            }
            return listObj;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }




    public ClientesDTO buscarCliente(OperacaoDTO operacaoDTO){
        ClientesDTO clientesDTO = new ClientesDTO();
        clientesDTO.setCli_cod(operacaoDTO.getCliente().getCli_cod());
        ClientesDAO clientesDAO = new ClientesDAO();
        clientesDTO = clientesDAO.procurarPorCodigo(clientesDTO);
        return clientesDTO;
    }
    
    public FuncionariosDTO buscarFuncionario(OperacaoDTO operacaoDTO){
        FuncionariosDTO funcionariosDTO = new FuncionariosDTO();
        funcionariosDTO.setFunc_cod(operacaoDTO.getFuncionario().getFunc_cod());
        FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        funcionariosDTO = funcionariosDAO.procurarPorCodigo(funcionariosDTO);
        return funcionariosDTO;
    }
    
    public AutomoveisDTO buscarAutomovel(OperacaoDTO operacaoDTO){
        AutomoveisDTO automoveisDTO = new AutomoveisDTO();
        automoveisDTO.setAut_placa(operacaoDTO.getAutomovel().getAut_placa());
        AutomoveisDAO automoveisDAO = new AutomoveisDAO();
        automoveisDTO = automoveisDAO.procurarPorPlaca(automoveisDTO);
        return automoveisDTO;
    }
    
    public List<OperacaoDTO> buscaVendasPeriodo(Date inicio, Date fim){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE opr_data >= ? AND opr_data <= ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, DataUtil.DataForStringMySQL(inicio));
            ps.setString(2, DataUtil.DataForStringMySQL(fim));
            ResultSet rs = ps.executeQuery();
            List<OperacaoDTO> listObj = montarLista(rs);
            return listObj;
        }catch(Exception e){
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
            
        }
    }
}
