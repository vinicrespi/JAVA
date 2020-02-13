/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;


import DTO.FichaDTO;
import exaplicacaoin232.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 109005138
 */
public class FichaDAO {

    final String NOMEDOBANCO = "bdcadastro";
    final String NOMEDATABELA = "ficha";

    public boolean inserir(FichaDTO fichaDTO){

        if(existe(fichaDTO) != true)
        {
            try{
                Connection conn = Conexao.conectar(NOMEDATABELA);
                String sql = "INSERT INTO" + NOMEDATABELA + "(matricula,nome)" +"VALUES (?,?);";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,fichaDTO.getMatricula());
                ps.setString(2,fichaDTO.getNome());

                ps.executeUpdate();
                ps.close();
                conn.close();

                return true;
            }catch(Exception e){
                System.err.println("Erro"+ e.toString());
                e.printStackTrace();
                return false;
            }//fim da catch
        }//fim do if

        return false;
    }//fim do metódo

    public boolean existe (FichaDTO fichaDTO){

        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM"+NOMEDATABELA+" WHERE matricula=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,fichaDTO.getMatricula());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                ps.close();
                rs.close();
                conn.close();

                return true;
            }
        }catch(Exception e){
            System.err.println("Erro :" +e.toString());
            e.printStackTrace();
            return false;
        }
        return false;
        }


    public boolean alterar(FichaDTO fichaDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "UPDATE "+ NOMEDATABELA+"SET matricuça =?, nome=?"+"WHERE matricula =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.close();
            conn.close();
            return true;
        }catch(Exception e){
            System.err.println("Erro :"+e.toString());
            e.printStackTrace();
            return false;
        }
    } //fim do metodo

    public FichaDTO procurar (FichaDTO fichaDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM "+ NOMEDATABELA +"WHERE matricula =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,fichaDTO.getMatricula());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                FichaDTO Registro = new FichaDTO();
                Registro.setMatricula(rs.getInt(1));
                Registro.setNome(rs.getString(2));
                ps.close();
                rs.close();

                return Registro;
            }else{
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        }catch(Exception e){
            return null;
        }

    } //fim do metodo

    public boolean excluir (FichaDTO fichaDTO){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "DELETE FROM "+ NOMEDATABELA +" WHERE matricula=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,fichaDTO.getMatricula());
            ps.executeUpdate();
            ps.close();
            return true;
        }
        catch(Exception e){
            System.err.println("Erro :" +e.toString());
            e.printStackTrace();
            return false;

        }

        }//fim do metodo

    public List<FichaDTO> montarlista (ResultSet rs){

        List<FichaDTO> listModel = new ArrayList<FichaDTO>();
        try{
            while(rs.next()){
                FichaDTO registro = new FichaDTO(); //cria o objeto registro -sets
                registro.setMatricula(rs.getInt(1));
                registro.setNome(rs.getString(2));
                listModel.add(registro); //adiciona o regisro no listModel
            }
            return listModel;
        }catch (Exception e){
            System.err.println("Erro :"+e.toString());
            e.printStackTrace();
            return null;

            }
        }//fim do metodo

    public List<FichaDTO> pesquisar(){
        try{
            Connection conn = Conexao.conectar(NOMEDOBANCO);
            String sql = "SELECT * FROM"+ NOMEDATABELA +";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<FichaDTO> listRegistro = montarlista(rs);
            ps.close();
            rs.close();
            conn.close();
            return listRegistro;
        }catch(Exception e)
        {
            System.err.println("Erro : "+e.toString());
            e.printStackTrace();
            return null;
        }//fim do metodo
        } // fim do classe fichaDAO
    }










            
        
    


