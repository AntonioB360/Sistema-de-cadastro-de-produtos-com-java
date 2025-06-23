/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author T
 */
public class Conexao {
    private static final String url="jdbc:mysql://localhost:3306/super_descontos";
    private static final String user="root";
    private static final String senha="";
    
    
    public static Connection conectar() throws SQLException{
     
        
      return DriverManager.getConnection(url, user, senha);
    }
    
}
