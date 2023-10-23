/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback.DAO;

import com.mycompany.projetoback.Filme;
import com.mycompany.projetoback.Sessão;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mycompany.projetoback.SessõesDeFilmes;

/**
 *
 * @author pedro
 */
public class SessoesDeFilmesDao {
   
    public ArrayList<SessõesDeFilmes> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdmDAO d = new AdmDAO();
        ArrayList<SessõesDeFilmes> sessoes = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM sessoes");
            rs = stmt.executeQuery();
            while(rs.next()){
                SessõesDeFilmes sessao = new SessõesDeFilmes();
                sessao.setId(rs.getInt("id"));
                sessao.setFilme(rs.getString("filme"));
                sessao.setSessao(rs.getString("sessão"));
                sessao.setHorario(rs.getString("horario"));
                sessoes.add(sessao);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "não rolou!");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return sessoes;
    }
}
