/* 1- Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o usuário
informe um valor válido*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao01 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);  
        
        double nota;
        
        System.out.print("Por favor, informe uma nota entre 0 e 10: ");
            nota = ler.nextDouble();
            
        while (nota < 0 || nota > 10){
            
            System.out.print("\nO valor informado é inválido!!!\n");
            System.out.print("\nInforme um valor válido: ");
                nota = ler.nextDouble();
           
        }    
        
            System.out.print("\n\nÓtimo, o valor informado foi "+nota);
        
        
    }
}
