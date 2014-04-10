/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practicas;

/**
 *
 * @author Rubén
 */
import java.util.ArrayList;
public class Preguntas {
    private int id;
    private String titulo;
    private ArrayList<Opciones> opcion;

    public Preguntas(int id, String titulo, ArrayList<Opciones> opcion) {
        this.id = id;
        this.titulo = titulo;
        this.opcion = opcion;
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

    public ArrayList<Opciones> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opciones> opcion) {
        this.opcion = opcion;
    }
    
    
}
