/* Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e 
mostre o resultado da somatória dos números ímpares entre esses valores.
*/
  

import java.util.Scanner;

public class Exerc35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num1, num2, soma;
      
        soma = 0;
        System.out.println("Insira um valor inteiro: ");
        num1 = scan.nextFloat();
        
        System.out.println("Insira outro valor inteiro: ");
        num2 = scan.nextFloat();
        
        if(num1 == num2){
            System.out.println("***ERRO***");
            System.out.println("**INSIRA OUTROS VALORES***");
        }
        else
            if(num1 > num2){
                while(num2 < num1){
                    if(num2 % 2 != 0){
                        soma = soma + num2;
                    
                    }
                    num2++;
                }
            }
        else
                while(num1 < num2){
                    if(num1 % 2 != 0){
                        soma = soma + num1;
                    
                    }
                    num1++;
                }
        System.out.println("O valor da somatória dos ímpares entre os valores " + num1 + " e " + num2 + " é: " + soma);

             
    }      
}
