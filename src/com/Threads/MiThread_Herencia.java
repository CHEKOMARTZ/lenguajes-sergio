/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Threads;

/**
 *
 * @author checo
 */
public class MiThread_Herencia extends Thread {
    
     public void run(){
        System.out.println("Hola soy un Thread");
    }   
    
public class Probando {
        
        public void main (String args[]){
           Thread t1 = new Thread();
                    t1.start();
        }
   
    }
}

