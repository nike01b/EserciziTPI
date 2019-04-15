/*
  Copyright (C) 2019 Alessio Abeni

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package pardis;

/**
 * 
 * @author Bertelli Nicole
 */

public class ParDis extends Thread{
  private int massimo;
  private boolean pari;
  private int ritardo = 500;
  
  /**
   * Questo è il metodo : costruttore
   * @param finale è il valore del numero massimo
   * @param pari è il flag per indicare se "finale" è pari;
   */
  public ParDis (int finale, boolean pari){
    massimo   = finale;
    this.pari = pari;
  }
 /**
  * Questo è il metodo che lancia il thread
  */
  public void run(){
    String chisono;
    chisono = Thread.currentThread().getName();
    for (int xx = 0; xx < massimo; xx++){
      if(pari){              // se il thread deve stampare i numeri pari 
        if(xx % 2 == 0)      // numero pari 
          System.out.println(chisono+"-pari "+xx);
      }  
      else                   // se il thread deve stampare i numeri dispari 
        if (xx % 2 != 0)     // numero dispari 
          System.out.println(chisono+"-dispari "+xx);
      try {Thread.sleep(ritardo);}
      catch (InterruptedException e){System.out.println(e);}
    }  
  }
  
  /**
   * Nel main vengono lanciati due diversi Thread che contano uno il numero di valori
   * pari e l'altro i valori dispari
   * @param args the command line arguments
   */
  public static void main(String[] args){
    if (args.length != 1){
	  System.out.println("Dovresti passare il numero intero");
	  return;
    }    
    int n = Integer.parseInt(args[0]);
    Thread TP = new ParDis (n + 1, true);  // thread che conta i pari
    Thread TD = new ParDis (n + 1, false); // thread che conta i dispari
    System.out.println("->Contate fino a " + n);
    TP.start();                            // avvio esecuzione thread pari 
    TD.start();                            // avvio esecuzione thread dispari
    try{
      TP.join();                           // attesa terminazione thread pari
      TD.join();                           // attesa terminazione thread pari
    }
    catch(Exception e){}
    System.out.println("<-Fine conteggio!");   
  }
    
}
