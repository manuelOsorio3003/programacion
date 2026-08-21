/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensortemp;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class Sensortemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
      double temp = 0;
      double tempAbso = -273.15;//temperatura absoluta
      int rep = 0; //ciclos de repeticion
      double sumTemp= 0;
      double promedio = 0;
      double tempMax = 0;
      double tempMin = 0;
      double tempDif = 0;
      int centinela = -999;
      
      
      System.out.println("Sensor de temperatura");
      while(temp != centinela){       
          System.out.println("\nIngrese la temperatura detectada");
          temp = sc.nextDouble();
          
          if (temp < tempAbso){
              System.out.println("Valor no permitido");
          }
          else {
               if (rep == 0) {
        tempMax = temp;
        tempMin = temp;
          }
          else {
              if (temp > tempMax){
                  tempMax = temp;
              }
              if (temp < tempMin){
                  tempMin = temp;
              }
               
              }
               sumTemp += temp;
               rep++;
               
               System.out.printf("sumTemp: %.2f\t",sumTemp);
               System.out.printf("Numero de repeticion:%d\t",rep);
               System.out.printf("temp max:%.2f | tempmin:%.2f",tempMax,tempMin);
          }
      }//fin ciclo while
        promedio = sumTemp/rep;
        tempDif = tempMax - tempMin;
        System.out.printf("Promedio %.2f\n",promedio);
        System.out.printf("DiFERENCIA TEMP: %.2f",tempDif);
        
    }//fin main
    
}//fin class
