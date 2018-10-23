/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observer;
import modelo.Fachada;
import modelo.Usuario;

/**
 *
 * @author Jessi
 */
public class Controlador_Login{
    
    private Usuario logueado;
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Login vista;

    public Controlador_Login(Usuario logueado, Interface_Login vista) {
        this.vista = vista;
        this.logueado = logueado;
    }
    
    
    
    
    
    public void login(int cedula,String pass){
        Usuario logueado = modelo.login(cedula, pass);
        if(logueado==null){
            vista.mostrarErrorLogin();
        }else{
            vista.ingresar(logueado);
        }
    }
    
    
}
