/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvccarro;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 110000636
 */
public class Conexao {

    public static Connection conectar (String carros)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+carros;
            return DriverManager.getConnection(url,"root","root");
        }catch(Exception e)
        {
            System.err.println("Erro: "+e.toString());
            e.printStackTrace();
            return null;
        }
    }

}
