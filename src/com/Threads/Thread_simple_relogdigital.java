/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Threads;

import java.util.Calendar;


public class Thread_simple_relogdigital {

    
    public static void main(String[] args) {
        //Creamos el thread como clase interna anonima
        Thread t1 = new  Thread(new Runnable(){

            @Override
            public void run() {
                while(true){
                try{
                    Calendar cal=Calendar.getInstance();
                    int hora=cal.get(Calendar.HOUR_OF_DAY);
                    int min=cal.get(Calendar.MINUTE);
                    int seg=cal.get(Calendar.SECOND);
                    System.out.println(hora+":"+min+":"+seg);    
                    Thread.sleep(1000);
                } catch (Exception e){}
            }//Aqui termina el while
            }
        });//Aqui termina el Thread
        System.out.println("Este es solo el metodo main");
        t1.start();
    }
    
}
