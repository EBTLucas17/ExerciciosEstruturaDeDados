
package com.mycompany.exercicio42;

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    double valor1, resultado;
    double pi=3.14;
  
    System.out.println("Digite um ãngulo em graus: ");
    valor1 = entrada.nextInt();

    resultado = ((valor1*pi/180));
    
    System.out.printf("A média " + resultado);
    
         
    }
}