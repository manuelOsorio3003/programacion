/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        char calculadora = 'a';
        int dato1 = 0;
        int dato2 = 0;
        int Resultado = 0;
        
        System.out.println("Elija el tipo de opracion a realizar:");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Division");
        System.out.println("D. Multiplicacion");
        System.out.println("E. Porcentaje");
        calculadora = sc.nextLine().toUpperCase().charAt(0);
        
        switch (calculadora){
            case 'A':
                System.out.println("Ingrese el primer dato a sumar:");
                dato1 = sc.nextInt();
                System.out.println("Ingrese el segundo dato a sumar");
                dato2 = sc.nextInt();
                Resultado = dato1 + dato2;
                System.out.printf("Resultado: %d",Resultado);
                break;
            case 'B':
                System.out.println("Ingrese el primer dato a restar:");
                dato1 = sc.nextInt();
                System.out.println("Ingrese el segundo dato a restar:");
                dato2 = sc.nextInt();
                Resultado = dato1 - dato2;
                System.out.printf("Resultado: %d",Resultado);
                break;
            case 'C':
                System.out.println("Ingrese el primer dato a dividir:");
                dato1 = sc.nextInt();
                System.out.println("Ingrese el segundo dato a dividir:");
                dato2 = sc.nextInt();
                if (dato2 != 0) {
                    Resultado = dato1 / dato2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero");               
                }              
                System.out.printf("Resultado: %d",Resultado);
                break;
            case 'D':
                System.out.println("Ingrese el primer dato a multiplicar:");
                dato1 = sc.nextInt();
                System.out.println("Ingrese el segundo dato a multiplicar:");
                dato2 = sc.nextInt();
                Resultado = dato1 * dato2;
                System.out.printf("Resultado: %d",Resultado);
                break;
            case 'E':
                System.out.println("Ingrese el dato al cual se sacara el porcentaje:");
                dato1 = sc.nextInt();
                System.out.println("Ingrese el porcentaje:");
                dato2 = sc.nextInt();
                Resultado = (dato1 * dato2) /100;
                System.out.printf("Resultado: %d",Resultado);
                break;
            default:
                System.out.println("Operador no reconocido");
                break;
        }//fin switch
               
    }//fin main
    
}//fin class
