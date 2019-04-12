/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 *La classe permette la somma dei valori dei thread con un valore assegnatogli
 * @author Libri Domenico
 */
public class CalcoloEdInserisco implements Runnable{
    private double B;
    private GestCalcoli gc;
    
     /**
     * @param b è la quantità che vado a sommare al risultato 
     * @param gc contiene il risultato e ne permette la modifica tramite un istanza alla classe GestCalcoli
     * @see GestCalcoli
     */
    
    public CalcoloEdInserisco(double b, GestCalcoli gc){
        B = b;
        this.gc = gc;        
    }
    
    public void run(){
        gc.setRisultato(gc.getRisultato()+B);
        System.out.println(Thread.currentThread().getName()+ " "+ gc.getRisultato());
    }
    /**
     * Il metodo run stampa il risultato ottenuto dalla somma del valore più il vecchio risultato nel momento corrente ed inoltre il proprio nome 
     */
    
}
