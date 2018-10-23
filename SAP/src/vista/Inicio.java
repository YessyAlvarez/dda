/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Fachada;
import modelo.Usuario;

/**
 *
 * @author Jessi
 */
public class Inicio {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cargarUsuarios();
        new Principal().setVisible(true);
    }

    private static void cargarUsuarios() {
        Fachada f = Fachada.getInstancia();
        f.agregar(new Usuario(1,"1","Juan perez"));
        f.agregar(new Usuario(2,"2","Ana Gonzalez"));
        f.agregar(new Usuario(3,"3","Pedro Hernandez"));
        f.agregar(new Usuario(4,"4","Pepe Trueno"));
        f.agregar(new Usuario(5,"5","Juan Carlos"));
    }
    
}
