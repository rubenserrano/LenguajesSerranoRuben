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
public class Opciones {
    private int id;
    private String opcion;
    private boolean valor;

    @Override
    public String toString() {
        return "Opciones{" + "id=" + id + ", opcion=" + opcion + ", valor=" + valor + '}';
    }

    public Opciones(int id, String opcion, boolean valor) {
        this.id = id;
        this.opcion = opcion;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
    
    
    
}
