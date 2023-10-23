/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback;

/**
 *
 * @author pedro
 */
public class SessõesDeFilmes {
    private int id;
    private String sessao;
    private String horario;
    private String filme;

    public SessõesDeFilmes() {
    }

    
    public SessõesDeFilmes(String sessao, String horario, String filme) {
        this.sessao = sessao;
        this.horario = horario;
        this.filme = filme;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
