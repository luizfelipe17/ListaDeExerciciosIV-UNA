/*6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
outro. Depois modifique o programa para que ele mostre os números um ao
lado do outro.
*/
package com.mycompany.pscexercicioiv;


public class Questao06 {
    public static void main (String[] args){
        
        int valores = 0;
        
        for (valores = 0; valores <=20; valores++){
            
            System.out.println(+valores);    
                
        }
        
                    System.out.print("\n");
        
        for (valores = 0; valores <=20; valores++){

            System.out.print(+valores+" ");  
                
        }
        
        
        
    }
}
