/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondanapp;

/**
 *
 * @author Bertelli Nicole
 */
public class DinDonDanApp {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Runnable campana = new Campana("din", 5);
        Thread thread1 = new Thread(campana);
        thread1.start();
        Thread thread2= new Thread(new Campana("don", 5));
        thread2.start();
        
        new Thread(new Campana("dan", 5)).start();
    }
    
}
