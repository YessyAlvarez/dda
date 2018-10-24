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
public class Trabajador extends Usuario{
    
    private int puesto;
    private Sector sector;
    private Area area;
    private boolean libre;

    public Trabajador(int cedula, String password, String nombreCompleto, Sector sector, Area area) {
        super(cedula, password, nombreCompleto);
        this.sector = sector;
        this.area = area;
        this.libre = true;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
    
    
    
}
