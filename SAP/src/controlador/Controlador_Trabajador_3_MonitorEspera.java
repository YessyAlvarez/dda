/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.Fachada;

/**
 *
 * @author Jessi
 */
public class Controlador_Trabajador_3_MonitorEspera  implements Observer{

    
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Trabajador_3_MonitorEspera vista;
    
    
    public Controlador_Trabajador_3_MonitorEspera(Interface_Trabajador_3_MonitorEspera vista) {
        this.vista = vista;
    }
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
