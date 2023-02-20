
package com.mycompany.exercicio26;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);
            System.out.print("*Digite a data no formato DDMMAA*\n");
            String dia = leitor.nextInt();
            String mes = leitor.next();   
            String ano = leitor.next();  
            System.out.print("*A Data será mostrada no formato MMDDAA*\n");
            System.out.println("Mês:"+mes+"\n" + "Dia:"+dia+"\n"  +"Ano:"+ano+"\n");
    }
}