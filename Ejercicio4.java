/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author natalias.romero
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner entrada = new Scanner (System.in);
    
    int horasTotales, semanas, dias, horas;
    
   System.out.println ("digiel el numero de horas");
  
    horasTotales = entrada.nextInt();
    
   semanas = horasTotales / 168;
   dias = horasTotales %168 / 24;
   horas = horasTotales%24;
   
   System.out.println ("el equivalente es:");
   System.out.println ("semana: "+semanas);
   System.out.println ("dias: "+dias);
   System.out.println ("horas: "+horas);
    }
    
}
