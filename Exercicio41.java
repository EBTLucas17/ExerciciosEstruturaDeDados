
package com.mycompany.exercicio41;

import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    int valor1, valor2, valor3, valor4, media;
  
    System.out.println("Digite um numero: ");
    valor1 = entrada.nextInt();

    System.out.println("Digite dois numeros: ");
    valor2 = entrada.nextInt();  
    
    System.out.println("Digite três numeros: ");
    valor3 = entrada.nextInt();  
    
    System.out.println("Digite quatros numeros: ");
    valor4 = entrada.nextInt();  
    
    media = ((valor1*1+valor2*2+valor3*3+valor4*4))/10;
    
    System.out.printf("A média "+media+"\n");
    
         
    }
}