/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author natalias.romero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          
     Scanner entrada = new Scanner (System.in);
     float nota1, nota2, nota3, suma;
     
     
   System.out.println ("Digite 3 calificaciones ");
   
   nota1 = entrada.nextFloat();
     
   nota2 = entrada.nextFloat();
     
   nota3 = entrada.nextFloat(); 
   
   
   suma = nota1+nota2+nota3;
     
    }
    
}
