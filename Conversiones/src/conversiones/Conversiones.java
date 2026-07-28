/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //declarar variables
        int pulgadas = 0;
        double resultadoCM = 0;
        double kilometros = 0;
        double millas = 0;
        double farenheit = 0;
        double celsius =0;
        
        pulgadas = 10;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
        pulgadas = 35;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n %.2f cm es igual a %d pulgadas ",resultadoCM,pulgadas);
        
        System.out.println("");
        System.out.println("Cuantos kilometros");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("\n %.2f km es igual a %.2f millas",kilometros,millas);
        System.out.println(kilometros +"km es igual a" + millas + "millas");
        
        System.out.println("ingrese grados farenheit");
        farenheit = teclado.nextDouble();
        celsius = (farenheit - 32) * 5/9; //orden de operaciones importa
        System.out.printf("%.2f farenheit es igual a %.2f celsius",farenheit,celsius);        

    }//fin main
    
}//fin conversiones
