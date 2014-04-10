package org.campitos.capitulo7;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.File;
import java.util.ArrayList;
public class GuardarCuestionario {
    
    public synchronized static ArrayList<Pregunta> leer()throws Exception{
   File file=new File("archivaldo.xxxx");    
 
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Pregunta> u=(ArrayList<Pregunta>) 
          ois.readObject();
          ois.close();
  return u;
  }

    
    
    public static void guardarPregunta(Pregunta.java u)throws Exception{
        ArrayList Pregunta=new ArrayList<Pregunta>();
       File file=new File("archivaldo.xxxx");    
         if(file.exists()){
             Pregunta=  leer();
         }
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
    Pregunta.add(u);
    ois.writeObject(Pregunta); 
    ois.close();
  System.out.println("Guardado");
    }
    public static void guardarOpcion (Opcion.java u)throws Exception{
        ArrayList Opcion=new ArrayList<Opcion>();
       File file=new File("archivaldo.xxxx");    
         if(file.exists()){
             Opcion=  leer();
         }
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
    Opcion.add(u);
    ois.writeObject(Opcion); 
    ois.close();
  System.out.println("Guardado");
    }
}
