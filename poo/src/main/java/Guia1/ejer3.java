/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class ejer3 {
    
   public static void main (String[] args) {
      
       System.out.println("inicio del programa");
        System.out.println ("introducir unda cadena de texto porfavor :");
        
        String entradaTeclado = ""; 
        Scanner entradaEscaner = new Scanner (System.in);
        
        entradaTeclado =  entradaEscaner.nextLine ();
        
        System.out.println("lo que se escribio por el teclado es \"" + entradaTeclado + "\"");
       
       
   }
                 
    
}
