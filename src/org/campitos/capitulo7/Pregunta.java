
package org.campitos.capitulo7;

import java.util.ArrayList;
import java.io.Serializable;

public class Pregunta implements Serializable{
    private int id;
    private String titulo;
    private ArrayList<Opcion> opciones;

    public Pregunta(int id, String titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titulo = titulo;
        this.opciones = opciones;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    static class java {

        public java() {
        }
    }
}
