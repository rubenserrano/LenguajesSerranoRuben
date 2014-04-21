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
public class Test {
    public static void main(String[] args)throws Exception{
    usuarios u=new usuarios(1, "ruben", "serrano", "barrios", "www.rubenpc@hotmail.com");
    Guardar_Usuario.guardar(u);
    /*for(usuarios usu:Guardar_Usuario.leer()){
        System.out.println(usu);
    }*/
    }
}
