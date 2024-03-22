/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a
senha igual ao nome do usuário, mostrando uma mensagem de erro e
voltando a pedir as informações.*/
package com.mycompany.pscexercicioiv;
import java.util.*;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
            
        String nome, senha;
        
        
        System.out.println("Digite o seu usuário e senha, respectivamente: ");
            nome = ler.nextLine();
            senha = ler.nextLine();
        
            
        while (senha.equals(nome)){
            
            System.out.print("\nSenha inválida.\nA senha tem que ser diferente do usuário\n\n");
            System.out.println("Digite a nova senha");
                senha = ler.nextLine();
                    
        } 
        
        System.out.print("\n\nBEM VINDO, "+nome+"\nLOGIN REALIZADO COM SUCESSO!!!");
            
    }
}
