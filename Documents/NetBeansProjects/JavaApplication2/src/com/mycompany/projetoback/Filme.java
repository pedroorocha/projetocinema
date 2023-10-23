/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback;

/**
 *
 * @author pedro
 */
public class Filme {
    private String nome;
    private String genero;
    private int classificação;

    public Filme(String nome, String genero, int classificação) {
        this.nome = nome;
        this.genero = genero;
        this.classificação = classificação;
    }
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificação() {
        return classificação;
    }

    public void setClassificação(int classificação) {
        this.classificação = classificação;
    }
    
}
