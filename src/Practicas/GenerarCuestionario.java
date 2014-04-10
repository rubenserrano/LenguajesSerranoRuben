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
public class GenerarCuestionario {
   public static ArrayList<Preguntas> optenercuestionario(){
       
    ArrayList<Preguntas> cuestionario1=new ArrayList<>();
    ArrayList<Opciones> opciones1=new ArrayList<>();
    Opciones op11=new Opciones(1, "En mexico", true);
    Opciones op12=new Opciones(1, "Cruz azul", true);
    Opciones op13=new Opciones(1, "America", true);
opciones1.add(op11);
opciones1.add(op12);
opciones1.add(op13);

    Preguntas p1= new Preguntas(1, "Peor equipo", opciones1);
    cuestionario1.add(p1);
    return cuestionario1;
   }
}
