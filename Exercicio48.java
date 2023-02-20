
package com.mycompany.exercicio48;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        double salario, quilow, preco, valorReais,valorDesconto; 
   
        System.out.println("Quanto você recebe de salario?: ");
        salario = entrada.nextInt();
        
        System.out.println("Quantos quilowatts gasta na sua casa?: ");
        quilow = entrada.nextInt();
        
        preco = ((salario/7));
         valorReais = ((preco*quilow));
          valorDesconto = ((valorReais*0.9));
        
        System.out.println("Valor em Quilowatt: " + preco + "Valor a ser pago: " + valorReais + "Valor com desconto" + valorDesconto);  
    }
   
}
