/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jessi
 */
public class Sistema_Usuarios {
    
    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Usuario> logueados = new ArrayList();
    
    public void agregar(Usuario u){
        usuarios.add(u);
    }
    public Usuario login(String nom,String c){
        for(Usuario u:usuarios){
            if(u.getNombre().equals(nom) && u.getPassword().equals(c)){
                logueados.add(u);
                Fachada.getInstancia().avisar(Fachada.EVENTO_USUARIO);
                return u;
            }
        }
        return null;
    }
    public void logout(Usuario u){
        logueados.remove(u);
        Fachada.getInstancia().avisar(Fachada.EVENTO_USUARIO);
    }

    public ArrayList<Usuario> getLogueados() {
        return logueados;
    }
    
}
