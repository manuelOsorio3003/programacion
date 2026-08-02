/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class DonacionDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //AND && Y
        //OR ||  O
        //NOT ! NEGACION
        
        Scanner teclado = new Scanner(System.in);
        
        int edad = 0;
        int peso = 0;
        char desayuno = 'A';
        int niveles = 0;
        String genero = "x";
        
        System.out.println("Ingrese la edad.");
        edad = teclado.nextInt();
        
        System.out.println("Ingrese el peso.");
        peso = teclado.nextInt();
        
        System.out.println(peso);
        System.out.println(edad);
        teclado.nextLine();
        
        if (edad >= 18 && edad <= 65 && peso >= 110) {

            System.out.println("ya comio?");
            desayuno = teclado.nextLine().charAt(0);
            if (desayuno == 's' || desayuno == 'S') {

                System.out.println("si puede donar");
            } else {
                System.out.println("necesita comer");
            }
        } else {
            System.out.println("no puede donar");
        }
        
        System.out.println("niveles de hierro");
        niveles = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("cual es su genero");
        genero = teclado.nextLine().toUpperCase();
        
        if ((niveles>=14 && genero.equals ("MASCULINO")) || (niveles>=12 && genero.equals("FEMENINO"))){
            System.out.println("puede donar");
        }
        else {
            System.out.println("no puede donar lo siento");
        }
    }//fin main
    
}//fin class
