/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author DAM118
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opc;
        
        do {
            System.out.println("Elegir acción a realizar:\n"
                    + "1.- Cambio de unidades horas a segundos\n"
                    + "2.- Cambio de unidades kilómetros a metros\n"
                    + "3.- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Introduce horas: ");
                    int s=3600*teclado.nextInt();
                    
                    break;
                case 2:
                    System.out.print("Introduce kilómetros: ");
                    int m=1000*teclado.nextInt();
                    break;
                case 3:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 3);
    }

}
