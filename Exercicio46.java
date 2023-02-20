
package com.mycompany.exercicio46;

import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in); 
    double valor1, resultado;

  
    System.out.println("Digite um valor: ");
    valor1 = entrada.nextInt();

    resultado = ((valor1*1.01));
    
    System.out.printf("O valor reajustado é " + resultado);
    
         
    }
}