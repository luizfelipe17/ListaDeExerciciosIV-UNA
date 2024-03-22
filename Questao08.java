/*8. Faça um programa que leia 5 números e informe a soma e a média dos
números.*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao08 {
    public static void main(String[] args){
        
       Scanner ler = new Scanner (System.in); 
        
       double num1, num2, num3, num4, num5, soma, media;
        
       System.out.println("Informe 5 números: ");
            num1 = ler.nextDouble();
            num2 = ler.nextDouble();    
            num3 = ler.nextDouble();
            num4 = ler.nextDouble();
            num5 = ler.nextDouble();
            
        soma = num1 + num2 + num3 + num4 + num5;
        media = soma / 5;
          
        System.out.printf("A total da soma entre os números será: %.2f",soma);
        System.out.printf("\nA média foi de: %.2f",media);
    }        
}
