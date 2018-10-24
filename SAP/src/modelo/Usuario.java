/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jessi
 */
public class Usuario {
    
    private int cedula;
    private String password;
    private String nombreCompleto;

    public Usuario(int cedula, String password, String nombreCompleto) {
        this.cedula = cedula;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    @Override
    public String toString(){
        return getNombreCompleto();
    }
    
    @Override
    public boolean equals(Object o){
        Usuario u = (Usuario) o;
        return getCedula() == u.getCedula();
    }
    
    
}
