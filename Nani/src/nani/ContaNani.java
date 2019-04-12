/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * La classe crea un numero variabile di thread con il compito di contare i nani;
 * Adempie al suo compito tramite il nome del nano
 * @author Libri Domenico
 */
public class ContaNani extends Thread {

    ContaNani(String nome) {
        super();
        setName(nome);
    }
    
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7; i++)
            System.out.println(i+1 + " " + getName());
        //System.out.println("Fine thread");
}
    /**
     * Il metodo run stampa 7 volte il nome del nano
     */
    
}
