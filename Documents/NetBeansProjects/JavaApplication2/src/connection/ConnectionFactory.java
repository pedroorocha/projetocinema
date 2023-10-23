/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author pedro
 */
public class ConnectionFactory {
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/clientes";
    private static final String USER = "root";
    private static final String PASS ="123456";
    
    public static Connection getConnection(){
        
        try{
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("erro na conexão", ex);
    } 
}
    
    public static void closeConnection(Connection com){        
            try {
                if(com != null){
                com.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
     public static void closeConnection(Connection com, PreparedStatement stmt){        
         closeConnection(com);   
         
         try {
                if(stmt != null){
                stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
     public static void closeConnection(Connection com, PreparedStatement stmt, ResultSet rs){        
         closeConnection(com);   
         
         try {
                if(rs != null){
                rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
