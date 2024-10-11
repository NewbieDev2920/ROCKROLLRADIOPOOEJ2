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
public class Invitado extends Persona {
    private ArrayList<Emision> emisiones;

    public Invitado(String nombre) {
        super(nombre);
        this.emisiones = new ArrayList<>();
    }
    
    public boolean addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }
}
