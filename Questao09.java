/*9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e
50.*/
package com.mycompany.pscexercicioiv;

public class Questao09 {
    public static void main (String[] args){
        
        int impares;
        
        System.out.print("Os valores ímpares entre 1 e 50 são:\n "); 
        
        for (impares = 1; impares < 50; impares++){
            
            
           if (impares % 2 != 0){
              
            System.out.print(impares+" ");
            
           } 
        }        
    }
}
