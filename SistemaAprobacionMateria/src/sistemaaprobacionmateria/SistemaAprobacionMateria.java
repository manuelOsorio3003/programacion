/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaprobacionmateria;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class SistemaAprobacionMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String estudiante = "a";
        double examen1= 0;
        double examen2= 0;
        double promedio= 0;
        
        System.out.println("Sistema de calculo de aprobacion de materia");
        System.out.println("Ingrese su nombre:");
        estudiante = sc.nextLine().toUpperCase();
       
        System.out.println("Ingrese su nota del primero examen:");
        examen1= sc.nextDouble();
        System.out.println("Ingrese su nota del segundo examen:");
        examen2= sc.nextDouble();
        promedio = (examen1 + examen2)/2;
        
        if (promedio>=65.0){
            System.out.printf("Aprobado. %s su promedio es %.2f",estudiante,promedio);
        }//fin if
        else{
            System.out.printf("Reprobado. %s Su promedio es %.2f",estudiante,promedio);
        }//fin else
              
    }//fin main
    
}//fin class
