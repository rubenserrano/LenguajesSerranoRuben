
package Capitulo6;

import java.util.ArrayList;

public class Opcion {
private int id;
  private String titulo;
  private ArrayList<Opcion>opciones;

  public Opcion(int id, String titulo, ArrayList<Opcion> opciones) {
      this.id=id ;
      this.titulo = titulo;
        this.opciones = opciones;
  }

    Opcion(int i, String titulo, boolean b) {
    }
        
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
