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
public class Emision {
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.serial = 0;
        this.programa.addEmision(this);
    }
    
    public boolean addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    
      public boolean addInvitado(Invitado inv){
        if(!this.invitados.contains(inv)){
            this.invitados.add(inv);
            return true;
        }
        return false;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
      
    
    
}
