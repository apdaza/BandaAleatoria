/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author adazac
 */
public class Banda {
    ArrayList<Instrumento> instrumentos;

    public Banda() {
        instrumentos = new ArrayList<Instrumento>();
    }
    
    public void construirBanda(int cantidad){
        for(int i=0; i<cantidad; i++){
            instrumentos.add(generarInstrumento());
        }
        
    }
    
    public void afinarBanda() {
        Iterator it = instrumentos.iterator();
        while (it.hasNext()) {
            Instrumento i = (Instrumento)it.next();
            afinarInstrumento(i);
            tocarInstrumento(i, "Do");
        }
    }
    
    public void tocarBanda() {
        Iterator it = instrumentos.iterator();
        while (it.hasNext()) {
            Instrumento i = (Instrumento)it.next();
            tocarInstrumento(i);
        }
    }
    
    public Instrumento generarInstrumento() {
        Random r = new Random();
        int n = r.nextInt(4);
        switch(n){
            case 0:
                return new Guitarra();
            case 1:
                return new Piano();
            case 2:
                return new Arpa();
            default:
                return new Violin();
        }
    }
    
    public void afinarInstrumento(Instrumento i){
        i.afinar();
    }
    
    public void tocarInstrumento(Instrumento i){
        i.tocar();
    }
    
    public void tocarInstrumento(Instrumento i, String nota){
        i.tocar(nota);
    }
    
    
    
}
