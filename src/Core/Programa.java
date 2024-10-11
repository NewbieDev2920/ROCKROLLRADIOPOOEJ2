/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author cande
 */
public class Programa {

    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;

    //A REVISAR
    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.locutores = new ArrayList<>();
        this.locutores.add(locutor);
        this.serial = 0;
        this.emisiones = new ArrayList<>();
        this.locutores.get(0).addPrograma(this);
    }

    public Emision getLastEmision() {
        return this.emisiones.get(this.emisiones.size() - 1);
    }

    public boolean addLocutor(Locutor locutor) {
        if (!this.locutores.contains(locutor)) {
            this.locutores.add(locutor);
            return true;
        }
        return false;
    }

    public boolean addEmision(Emision emision) {
        if (!this.emisiones.contains(emision)) {
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }

    public ArrayList<Emision> getEmisiones() {
        return emisiones;
    }
    
    

}
