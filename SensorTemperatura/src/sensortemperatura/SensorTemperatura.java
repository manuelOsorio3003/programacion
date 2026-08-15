/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensortemperatura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class SensorTemperatura {

    /**
     * @param args the command line arguments
     
     * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
     */
    /*
    1. Comprender el problema que se esta abordando
       a.Que datos de entrada necesito
       b.Transformacion / calculos necesarios
       c.Que resultados se presentan
    
    2. Vizualizacion / diseño de la solucion
       a. Diagrama Flujo
       b. Pseudocodigo
    
    3. Programacion incremental
       a. Listando las tareas a cumplir
          i. Declaracion de variables
          ii. Estructuras de seleccion
          iii. Ciclos d repeticion
          iv. Validaciones de datos
        b. Validacion
    
    4. Pruebas de escritorio
       a. Casos
       b. Escenarios
       c. Resultados/patrones definidos   
      */
    
    /*
    1.entradas:
      nombre de usuario
      numero de lecturas
      ingreso de temperatura
    2.Calculos / Transformaciones
      Formula Celsius - Farenheit
      Definicion de sobrecalentamiento
      Validacion de lecturas 0 > 50
      Contabilizar numero de sobrecalentamiento
      Promediar el monitoreo
      Validacion temperatura
    
    3. Salida
       Resumen estadistico
       alerta sobrecalentamiento    
    */
    
    /*
    Lista de tareas
    1. capturar el nombre de usuario
          a. Definicion de libreria/instancia Scanner
          b. declaracion de variable para el usuario
    2. captura de numero de lecturas
          a. declaracion de variable para numero de lectura 
    
    3. Generacion de temperatura
        a. generacion de libreria Random
        b. declaracion de variable
        c. mostrar el numero de random generado temporalmente
        d. rango de temp 200 -400
        e. ciclo de repeticion While
    
    4. Formula: F = (C * 9/5)+32
    5. Limite de sobrecalentamiento 350 C (662F)
       a. estructura de seleccion (IF /ELSE)
    6. validacion  de lectura (do while)
    7. Sumar los numeros de sobrecalentamiento
    8. Calcular el promedio
    9. mostrar el resumen y promedio, # de sobrecaletamiento
    10. generar una alerta de sobrecalentamiento
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String usuario = "f";
        int lecturas = 0;
        double tempC = 0;
        int ciclo = 0;
        double tempF = 0;
        int sobrecalentamiento = 0;
        double promedio = 0;
        double acumTemp = 0;
        
        System.out.println("Nombre de operario:");
        usuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar captura: %s\n",usuario);
        
        do{
         System.out.println("Numero de lecturas a tomar:");
         lecturas = sc.nextInt();
        //System.out.printf("Validacion numero de lecturas: %d\n",lecturas); 
        if(lecturas <0 || lecturas >50){
            System.out.println("valor no valido");
        }
        }while(lecturas <0 || lecturas >50);
        
       
        while(ciclo <   lecturas){
          tempC = rd.nextDouble(200,400);
          tempF = (tempC*9/5)+32;
        System.out.printf("Num Lec: %d\ttemp C: %.2f\n",ciclo+1,tempC);
        System.out.printf("Temp en Faren: %.2f\n",tempF);
        
        if (tempF >662){
            System.out.println("Alerta!!!!! Sobrecalentamiento");
            sobrecalentamiento++;
        }//fin if
        else {
            acumTemp +=tempF;
        }//fin else
            ciclo++;
        }//fin while
        promedio = acumTemp / lecturas;
        
        System.out.println("------------");
        System.out.println("     Resumen      ");
        System.out.println("");
        System.out.printf("Promedio de TEMP: %.2f\n",promedio);
        System.out.printf("# sobrecalentamiento: %d\n",sobrecalentamiento);
    }//fin main
    
}//fin class
