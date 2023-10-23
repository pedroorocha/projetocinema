/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helpers;
import com.mycompany.projetoback.Cliente;
import com.mycompany.projetoback.Login;
import com.mycompany.projetoback.Adm;
/**
 *
 * @author pedro
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Cliente obterModelo(){
        String nome = view.getUsuarioText().getText();
        String senha = view.getUsuarioPass().getText();
        Cliente cliente = new Cliente(nome, senha);
        return cliente;
    }
    public void setarModelo(Cliente cliente){
        String nome = cliente.getNome();
        String senha = cliente.getSenha();
        view.getUsuarioPass().getText();
        view.getUsuarioText().getText();
    }
    public Adm obterModeloAdm(){
        String nome = view.getUsuarioText().getText();
        String senha = view.getUsuarioPass().getText();
        Adm admin = new Adm(nome, senha);
        return admin;
    }
    public void setarModeloAdm(Adm admin){
        String nome = admin.getLogin();
        String senha = admin.getSenha();
        view.getUsuarioPass().getText();
        view.getUsuarioText().getText();
    }
    
}
