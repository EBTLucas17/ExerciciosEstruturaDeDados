
package com.mycompany.exercicio40;

import java.util.Scanner;

public class Exercicio40 {

   public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in); 
    int valor1, valor2, quociente, resto;
  
    System.out.println("Digite um dividendo: ");
    valor1 = entrada.nextInt();

    System.out.println("Digite um divisor: ");
    valor2 = entrada.nextInt();  
 
    quociente = ((valor1/valor2));
    resto = ((valor1%valor2));
    
    System.out.printf("O dividendo é "+valor1+"\n");
    System.out.printf("O divisor é "+valor2+"\n");
    System.out.printf("O quociente é "+quociente+"\n");
    System.out.printf("O resto é "+ resto+"\n");
         
    }
}