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
public class Test {
    public static void main(String[] arg){
        for(Preguntas p:GenerarCuestionario.optenercuestionario()){
            System.out.println(p.getTitulo());
            for(Opciones o:p.getOpcion()){
                System.out.println(o.getOpcion()+" "+o.isValor());
            
        }
    }
    
}
