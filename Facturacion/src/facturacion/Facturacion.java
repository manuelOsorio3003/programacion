/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

import java.util.Scanner;

/**
 *
 * @author mosorio
 */
/**
estrcutura de uan funcion
acceso de la funcion
public, private, protected
tipo de dato retorna/devuelve
int,double,char,string
nombre de la funcion
parametro de trabajo
int,bolean,chat etc

*/
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        //1ra funcion
        MensajeBienvenida();
        
        System.out.print("Ingresa el Precio del Producto: ");
        precioProducto = scan.nextInt();
        precioProducto = ValidacionNumerica(precioProducto,scan);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scan.nextInt();
        cantidad = ValidacionNumerica (cantidad,scan);
        subTotal = precioProducto * cantidad;
        if(subTotal >100){
            descuento = subTotal *0.10;
        }
        else{
            descuento = 0;
        }
        
        impuesto = (subTotal - descuento)*ISV;
        
        total = subTotal - descuento + impuesto;
        
        //4ta funcion
        ResultadoFactura(subTotal,descuento,impuesto,total);
        
    }//fin main

public static void MensajeBienvenida(){
     System.out.println("---------------------------");
        System.out.println(" Sistema de Facturacion");
        System.out.println(" La logica de Programacion");
        System.out.println("---------------------------");
}//fin funcion    
public static int ValidacionNumerica(int numero, Scanner input){
    int numeroValido = numero;
    final int LIMITE = 0;
    
    do{
        if (numeroValido<LIMITE){
            System.out.println("Valor numerico no puede");
            System.out.println("ser menor a 0");
            System.out.println("ingrese el dato nuevamente");
            numeroValido = input.nextInt();
        }
    }while(numeroValido<LIMITE);
    return numeroValido;
}
public static void ResultadoFactura(double sub, double des, double imp, double tot){
    System.out.printf("\nSubtotal: %.2f",sub);
        System.out.printf("\nDescuento: %.2f",des);
        System.out.printf("\nImpuesto: %.2f",imp);
        System.out.printf("\nPrecio a Pagar: %.2f",tot);
        
}
}//fin class
