/*7. Faça um programa que leia 5 números e informe o maior número.
*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao07 {
    public static void main(String[] args){
        
       Scanner ler = new Scanner (System.in); 
        
       double num1, num2, num3, num4, num5;
        
       System.out.println("Informe 5 números: ");
            num1 = ler.nextDouble();
            num2 = ler.nextDouble();    
            num3 = ler.nextDouble();
            num4 = ler.nextDouble();
            num5 = ler.nextDouble();
            
       double maiorValor = num1;    
           
       if (num2 > maiorValor){
           
           maiorValor = num2;
           
       }if (num3 > maiorValor){
           
           maiorValor = num3;
           
       }if (num4 > maiorValor){
           
           maiorValor = num4;
           
       }if (num5 > maiorValor){
           
           maiorValor = num5;
           
       }      
  
       System.out.print("O maior número informado foi o: "+maiorValor);
            
    }
}
