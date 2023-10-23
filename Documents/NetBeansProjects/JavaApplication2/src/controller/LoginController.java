/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import com.mycompany.projetoback.Login;
import com.mycompany.projetoback.Cliente;
import controller.helpers.LoginHelper;
import com.mycompany.projetoback.DAO.ClienteDao;
import com.mycompany.projetoback.TelaDeUsuario;
import com.mycompany.projetoback.Adm;
import com.mycompany.projetoback.DAO.AdmDAO;
import com.mycompany.projetoback.TelaDoAdmin;
import com.mycompany.projetoback.TelaDeCadastro;
/**
 *
 * @author pedro
 */
public class LoginController {
    private final Login view;
    private int id;
    private final LoginHelper helper;
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entradaNoSistemaUsuario(){   
            //entrar no menu de usuario
            TelaDeUsuario teladeusuario = new TelaDeUsuario();
            teladeusuario.setSize(705, 415);
            teladeusuario.setVisible(true);
            this.view.dispose();
        
    }
    
    
    public void entradaNoSistemaAdm(){   
            TelaDoAdmin telaDoAdmin = new TelaDoAdmin();
            telaDoAdmin.setVisible(true);
            this.view.dispose();
    }
    
    public void mostraTelaDeCadastro(){
        TelaDeCadastro tela = new TelaDeCadastro();
        tela.setVisible(true);
    }
    
    public void fiz(){
        System.out.println("Seu texto  inserido aqui, entre aspas duplas");
        
        this.view.exibeMensagem("nçao deu chapa");
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}