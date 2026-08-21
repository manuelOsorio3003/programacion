/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoriabalistica1;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class TrayectoriaBalistica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double velocidadInicial = 0;
        double anguloGrados = 0;
        final double gravedad = 9.81;
        double anguloRadianes = 0;
        double alturaMaxima = 0.0;
        int segundoAlturaMaxima = 0;
        double altura = 0;

        System.out.println("=== SIMULACION DE TRAYECTORIA BALISTICA ===");

        System.out.print("Ingresa la velocidad inicial (m/s): ");
        velocidadInicial = sc.nextDouble();

        System.out.print("Ingresa el angulo de lanzamiento (1 - 89 grados): ");
        anguloGrados = sc.nextDouble();

        if (velocidadInicial <= 0 || anguloGrados < 1 || anguloGrados > 89) {
            System.out.println("\n[ERROR] Datos inválidos. La velocidad debe ser mayor a 0 y el ángulo entre 1 y 89 grados.");
        } else {
            anguloRadianes = Math.toRadians(anguloGrados);

            System.out.println("\n--- REGISTRO SEGUNDO A SEGUNDO ---");

            for (int t = 1; t <= 10; t++) {
                altura = (velocidadInicial * Math.sin(anguloRadianes) * t) - (0.5 * gravedad * Math.pow(t, 2));
                if (altura < 0) {
                    System.out.printf("\nSegundo %d : Impacto en el suelo altura negativa: %.2f m. Terminando simulacion",t,altura);
                    break;
                } else {
                    System.out.printf("\nSegundo %d : Altura = %.2f metros",t,altura);
                    if (altura > alturaMaxima) {
                        alturaMaxima = altura;
                        segundoAlturaMaxima = t;
                    }
                }
            }
            if (segundoAlturaMaxima > 0) {
                System.out.printf("\n[RESULTADO] La altura maxima estimada registrada fue de %.2f m en el segundo %d",alturaMaxima,segundoAlturaMaxima);
            }
        }      
    }//fin main
    
}//fin class
