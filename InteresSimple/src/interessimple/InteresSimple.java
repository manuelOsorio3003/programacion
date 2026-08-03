/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double capital = 0;
        double anios = 0;
        int tasa = 0;
        double interes = 0;
        
        System.out.println("Sistema de calculo de interes simple para prestamos");
        System.out.println("Ingrese el capital inicial");
        capital = entrada.nextDouble();
        
        System.out.println("Ingrese la tasa de interes anual");
        tasa = entrada.nextInt();
        
        System.out.println("Ingrese el tiempo en anios");
        anios = entrada.nextDouble();
        
        interes  = (capital * tasa * anios)/100;
        
        System.out.printf("Su tasa de interes es %.2f",interes);
        
        
        
        
        
    }//fin main
    
}//fin class
