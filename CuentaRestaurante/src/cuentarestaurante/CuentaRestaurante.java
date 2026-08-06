/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class CuentaRestaurante {
//desarrolar simulacion de cuenta de un restaurante que se tiene que pagar entre 7 divido en partes iguales
    /**
     * @param args the command line arguments
     */
    
    /*
    ciclos de repeticion
    1. While
    2. Do - While
    3. For
    
    componentes de repeticion
    1. variable de control 
    2. Condicion - limite de repeticion
    3. Modificador de la variable de control
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double pago = 0;
        int gasto = 0;
        int numpersona = 1; //variable de control
        int gastoacumulado = 0; //acumulador
        double promedio = 0;
        
        while (numpersona<=7){
            System.out.printf("persona %d cuanto consumio",numpersona);
            gasto = sc.nextInt();
            
            gastoacumulado += gasto;// suma de los gastos
            System.out.printf("P: %d\tgasto Ind: %d\tgasto acum: %d",
                    numpersona,
                    gasto,
                    gastoacumulado);
            System.out.println("");
            //numpersona = numpersona +1; // numpersona += 1;
            
            numpersona++;
                        
        }//fin de while
        numpersona--; // post decremento unitario
        System.out.printf("\ntotal de personas: %d",numpersona);
        promedio = gastoacumulado / numpersona;
        System.out.printf("Promedio: %.2f",promedio);
        
        
        
        
        
    }//fin main
    
}//fin class
