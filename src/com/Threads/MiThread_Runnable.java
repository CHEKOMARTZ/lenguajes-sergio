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
public class MiThread_Runnable implements Runnable{
    
    public static void main (String args[]){
        Runnable r=new MiThread_Runnable();
        Thread t1=new Thread(r);
       t1.start();
    }


  public void run (){
System.out.println("Soy un Thread");
}

}
