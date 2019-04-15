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
public class ContaNani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * crea 7 thread (Nani)
         */
        Nani thr1 = new Nani("pippo");
        Nani thr2 = new Nani("minnie");
        Nani thr3 = new Nani("paperino");
        Nani thr4 = new Nani("pippolo");
        Nani thr5 = new Nani("baleccolo");
        Nani thr6 = new Nani("gino");
        Nani thr7 = new Nani("caracallinoadwaddawdwddaw");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
    }
    
}
