/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 *
 * @author Bertelli Nicole
 */

public class CalcoloEdInserisco implements Runnable{
    private double b;
    private GestCalcoli gc;
    
    /**
     * Questo è il metodo : costruttore
     * @param b
     * @param gc 
     */
    public CalcoloEdInserisco (double b, GestCalcoli gc){
        this.b = b;
        this.gc = gc;
    }
    
    /**
     * Questo metodo che : lancia il Thread
     */
    public void run(){
        gc.setRisultato(gc.getRisultato()+b);
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }
}
