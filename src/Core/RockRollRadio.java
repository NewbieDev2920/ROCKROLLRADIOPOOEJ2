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
public class RockRollRadio {
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;

    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }
    
    public boolean addLocutor(Locutor locutor){
        if(!this.locutores.contains(locutor)){
            this.locutores.add(locutor);
            return true;
        }
        return false;
    }
    
    public boolean addPrograma(Programa programa){
        if(!this.programas.contains(programa)){
            this.programas.add(programa);
            return true;
        }
        return false;
    }
    
    public Locutor getLocutor(int index){
        return this.locutores.get(index);
    }
    
    public boolean addArtista(Artista artista){
        if(!this.artistas.contains(artista)){
            this.artistas.add(artista);
            return true;
        }
        return false;
    }
    
    public boolean addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    
    public Artista getArtista(int index){
        return this.artistas.get(index);
    }
    
    public boolean addEmision(Emision emision){
        return true;
    }
    
    public Programa getPrograma(int index){
        return this.programas.get(index);
    }
    
    public boolean addInvitado(Invitado invitado, Emision emision){
        if(!this.invitados.contains(invitado)){
            invitado.addEmision(emision);
            this.invitados.add(invitado);
            return true;
        }
        return false;
    }
    
    public Cancion getCancion(int index){
        return this.canciones.get(index);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista artista){
        for(Programa p : this.programas){
            for(Artista a : p.getEmisiones()){
                
            }
        }
    }
    
}
