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
public class Sessão {
    private int id;
    private String nome;
    private String horario;
    private ArrayList<Filme> listaDeFilmes;
    private ArrayList<Boolean> poltronas;

    public Sessão() {
        listaDeFilmes = new ArrayList();
        poltronas = new ArrayList();
        this.iniciaPoltronas();
    }    
    public Sessão(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        listaDeFilmes = new ArrayList();
        poltronas = new ArrayList();
        this.iniciaPoltronas();
    }
    
    
    public void iniciaPoltronas(){
        for(int i =0;i<29;i++){
            boolean f = false;
            poltronas.add(f);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public void setListaDeFilmes(ArrayList<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }

    public ArrayList<Boolean> getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(ArrayList<Boolean> poltronas) {
        this.poltronas = poltronas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
