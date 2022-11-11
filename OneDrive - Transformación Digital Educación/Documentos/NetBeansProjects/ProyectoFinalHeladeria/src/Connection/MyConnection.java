/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author A19B47948
 */
public class MyConnection {
    
    public static Connection getConnection(){
            Connection con = null;
        
       try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaheladeria", "root", "castillo");
       } catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex.getMessage());
       }
        return con;
    }
    
}

