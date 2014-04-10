/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica_2;

/**
 *
 * @author Rubén
 */
import java.io.Serializable;
public class usuarios  implements Serializable{
    private int id;
    private String nombre;

    public usuarios(int id, String nombre, String Apellidop, String Apellidom, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.Apellidop = Apellidop;
        this.Apellidom = Apellidom;
        this.correo = correo;
    }
    private String Apellidop;
    private String Apellidom;
    private String correo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }

    public String getApellidom() {
        return Apellidom;
    }

    public void setApellidom(String Apellidom) {
        this.Apellidom = Apellidom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
