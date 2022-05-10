/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumy;

import java.util.Scanner;
import rumy.DosJugadores.DosJugadores;
import rumy.TresJugadores.TresJugadores;

/**
 *
 * @author willi
 */
public class JuegoRumy {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        
        Scanner entrada = new Scanner(System.in); 
        DosJugadores dosjugadores = new DosJugadores();
        TresJugadores tresjugadores = new TresJugadores();
        
        System.out.println("Juego Rumy");
        System.out.println(" ");
        System.out.println("El juego se basa en 10 rondas desde 2 cartas hasta 10 en donde");
        System.out.println("Cada jugador intentará acumular la menor cantidad de puntos posibles");
        System.out.println(" ");

        System.out.println("Digite la opcion segun los jugadores disponibles");
        System.out.println("1. Dos jugadores");
        System.out.println("2. Tres jugadores");
        System.out.println("3. Cuatro jugadores");
        
        opcion = entrada.nextInt();
        entrada.nextLine();
        
        switch (opcion) {
            case 1: 
                System.out.println(dosjugadores);
                break;
            case 2:
                //System.out.println(tresjugadores);
                break;
            default:
                break;
                
        }
        
    }
    
}
