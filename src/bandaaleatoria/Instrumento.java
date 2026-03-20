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
public abstract class Instrumento {
    public abstract void tocar();
    
    public abstract void afinar();
    
    public void tocar(String nota){
        System.out.println("tocando " + nota);
    }
    
}
