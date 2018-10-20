/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Fachada;
import modelo.Usuario;

/**
 *
 * @author Jessi
 */
public class Controlador_Login {
    
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Login vista;

    public Controlador_Login(Interface_Login vista) {
        this.vista = vista;
    }
    
    
    public void login(String nom,String pass){
        Usuario logueado = modelo.login(nom, pass);
        if(logueado==null){
            vista.mostrarErrorLogin();
        }else{
            vista.ingresar(logueado);
        }
    }
    
    
}
