/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Adm {
    private String login;
    private String senha;
    private ArrayList<Sessão> listaDeSessões;

    public Adm(String login, String senha) {
        this.login = login;
        this.senha = senha;
        listaDeSessões = new ArrayList();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
