/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author nicola.cristian
 */
public class T1 extends Thread{

    private String s;
    
    public T1(String s) {

        this.s=s;
       
    }
     
    //metodo che viene eseguito all'avvio del processo
         public void run(){
             
        for(;;) System.out.println(s); 
}
         
         
 
}
