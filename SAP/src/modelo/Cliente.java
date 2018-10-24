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
public class Cliente extends Usuario{
    
    private int nroCliente;
    private String email;

    public Cliente(int cedula, String password, String nombreCompleto, int nroCliente, String email) {
        super(cedula, password, nombreCompleto);
        this.nroCliente = nroCliente;
        this.email = email;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
