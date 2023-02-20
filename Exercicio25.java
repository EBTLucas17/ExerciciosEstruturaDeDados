
package com.mycompany.exercicio25;
import java.util.Scanner;
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.print("*Digite a data no formato DDMMAA*\n");
            String dia = leitor.next();
            String mes = leitor.next();   
            String ano = leitor.next();  
            System.out.println("Dia:"+dia+"\n" +"Mês:"+mes+"\n" +"Ano:"+ano+"\n");
    }
}
