/*5. Altere o programa anterior permitindo ao usuário informar as populações e as
taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao05 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int ano = 0;
        double taxaAnualA, taxaAnualB, populacaoPaisA, populacaoPaisB;
        String repetir;
        
        System.out.println("Informe qual a população do Primeiro Pais e sua taxa de crescimento anual: ");
          System.out.print(" POPULAÇÃO: ");  
            populacaoPaisA = ler.nextDouble();
          System.out.print(" TAXA ANUAL: ");   
            taxaAnualA = ler.nextDouble();
            
        System.out.println("Informe qual a população do Segundo Pais e sua taxa de Crescimento Anual: ");
          System.out.print(" POPULAÇÃO: ");   
            populacaoPaisB = ler.nextDouble();
          System.out.print(" TAXA ANUAL: ");  
            taxaAnualB = ler.nextDouble();    
            
            
        if (taxaAnualA < taxaAnualB){
            
            System.out.print("\nA taxa de crescimento do Primeiro país tem que ser maior que a do Segundo pais!!!");
            
          
        } else {
        
        
        while (populacaoPaisA < populacaoPaisB){
            
            populacaoPaisA += (populacaoPaisA * taxaAnualA / 100);
            populacaoPaisB += (populacaoPaisB * taxaAnualB / 100);
            
            ano++;
        }
        
        System.out.print("\n\nSerá nescessário um total de: "+ano+" anos");

        System.out.print("\n\nGOSTARIA DE REPETIR A OPERAÇÃO (S/N): ");
            repetir = ler.next();
        
            while (repetir.equalsIgnoreCase ("S")) {
                
        System.out.println("\n\nInforme qual a população do Primeiro Pais e sua taxa de crescimento anual: ");
          System.out.print(" POPULAÇÃO: ");  
            populacaoPaisA = ler.nextDouble();
          System.out.print(" TAXA ANUAL: ");   
            taxaAnualA = ler.nextDouble();
            
        System.out.println("Informe qual a população do Segundo Pais e sua taxa de Crescimento Anual: ");
          System.out.print(" POPULAÇÃO: ");   
            populacaoPaisB = ler.nextDouble();
          System.out.print(" TAXA ANUAL: ");  
            taxaAnualB = ler.nextDouble();    
            
            
        if (taxaAnualA < taxaAnualB){
            
            System.out.print("\nA taxa de crescimento do Primeiro país tem que ser maior que a do Segundo pais!!!\n\n");
          
        } else {
        
        
        while (populacaoPaisA < populacaoPaisB){
            
            populacaoPaisA += (populacaoPaisA * taxaAnualA / 100);
            populacaoPaisB += (populacaoPaisB * taxaAnualB / 100);
            
            ano++;
        }
        
        System.out.print("\n\nSerá nescessário um total de: "+ano+" anos");

        System.out.print("\n\nGOSTARIA DE REPETIR A OPERAÇÃO (S/N): ");
            repetir = ler.next();
            
            }
            }
            }
    }
}
