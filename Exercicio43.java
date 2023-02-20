
package com.mycompany.exercicio43;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        double valor1 = 0;
        System.out.println("Digite um valor: ");
        valor1 = entrada.nextDouble();
        
        System.out.println(log(10,valor1));
    }
    public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
}
