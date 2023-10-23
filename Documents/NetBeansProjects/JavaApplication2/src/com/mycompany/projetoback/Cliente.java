/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback;

/**
 *
 * @author pedro
 */
public class Cliente {
    private String nome;
    private String senha;
    private int idade;
    private boolean tipo;
    private int id;
    
    public Cliente() {
        this.nome = "";
        this.idade = 0;
        this.tipo = false;
        this.senha = "";
    }
    
    public Cliente(String nome, String senha, int idade, boolean tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.senha = senha;
    }

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
