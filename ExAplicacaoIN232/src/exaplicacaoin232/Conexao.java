/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exaplicacaoin232;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 109005138
 */
public class Conexao {

    public static Connection conectar (String bdcadastro){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             String url = "jdbc:mysql://localhost/" + bdcadastro;
             return DriverManager.getConnection(url, "root","root");
        }catch (Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return null;


        }

    }

}
