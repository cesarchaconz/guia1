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
public class ejer4 {
    
    public static void main (String[] args) {
    
    System.out.println ("Inicio del programa");
    System.out.println ("Introducir dos numeros enteros por favor");
    
    int numero1;
    int numero2;
    int resultado;        
    Scanner entradaEscaner = new Scanner (System.in);
    
    numero1 = entradaEscaner.nextInt();
    numero2 = entradaEscaner.nextInt();
    resultado = numero1 + numero2;
    
    System.out.println("la sumatoria de los dos numeros ingresados por teclado es:"+ resultado);
    
    }
    
}
