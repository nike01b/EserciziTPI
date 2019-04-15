/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaNani;

/**
 *
 * @author Bertelli Nicole
 */
public class Nani extends Thread {
    /**
     * Questo è il metodo : costruttore
     * @param n  imposta il nome del thread
     */
    public Nani(String n){
        super();
        setName(n);
    }
    
    /**
     * Questo è metodo che lancia il thread 
     */
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7 ; i++){
            System.out.println((i+1) + " " + getName());
        }
    }
}
