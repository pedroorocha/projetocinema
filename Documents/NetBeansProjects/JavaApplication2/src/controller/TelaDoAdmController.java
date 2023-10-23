/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import com.mycompany.projetoback.TelaDoAdmin;
import com.mycompany.projetoback.TelasDefilmes;
/**
 *
 * @author pedro
 */
public class TelaDoAdmController {
    private final TelaDoAdmin view;

    public TelaDoAdmController(TelaDoAdmin view) {
        this.view = view;
    }
    public void mostraSessões(){   
            //entrar no menu de usuario
            TelasDefilmes teladefilmes = new TelasDefilmes();
            teladefilmes.setVisible(true);
        
}
}