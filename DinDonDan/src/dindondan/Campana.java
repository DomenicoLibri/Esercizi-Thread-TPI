/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *La classe campana dovrà defininire la Campana tramite il suo suono e le volte che suona
 * @author Libri Domenico
 */
public class Campana implements Runnable{
 
    String suono;
    int volte;
 /**
  * 
  * @param suono il suono che fa la campana quando suona
  * @param volte le volte che la campana suonerà
  */
    public Campana(String suono,int volte){
        this.suono = suono;
        this.volte = volte;
    }
    /**
     * il metodo run avrà il compito di stampare il numero di volte che deve suonare e il suono della campana
     */
    public void run(){
        for(int k = 0; k < volte; k++)
            System.out.println((k+1)+ suono+" ");
    }
    
}
