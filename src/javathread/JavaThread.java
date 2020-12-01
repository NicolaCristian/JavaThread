/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicola.cristian
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//T1 p1 = new T1("T1");
//p1.start();
//p1.sleep(5000);
//p1.stop();

//ProcessoRunnable pr= new ProcessoRunnable("p1");
// Thread t1= new Thread(pr);
// t1.start();
// 
// try{
// Thread.sleep(5000);
// pr.Stoppa();
// }      
// catch (InterruptedException ex) {
//            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
//}



Conto conto= new Conto(2000);

Sportello sport1= new Sportello(conto);
Sportello sport2= new Sportello(conto);
Thread genitore1= new Thread(sport1);
Thread genitore2= new Thread(sport2);

genitore1.start();
genitore2.start();

sport1.versa(500);
sport2.versa(800);

 try{
 Thread.sleep(5000);
     System.out.println("Saldo: "+conto.saldo());
 }      
 catch (InterruptedException ex) {
            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
        }


}
}