/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carro;

/**
 *
 * @author Rubén
 */
import java.util.*;
public class Carro {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
       
        Thread t1 = new Thread(new Runnable(){
            Random posx=new Random();
            int limite =10;
            @Override
            public void run(){
                System.out.println(posx.nextInt(limite));
            }
            
        });
        Thread t2 =new Thread(new Runnable(){
            Random posx=new Random();
            int limite =10;
            @Override
            public void run(){
                System.out.println(posx.nextInt(limite));
            }
        });
        t1.start();
        t2.start();
              
                
                
    }
    
}
