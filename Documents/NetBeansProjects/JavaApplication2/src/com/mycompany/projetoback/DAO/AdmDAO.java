/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoback.DAO;
import com.mycompany.projetoback.Adm;
import com.mycompany.projetoback.Filme;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class AdmDAO {
    
    public Adm selecionaPorNomeESenha(Adm admin){
        for(int i = 0; i<Banco.listaDeAdms.size();i++){
            if(nomeEsenhaIguais(admin, Banco.listaDeAdms.get(i))){
               return Banco.listaDeAdms.get(i);
            }
        }
        return null;
    }
    public ArrayList<Filme> procuraPorHorario(String horario){
        for(int i=0; i<Banco.listaDeSessões.size();i++){
            if(Banco.listaDeSessões.get(i).getHorario().equals(horario)){
                return Banco.listaDeSessões.get(i).getListaDeFilmes();
            }
        }
        return null;
    }
    
    public boolean adiocionaSessão(String horario, Filme filme){
        for(int i=0;i<Banco.listaDeSessões.size();i++){
            if(Banco.listaDeSessões.get(i).getHorario().equals(horario)){
                if(procuraPorHorario(horario).size() == 1){
                    return false;
                }
                Banco.listaDeSessões.get(i).getListaDeFilmes().add(filme);
            }
        }
        return true;
    } 

    public ArrayList<String> listarFilmes(){
        ArrayList<String> nomes = new ArrayList();
        for(int i  = 0 ;i<Banco.listaDeFilmes.size();i++){
            nomes.add(Banco.listaDeFilmes.get(i).getNome());
        }
        return nomes;
    }
    public ArrayList<String> listarSessoes(){
        ArrayList<String> nomes = new ArrayList();
        for(int i  = 0 ;i<Banco.sessoes.size();i++){
            nomes.add(Banco.sessoes.get(i));
        }
        return nomes;
    }
    
    public ArrayList<String> listarHorarios(){
        ArrayList<String> nomes = new ArrayList();
        for(int i  = 0 ;i<Banco.horarios.size();i++){
            nomes.add(Banco.horarios.get(i));
        }
        return nomes;
    }
    public boolean nomeEsenhaIguais(Adm admin, Adm admin2){
        return admin.getLogin().equals(admin2.getLogin()) && admin.getSenha().equals(admin2.getSenha());
    }
    public Filme buscaFilme(String nome){
        for(int i =0;i<Banco.listaDeFilmes.size();i++){
            if(nome.equals(Banco.listaDeFilmes.get(i).getNome())){
                return Banco.listaDeFilmes.get(i);
            }
        }
        return null;
    }     
    public ArrayList<String> buscarSessão(String nome){ 
        ArrayList<String> s;
        s = new ArrayList();
        for(int i = 0;i<Banco.listaDeSessões.size()-1;i++){
            for(int j = 0;j<Banco.listaDeSessões.get(i).getListaDeFilmes().size()-1;i++){
                if(nome.equals(Banco.listaDeSessões.get(i).getListaDeFilmes().get(j).getNome())){
                s.add(Banco.listaDeSessões.get(i).getHorario());
    }
    }
        }
        return s;
    }}