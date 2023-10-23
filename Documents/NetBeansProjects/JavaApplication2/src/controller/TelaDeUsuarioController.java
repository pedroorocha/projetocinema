/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import com.mycompany.projetoback.TelaDeUsuario;
import com.mycompany.projetoback.TelaDoAdmin;
import com.mycompany.projetoback.TelasDefilmes;
import com.mycompany.projetoback.TelaFilmes;
import com.mycompany.projetoback.TelaDeSessões;
/**
 *
 * @author pedro
 */
public class TelaDeUsuarioController {
    private final TelaDeUsuario telaDeUsuario;
    private int id; 

    public TelaDeUsuarioController(TelaDeUsuario telaDeUsuario) {
        this.telaDeUsuario = telaDeUsuario;
    }
    
    public void mostraTela(){
        TelaDeSessões t = new TelaDeSessões();
        t.setSize(705, 415);
        t.setVisible(true);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
