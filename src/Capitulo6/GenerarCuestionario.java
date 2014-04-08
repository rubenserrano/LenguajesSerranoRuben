
package Capitulo6;

import java.util.ArrayList;

public class GenerarCuestionario {
    public ArrayList<Pregunta>obtenerCuestionario(){
ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();

ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();
Opcion op11=new Opcion(1,"el salvador",false);
Opcion op12=new Opcion(1,"Peru",false);
Opcion op13=new Opcion(1,"Mexico",false);
Opcion op14=new Opcion(1,"Finlandia",true);
opciones1.add(op11);
opciones1.add(op12);
opciones1.add(op13);
opciones1.add(op14);
Pregunta P1 =new Pregunta(1,"Cual es el pais mejor escuelas",opciones1);
cuestionario.add(P1);



        return cuestionario;
    }
    
}
