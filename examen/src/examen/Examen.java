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
                    + "3.- Cambio de unidades Km/h a m/s\n"
                    + "4.- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Introduce horas: ");
                    cambio(teclado, 3600);
                    System.out.println(" segundos");
                    break;
                case 2:
                    System.out.print("Introduce kilómetros: ");
                    cambio(teclado, 1000);
                    System.out.println(" metros");
                    break;
                case 3:
                    System.out.print("Introduce kilómetros/hora: ");
                    cambio(teclado, 3.6);
                    System.out.println(" m/s");
                    break;
                case 4:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 3);
    }

    private static void cambio(Scanner teclado, double convert) {
        double resul = convert * teclado.nextDouble();
        System.out.printf("Resultado = %,.2f", resul);
    }

}
