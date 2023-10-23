/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback.DAO;
import com.mycompany.projetoback.Cliente;
import java.util.ArrayList;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author pedro
 */
public class ClienteDao {
    
    public void create(Cliente p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt  = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO dados(nome,idade,tipo,senha) VALUES(?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getIdade());
            stmt.setBoolean(3, p.getTipo());
            stmt.setString(4, p.getSenha());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha no casdatro");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
            
    }
    
    public ArrayList<Cliente> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> clientes = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM dados");
            rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setTipo(rs.getBoolean("tipo"));
                clientes.add(cliente);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "não rolou!");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }
    
    
    public boolean verificaLogin(String nome, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try{
            stmt = con.prepareStatement("SELECT * FROM dados where nome=? and senha=?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if(rs.next()){
                check =true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "não rolou!");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
    

    public boolean nomeEsenhaIguais(Cliente cliente, Cliente cliente2){
        return cliente.getNome().equals(cliente2.getNome()) && cliente.getSenha().equals(cliente2.getSenha());
    }
    
    private boolean registrosIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getNome().equals(clienteAComparar.getNome());
    }
}
