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
public class Sportello implements Runnable {
    
    private Conto conto;

    public Sportello(Conto conto) {
    this.conto=conto;
    }
    
    @Override
    public void run(){
        
    }
    
    public void versa (int somma){
        conto.versa(somma);

    }
    
}
