/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback.DAO;
import com.mycompany.projetoback.Sessão;
import com.mycompany.projetoback.DAO.Banco;
import com.mycompany.projetoback.Filme;
import com.mycompany.projetoback.Cliente;
import com.mycompany.projetoback.SessõesDeFilmes;
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
public class SessãoDao {
    
    public void create(Sessão s){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt  = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO sessoes(sessão,horario,filme) VALUES(?,?,?)");
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getHorario());
            stmt.setString(3, s.getListaDeFilmes().get(0).getNome());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha no casdatro");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
            
    }
    
    public ArrayList<Sessão> lerPoltronas(){
        int i =0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdmDAO d = new AdmDAO();
        ArrayList<Sessão> sessoes = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM poltronas");
            rs = stmt.executeQuery();
            while(rs.next()){
                Sessão sessao = new Sessão();
                sessao.setId(rs.getInt("id"));
                sessao.setNome(rs.getString("sessão"));
                sessao.setHorario(rs.getString("horario"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona1"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona2"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona3"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona4"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona5"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona6"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona7"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona8"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona9"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona10"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona11"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona12"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona13"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona14"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona15"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona16"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona17"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona18"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona19"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona20"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona21"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona22"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona23"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona24"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona25"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona26"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona27"));
                sessao.getPoltronas().add(rs.getBoolean("poltrona28"));
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
    
    public void criarPoltronas(Sessão s){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt  = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO poltronas(sessão,horario,poltrona1,poltrona2,poltrona3,poltrona4,poltrona5,poltrona6,poltrona7,poltrona8,poltrona9,poltrona10,poltrona11,poltrona12,poltrona13,poltrona14,poltrona15,poltrona16,poltrona17,poltrona18,poltrona19,poltrona20,poltrona21,poltrona22,poltrona23,poltrona24,poltrona25,poltrona26,poltrona27,poltrona28) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getHorario());
            stmt.setBoolean(3, s.getPoltronas().get(0));
            stmt.setBoolean(4, s.getPoltronas().get(1));
            stmt.setBoolean(5, s.getPoltronas().get(2));
            stmt.setBoolean(6, s.getPoltronas().get(3));
            stmt.setBoolean(7, s.getPoltronas().get(4));
            stmt.setBoolean(8, s.getPoltronas().get(5));
            stmt.setBoolean(9, s.getPoltronas().get(6));
            stmt.setBoolean(10, s.getPoltronas().get(7));
            stmt.setBoolean(11, s.getPoltronas().get(8));
            stmt.setBoolean(12, s.getPoltronas().get(9));
            stmt.setBoolean(13, s.getPoltronas().get(10));
            stmt.setBoolean(14, s.getPoltronas().get(11));
            stmt.setBoolean(15, s.getPoltronas().get(12));
            stmt.setBoolean(16, s.getPoltronas().get(13));
            stmt.setBoolean(17, s.getPoltronas().get(14));
            stmt.setBoolean(18, s.getPoltronas().get(15));
            stmt.setBoolean(19, s.getPoltronas().get(16));
            stmt.setBoolean(20, s.getPoltronas().get(17));
            stmt.setBoolean(21, s.getPoltronas().get(18));
            stmt.setBoolean(22, s.getPoltronas().get(19));
            stmt.setBoolean(23, s.getPoltronas().get(20));
            stmt.setBoolean(24, s.getPoltronas().get(21));
            stmt.setBoolean(25, s.getPoltronas().get(22));
            stmt.setBoolean(26, s.getPoltronas().get(23));
            stmt.setBoolean(27, s.getPoltronas().get(24));
            stmt.setBoolean(28, s.getPoltronas().get(25));
            stmt.setBoolean(29, s.getPoltronas().get(26));
            stmt.setBoolean(30, s.getPoltronas().get(27));
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha no casdatro");
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
            
    }
    
    public Filme buscaFilme(String nome){
        for(int i = 0;i<Banco.listaDeSessões.size();i++){
            for(int j = 0;j<Banco.listaDeSessões.get(i).getListaDeFilmes().size();i++){
            if(Banco.listaDeSessões.get(i).getListaDeFilmes().get(j).getNome().equals(nome)){
                return Banco.listaDeSessões.get(i).getListaDeFilmes().get(j);
            }
            }
        }
        return null;
    }
    
    public ArrayList<Sessão> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdmDAO d = new AdmDAO();
        Filme f;
        ArrayList<Sessão> sessoes = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM sessoes");
            rs = stmt.executeQuery();
            while(rs.next()){
                Sessão sessao = new Sessão();
                f  = d.buscaFilme(rs.getString("filme"));
                sessao.setNome(rs.getString("sessão"));
                sessao.setId(rs.getInt("id"));
                sessao.setHorario(rs.getString("horario"));
                sessao.getListaDeFilmes().add(f);
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
    
    public void removerFilme(Filme filme){
        for(int i = 0;i<Banco.listaDeSessões.size();i++){
            for(int j = 0;j<Banco.listaDeSessões.get(i).getListaDeFilmes().size();i++){
            if(Banco.listaDeSessões.get(i).getListaDeFilmes().get(j) == filme){
                Banco.listaDeSessões.get(i).getListaDeFilmes().remove(Banco.listaDeSessões.get(i).getListaDeFilmes().get(j));
        }
        }

        }
    }
}