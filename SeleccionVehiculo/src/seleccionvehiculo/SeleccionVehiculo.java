/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
public class SeleccionVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int cantidadlitros=0;
        char respuestatipo ='a';
        String respuestacadena = "Manuel";
        
        System.out.println("me dijeron que eres duenio de un vehiculo \"verde\"");
        System.out.println("tienes que echarle biodiesel");
        System.out.print("cuantos litros agarra");
        cantidadlitros= entrada.nextInt();
        
        if(cantidadlitros>30){
        System.out.println("es un vehiculo con");
        System.out.println("grandes capacidades");
        }
        System.out.println("");
        entrada.nextLine();//lim´piar buffer
        System.out.println("Tu vehiculo es diesel? x=si, y=no");
        respuestatipo = entrada.nextLine().charAt(0);
        
        if (respuestatipo =='x'){
            System.out.println("si es diesel");
        }      
        else{
            System.out.println("mal carro");
        }
        
        System.out.println("");
        
        System.out.println("tu carro es eficiente");
        respuestacadena = entrada.nextLine();
        System.out.printf("\n respuesta ingresada %s",respuestacadena);
        
        /*System.out.println("\n seguro que es asi");
        respuestacadena = entrada.nextLine().toUpperCase();
        System.out.printf("respuesta ingresada %s",respuestacadena);
        
        System.out.println("\n 100% seguro?");
        respuestacadena = entrada.nextLine().toLowerCase();
        System.out.printf("respuesta ingresada %s",respuestacadena);*/

if (respuestacadena.equals("si")){
    System.out.println("excelente");
}
else{
    System.out.println("que mal");
}
        
        
        
    }//fin de main
    
}//fin de class
