package Capitulo6;


import Capitulo6.Opcion;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rubén
 */
public class Pregunta {
    private int id;
    private String titutlo;
    private ArrayList<Opcion>opciones;
    
    public Pregunta(int id, String titutlo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titutlo = titutlo;
        this.opciones = opciones;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
            
}
