/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback.DAO;
import java.util.ArrayList;
import com.mycompany.projetoback.Sessão;
import com.mycompany.projetoback.Filme;
import com.mycompany.projetoback.Adm;
import com.mycompany.projetoback.DAO.SessãoDao;

/**
 *
 * @author pedro
 */
public class Banco {
    public static ArrayList<Filme> listaDeFilmes;
    public static ArrayList<Sessão> listaDeSessões;
    public static ArrayList<Adm> listaDeAdms;
    public static ArrayList<String> horarios;
    public static ArrayList<String> sessoes;
    public static SessãoDao d;
    public static void inicia(){
    listaDeFilmes = new ArrayList();
    listaDeAdms = new ArrayList();
    listaDeSessões = new ArrayList();
    horarios = new ArrayList();
    sessoes = new ArrayList();
    d = new SessãoDao();
    listaDeSessões = d.ler();
    Adm admin = new Adm("adm", "adm");
    
    Filme filme2 = new Filme("Donnie darko", "drama", 14);
    Filme filme3 = new Filme("No contry for old man", "thriller", 16);
    Filme filme4 = new Filme("A chegada", "sci-fi", 14);
    Filme filme6 = new Filme("The room", "drama?", 18);
    listaDeAdms.add(admin);
    listaDeFilmes.add(filme2);
    listaDeFilmes.add(filme3);
    listaDeFilmes.add(filme4);
    listaDeFilmes.add(filme6);
    horarios.add("12:00");
    horarios.add("13:00");
    horarios.add("14:00");
    horarios.add("15:00");
    sessoes.add("sessão 1");
    sessoes.add("sessão 2");
    sessoes.add("sessão 3");
    sessoes.add("sessão 4");
    }

    public static ArrayList<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public static void setListaDeFilmes(ArrayList<Filme> listaDeFilmes) {
        Banco.listaDeFilmes = listaDeFilmes;
    }
    
    
    
}
