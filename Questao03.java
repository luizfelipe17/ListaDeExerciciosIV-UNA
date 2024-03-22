/*3. Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao03 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        
        System.out.print("Digite o seu nome: ");
            nome = ler.nextLine();

            while (nome.length() < 4){
                
                System.out.print("\nDigite no mínimo 3 caracteres do seu nome: ");
                    nome = ler.nextLine();
                
            }    
            
        System.out.print("Digite a sua idade: ");
            idade = ler.nextInt();
            
            while (idade < 0 || idade > 150){
                
                System.out.print("\nFavor informar uma idade válida: ");
                    idade = ler.nextInt();
                
            }
            
        System.out.print("Digite o seu salário: R$");
            salario = ler.nextDouble();
            
            while (salario < 0){
                
                System.out.print("\nInforme um valor de salário válido: R$");
                    salario = ler.nextDouble();
                
            }
            
            ler.nextLine();
            
            while (true) {
            
        System.out.print("Digite o seu sexo (M/F): ");
            sexo = ler.nextLine();
            
                if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                    
                    break;
                    
                }else {
                    
                    System.out.print("\n Por favor, informe seu sexo apenas com 'M' ou 'F'\n ");

                }
            
            }
            
            while (true){
                  
        System.out.print("Digite o seu estado civil ('S','C','V','D': ");
            estadoCivil = ler.nextLine();
            
                if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
                    
                    break;
                    
                }else {
                    
                    System.out.print("\nPor favor, informe seu estado civil apenas com 'S', 'C', 'V' ou 'D'");

                }
            
            }
            
        System.out.print("\n\nSegue as informações:\n"
                + "Nome: "+nome+"\n"
                        + "Idade: "+idade+"\n");
        System.out.printf("Salário: R$%.2f", salario);
        System.out.print("\nSexo: "+sexo+"\n"
                + "Estado Civil: "+estadoCivil);    
    }
    
}
