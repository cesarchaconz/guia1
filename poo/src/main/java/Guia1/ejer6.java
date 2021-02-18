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
public class ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num; 
      
       Scanner teclado = new Scanner (System.in);
       System.out.println("introduce un numero ");
       
       num= teclado.nextInt();
      
       if (num  <0){
           
           System.out.println("el numero"+num+"es negativo\n");
             
       }
       else{
           System.out.println("el numero"+num+"es positivo\n");
       
       }
       
       if (num%2==0){
           
          System.out.println("el numero " +num+" es par\n");
       
       }
        else{
           System.out.println("el numero " +num+ " es inpar\n");
       
       }
        
    }
    
}
