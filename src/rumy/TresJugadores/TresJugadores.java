/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumy.TresJugadores;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class TresJugadores {

    int fila, columna, puntuacion, i, j, juego, sumaColumna1, sumaColumna2, contador, opcion;

    public TresJugadores() {
        int sumaColumna3;
        int[][] matriz = new int[10][3];
        Scanner entrada = new Scanner(System.in);
        contador = 1;
        //Matriz para rellenar los datos
        for (fila = 0; fila < 10; fila++) {
            juego = 1;
            System.out.println("Ronda: " + contador);
            contador = contador + 1;
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Escriba la puntuacion del jugador " + juego);
                puntuacion = entrada.nextInt();
                matriz[fila][columna] = puntuacion;
                juego = juego + 1;
                //Limpiar Pantalla; 
            }
        }

        //Matriz con datos para mostrar
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                System.out.println(" ");
            }

            sumaColumna1 = 0;
            sumaColumna2 = 0;
            sumaColumna3 = 0;

            //Matriz para sumar la primera columna
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 1; j++) {
                    sumaColumna1 = sumaColumna1 + matriz[i][j];
                }
            }

            System.out.println("El puntaje del jugador 1 fue: " + sumaColumna1);

            //Matriz para sumar la segunda columna
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < 2; j++) {
                    sumaColumna2 = sumaColumna2 + matriz[i][j];
                }
            }

            System.out.println("El puntaje del jugador 2 fue: " + sumaColumna2);

            //Matriz para sumar la tercera columna
            for (int i = 0; i < 10; i++) {
                for (int j = 2; j < 3; j++) {
                    sumaColumna3 = sumaColumna3 + matriz[i][j];
                }
            }

            System.out.println("El puntaje del jugador 3 fue: " + sumaColumna3);

            //Condicional que me determina el ganador segun las reglas
            //El que tiene menor cantidad de puntos acumulados gana el juego
            if (sumaColumna1 < sumaColumna2 & sumaColumna1 < sumaColumna3) {
                System.out.println("Jugador 1 gana");
            } else {
                if (sumaColumna1 == sumaColumna2 & sumaColumna1 == sumaColumna3 & sumaColumna2 == sumaColumna3) {

                    System.out.println("Empate");
                } else {
                    if (sumaColumna1 > sumaColumna2 & sumaColumna3 > sumaColumna2) {

                        System.out.println("Jugador 2 gana");
                    } else {
                        if (sumaColumna3 < sumaColumna1 & sumaColumna3 < sumaColumna2) {
                            System.out.println("Jugador 3 gana");
                        }
                    }

                }
            }
        }

    }
}
