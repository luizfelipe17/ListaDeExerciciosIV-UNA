/*4 - Supondo que a população de um país A seja da ordem de 80000 habitantes
com uma taxa anual de crescimento de 3% e que a população de B seja 200000
habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para
que a população do país A ultrapasse ou iguale a população do país B,
mantidas as taxas de crescimento.
*/
package com.mycompany.pscexercicioiv;

public class Questao04 {
    public static void main (String[] args){
        
        int ano = 0;
        double taxaAnualA = 3, taxaAnualB = 1.5, populacaoPaisA = 80000, populacaoPaisB = 200000;
        
           
        
        while (populacaoPaisA < populacaoPaisB){
            
            populacaoPaisA += (populacaoPaisA * taxaAnualA / 100);
            populacaoPaisB += (populacaoPaisB * taxaAnualB / 100);
            
            ano++;
        }
        
        System.out.print("Será nescessário um total de: "+ano+" anos");

    }
}
