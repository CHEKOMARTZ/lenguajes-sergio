/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Threads;

/**
 *
 * @author T107
 */
public class Thread_simple_infinito {

    
    public static void main(String[] args) {
        //Creamos el thread como clase interna anonima
        Thread t1 = new  Thread(new Runnable(){

            @Override
            public void run() {
                while(true){
                try{
                    Thread.sleep(6000);
                    System.out.println("Hola me llamo "+Thread.currentThread().getName()+" y me dormi 6 segundos " );
                } catch (Exception e){}
            }//Aqui termina el while
            }
        });//Aqui termina el Thread
        System.out.println("Este es solo el metodo main");
        t1.start();
        
    }
    
}
