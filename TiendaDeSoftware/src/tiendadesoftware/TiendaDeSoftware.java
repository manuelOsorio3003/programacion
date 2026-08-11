/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadesoftware;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class TiendaDeSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        double juego = 0;
        double descuentoAplicado = 0;
        double descuento = 0.10;
        int edad = 0;
        char membresia = 'a';
        
        System.out.println("Ingrese el precio del juego:");
        juego = sc.nextDouble();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Tiene membresia con la tienda? S/N ");
        sc.nextLine();
        membresia = sc.nextLine().toUpperCase().charAt(0);
      
        if (edad>=18){
            if(edad>=65 || membresia=='S'){
                descuento = descuento + 0.10;
            }
            else{
                descuento = 0.10;
            }
        }//fin if
        if (edad<18){
            if (edad>=12 && membresia=='S'){
                descuento = descuento+0.05;
            }
            else {
                descuento = 0;
            }//fin else
        }//fin segundo if
        
        descuentoAplicado = juego * descuento;
        total = juego - descuentoAplicado;
        
        System.out.printf("Precio del juego: %.2f \n",juego);
        System.out.printf("Descuento aplicado: %.2f \n",descuentoAplicado);
        System.out.printf("Total a pagar: %.2f",total);
        
    }//fin de main
    
}//fin de class
