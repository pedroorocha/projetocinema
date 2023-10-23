/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class TelaDeFinalizaçãoController {
    private int id;
    private int poltronas;
    private ArrayList<Boolean> listaDepoltronas;

    public TelaDeFinalizaçãoController() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Boolean> getListaDepoltronas() {
        return listaDepoltronas;
    }

    public void setListaDepoltronas(ArrayList<Boolean> listaDepoltronas) {
        this.listaDepoltronas = listaDepoltronas;
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int poltronas) {
        this.poltronas = poltronas;
    }
    
}
