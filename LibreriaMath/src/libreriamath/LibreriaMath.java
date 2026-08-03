/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriamath;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class LibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double radio = 0;
        double area = 0;
        double circunferencia = 0;
        
        System.out.println("Sistema de calculo de area y circunferencia de un circulo");
        System.out.println("Ingrese cual es el radio del circulo");
        radio = entrada.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.printf("El area del circulo es %.2f ",area);
        System.out.printf("\nLa circunferencia del circulo es %.2f",circunferencia);
        
        
        
        
        
    }//fin main
    
}//fin class
