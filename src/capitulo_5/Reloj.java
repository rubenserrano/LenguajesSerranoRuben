/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capitulo_5;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rubén
 */
import java.util.*;
public class Reloj {

    public static void main(String[] args) {
   
     Thread t1 = new Thread(new Runnable(){
         @Override
         public void run(){
             while (true){
             try {
                 Thread.sleep(1000);
                 //Creamos un objeto de una clase que se llama calendar 
                 
                 Calendar cal=Calendar.getInstance();
                 int hora =cal.get(Calendar.HOUR);
                 int minuto=cal.get(Calendar.MINUTE);
                 int segundo=cal.get(Calendar.SECOND);
                 String time=hora+":"+minuto+":"+segundo;
                 System.out.println(time);
             } catch (InterruptedException ex) {
             }
             }

         }
     });
     
             t1.start();
             
             
     
    }
    
}
            

