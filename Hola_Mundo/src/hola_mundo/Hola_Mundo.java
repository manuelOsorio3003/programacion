/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

import java.util.Set;

/**
 *
 * @author mosorio
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("hola me llamo Manuel");
        System.out.println("mi primer programa");
        
        System.out.print("vamos camino a");
        System.out.print("la clase de");
        System.out.print("progra");
        System.out.println("");
        
        System.out.printf("Tu apellido es %S \n","osorio");
        //System.out.println("");
        
        System.out.printf("%S Tu apellido es","osorio");
        System.out.println("");
        
        System.out.printf("Tu apellido %S es \n","osorio");
        System.out.println("Hola \n este es \n un nuevo");
        System.out.println("hola \t este es \t un nuevo");
        
        //variables
        int edad; //tipo entero
        double peso; //tipo Decimal
        char inicial; //tipo caracter letras digitos simbolos especiales  
        String nombre; //tipo cadena
        boolean estado; //tipo estado true / false
        
        edad = 21;
        peso = 60.5;
        inicial = 'D';
        nombre = "Manuel";
        
        System.out.printf("Tengo %d anios \n" ,edad);
        System.out.printf("Mi peso ideal es %.2f \n" ,peso);
        System.out.printf("Dime %c por mi inicial \n" ,inicial);
        System.out.printf("%s es mi nombre \n" ,nombre);
        
        System.out.printf("%s",nombre);
                
    }//fin de main
    
    }//fin de class
