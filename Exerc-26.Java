// Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        boolean teste;
        
        System.out.println("Insira um valor inteiro: ");
        num1 = scan.nextInt();
        
        System.out.println("Insira outro valor inteiro: ");
        num2 = scan.nextInt();
      
        if(num1 >= num2){
           if(num1 % num2 == 0) {
            System.out.println("O maior valor é múltiplo do menor valor!!");
           }
        }
        else
            if(num2 % num1 == 0){
                System.out.println("O maior valor é múltiplo do menor valor!!");
             
            }
                  
    }
}
