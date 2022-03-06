//Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

import java.util.Scanner;

public class Exerc37{
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    int n1 = 1;
    int n2 = 0;
    int n_Termo;
    
    System.out.println("Insira um valor para a sequência de Fibonacci: ");
    n_Termo = scan.nextInt();
        
    for (int i = 1; i <= n_Termo; i++){
        if (i < 2){
          
            System.out.println(1);
        } 
        else{
        n1 = n1 + n2;
        n2 = n1 - n2;
    
        System.out.println(n1);
        }
    }
    
    }
          
}