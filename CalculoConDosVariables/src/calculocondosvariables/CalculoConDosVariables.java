/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocondosvariables;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class CalculoConDosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double base = 0;
        double altura = 0;
        double area = 0;
        double perimetro = 0;
        
        System.out.println("Sistema de calculo de area y perimetro de un rectangulo.");
        System.out.println("Ingrese cuanto mide la base del rectangulo en centimtetros");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese cuanto mide la altura.");
        altura = entrada.nextDouble();
        
        area = base * altura;
        perimetro = (base + altura) * 2;
        
        System.out.printf("El area del rectangulo es %.2f cm",area);
        System.out.printf("\nEl permitro del rectangulo es %.2f cm",perimetro);
        
    }//fin main
    
}//fin class
