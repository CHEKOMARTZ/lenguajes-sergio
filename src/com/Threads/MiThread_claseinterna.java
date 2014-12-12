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
public class MiThread_claseinterna {
    
    public static void main (String args[]){
        Thread t1=new Thread(new Runnable(){
            
            public void run(){
                System.out.println("Soy un Thread");
            }
        });
        t1.start();
    }
}
