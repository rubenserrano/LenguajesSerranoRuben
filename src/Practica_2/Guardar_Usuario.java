/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica_2;

/**
 *
 * @author Rubén
 * 
 */
import java.util.ArrayList;
import java.io.*;
public class Guardar_Usuario {
    public synchronized static ArrayList<usuarios> leer()throws Exception{
    File file=new File("Tester.xxx");
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ios= new  ObjectInputStream(fis);
    ArrayList<usuarios> u =(ArrayList<usuarios>) ios.readObject();
    ios.close();
    return u;    
    }
    
    public  static void guardar(usuarios u)throws Exception{
    ArrayList usuario = new ArrayList<usuarios>();
    File file= new File("Tester.xxx");
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream ios = new ObjectOutputStream(fis);
    usuario.add(u);
    ios.writeObject(ios);
    ios.close();
        System.out.println("Se guardo");
    
    }
}
    
    

