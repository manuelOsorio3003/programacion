/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class ConversorUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        double magnitud = 0;     
        double Res = 0;
        double Res2 = 0;
        double Res3 = 0;
        
        System.out.println("Conversor de Unidades");
               
        do{
          System.out.println("\nElija las unidades a medir:");
          System.out.println("1. Metros a Pies");
          System.out.println("2. Kilogramos a libras");
          System.out.println("3. Centimetros a pulgadas");
          System.out.println("4. Salir");
          opcion = sc.nextInt();
          
          switch(opcion){
              case 1:
                  System.out.println("ingrese el dato a convertir a pies");
                  magnitud = sc.nextDouble();
                while(magnitud <0){
                    System.out.println("Error. No puede ingresar un valor menor a 0");
                    System.out.println("Vuelva a ingresar el dato");
                    magnitud = sc.nextDouble();
                }
                   Res = magnitud * 3.28;//metros a pies
                   System.out.printf("%.2f metros son: %.2f pies",magnitud,Res);
                  break;
              case 2:
                  System.out.println("ingrese el dato a convertir a libras");
                  magnitud = sc.nextDouble();
                while(magnitud <0){
                    System.out.println("Error. No puede ingresar un valor menor a 0");
                    System.out.println("Vuelva a ingresar el dato");
                    magnitud = sc.nextDouble();
                }
                   Res = magnitud * 2.2;//kilogramos a libras
                   System.out.printf("%.2f kilogramos son: %.2f libras",magnitud,Res);
                  break;
              case 3:
                  System.out.println("ingrese el dato a convertir a pulgadas");
                  magnitud = sc.nextDouble();
                while(magnitud <0){
                    System.out.println("Error. No puede ingresar un valor menor a 0");
                    System.out.println("Vuelva a ingresar el dato");
                    magnitud = sc.nextDouble();
                }
                   Res = magnitud / 2.54;//centimetros a pulgadas
                   System.out.printf("%.2f centimetros son: %.2f pulgadas",magnitud,Res);
                  break;
              case 4:
                  System.out.println("saliendo");
                  break;
              default:
                  System.out.println("Opcion no existe");
                  break;
          }//fin switch
                 
          
          
        }//FIN DO
        while(opcion !=4);
    }//fin main
    
}//fin class
