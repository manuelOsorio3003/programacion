/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class TiempoRelax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionSubmenu = 'a';
        
        System.out.println("Agencia de viajes");
        System.out.printf("|%20s| |%-20s| \n","Taniha´s Travel","Buen Viaje");
        System.out.println("-------------------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        switch(seleccionMenu){
            case 1:
                System.out.println("Bienvenido a Japon");
                System.out.println("-------------");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.print("Respuesta: ");
                sc.nextLine();
                seleccionSubmenu = sc.nextLine().toUpperCase().charAt(0);
                switch (seleccionSubmenu){
                    case 'A':
                        System.out.println("Super Nintendo");
                        break;
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                    case 'C':
                        System.out.println("Pabellon Dorado");
                        break;
                    default:
                        System.out.println("Cualquier Ciudad");
                        System.out.println("Porque no esta la opcion");
                        break;
                }//fin switch submenu
               break;
            case 2:
                System.out.println("Bienvenue en France");
                System.out.println("-------------------");
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.println("Respuesta: ");
                sc.nextLine();
                seleccionSubmenu = sc.nextLine().toUpperCase().charAt(0);
                switch (seleccionSubmenu){
                    case '1':
                        System.out.println("Torre Eifel");
                        break;
                    case '2':
                        System.out.println("Palacio de massella");
                        break;
                    case '3':
                        System.out.println("El estadio");
                        break;
                    default:
                        System.out.println("no esta la opcion seleccionada");
                        break;
                } //fin submenu              
                break; 
            case 3:
                System.out.println("Nau mai, haere mai!");
                System.out.println("-------------------");
                System.out.println("A. Hamilton");
                System.out.println("B. Dunedin");
                System.out.println("C. Napier");
                System.out.println("Respuesta: ");
                sc.nextLine();
                seleccionSubmenu = sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubmenu == 'A'){
                    System.out.printf("%s Hamilton %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubmenu =='B'){
                    System.out.printf("%s Dunedin %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubmenu =='C'){
                    System.out.printf("%s Napier %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
               break; 
            case 4:
                System.out.println("Bienvenido a Canada");
                System.out.println("Welcome to Canada");
               break; 
                
                
                
                
        }//fin switch
        
        
        
    }//fin main
    
}//fin class
