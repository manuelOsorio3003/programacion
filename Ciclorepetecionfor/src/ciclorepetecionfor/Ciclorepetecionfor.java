/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepetecionfor;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class Ciclorepetecionfor {

    /**
     * Se quiere contabilizar la cantidad
     * de minutas que se entregan a los ninos
     * y ninias en una fiesta. Con ello sacar
     * el porcentaje de cuantos fueron ninios
     * y ninias.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<10 ; i++){
            System.out.printf("valor: %d\n",i);
        }//fin for
        
        System.out.println("");
        System.out.println("2do ciclo");
        
        for (int i = 2; i < 10; i+=2) {
            System.out.printf("valor: %d\n",i);

        }//fin for
        
        final int TOTAL = 10;
        int numeroVaron = 0;
        int numeroMujer = 0;
        char seleccion = 'a';
        double porcentaje = 0;
        
        for (int i = 0; i < TOTAL; i++) {
            System.out.println("Quien viene por minuta");
            System.out.println("V:Varon / M:Mujer");
            System.out.println("Respuesta:");
            seleccion = sc.next().toUpperCase().charAt(0);
            
            switch (seleccion){
    case 'V':
        System.out.println("Varon comiendo minuta");
        numeroVaron++;
        break;
        
    case 'M':
        System.out.println("Mujer comiendo minuta");
        numeroMujer++;
        break;
        
    default:
        System.out.println("Opcion no valida");
        break;
}//FIN SWITCH
        }//FIN FOR

System.out.printf("Numero de varones: %d\n",numeroVaron);
        System.out.printf("Numero de mujeres: %d",numeroMujer);
        
        System.out.println("Porcentaje de varones");
        porcentaje = (double)numeroVaron / TOTAL;
        System.out.printf("%.2f",porcentaje);
        
        System.out.println("Porcentaje de mujeres");
        porcentaje = (double)numeroMujer / TOTAL;
        System.out.printf("%.2f",porcentaje);
        
    }//fin main
    
}//fin class
