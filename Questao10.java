/*10. Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles.*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao10 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int numero1, numero2, intervalo, maiorNumero, menorNumero;
        
        System.out.println("Informe dois valores inteiros: ");
            numero1 = ler.nextInt();
            numero2 = ler.nextInt();
            
            
            maiorNumero = Math.max(numero1,numero2);
            menorNumero = Math.min(numero1, numero2);
            
            System.out.print("\nO intervalo dos número "+menorNumero+" e "+maiorNumero+" serão os números:\n");
            
        for (intervalo = menorNumero + 1; intervalo < maiorNumero; intervalo++){
            
            System.out.print(intervalo+" ");
            
        }
            
    }
}
