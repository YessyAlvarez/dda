/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Observable;


public class Fachada extends Observable{
    
    private static Fachada instancia = new Fachada();
    private Sistema_Usuarios su = new Sistema_Usuarios();
    
    public static final int EVENTO_USUARIO = 1;

    
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada() {
    }

    public void agregar(Usuario u) {
        su.agregar(u);
    }

    public Usuario login(String nom, String c) {
        return su.login(nom, c);
    }

    public void logout(Usuario u) {
        su.logout(u);
    }

    public ArrayList<Usuario> getLogueados() {
        return su.getLogueados();
    }
    protected void avisar(Object evento){
        setChanged();
        notifyObservers(evento);
    }
    
}
