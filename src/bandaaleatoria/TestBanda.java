/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import java.util.Random;

/**
 *
 * @author adazac
 */
public class TestBanda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int cantidad = r.nextInt(10);
        System.out.println("Salimos al toque con " + cantidad + " instrumentos");
        Banda banda = new Banda();
        banda.construirBanda(cantidad);
        banda.afinarBanda();
        banda.tocarBanda();
    }
    
}
