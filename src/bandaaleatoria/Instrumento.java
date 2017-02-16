/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

/**
 *
 * @author adazac
 */
public class Instrumento {
    public void tocar(){
        System.out.println("tocando instrumento");
    }
    
    public void afinar(){
        System.out.println("afinando instrumento");
    }
    
    public void tocar(String nota){
        System.out.println("tocando " + nota);
    }
    
}
