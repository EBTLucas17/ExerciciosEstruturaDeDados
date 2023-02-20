
package com.mycompany.exercicio44;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        double log = 0;
        double base  = 0;
        
        System.out.println("Digite um valor: ");
        log = entrada.nextDouble();
        
        System.out.println("Digite o valor da base: ");
        base = entrada.nextDouble();
        
        System.out.println(log(base,log));
    }
    public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
}
