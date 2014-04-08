/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.capitulo7;

import javax.swing.text.html.HTMLDocument;

/**
 * https://github.com/daton/lenguajes.git
 *
 * @author campitos
 */
public class Testiculo {

    public static void main(String[] args) throws Exception {
        Pregunta u=new Pregunta(1, "Como me llamo", |)
      GuardarUsuario.guardar(u);

        for (Usuario usu : GuardarUsuario.leer()) {
            System.out.println(usu);
        }
    }

}
