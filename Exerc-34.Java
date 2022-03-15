//Receba um número. Calcule e mostre os resultados da tabuada desse número.

import java.util.Scanner;

public class Exerc34 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num, i;
        float soma;
        
        System.out.println("Insira um valor inteiro");
        num = scan.nextInt();
        
        for(i = 0; i <= 10; i++){
            soma = num * i;
            System.out.println(num + " + " + i + " = " + soma);
        }
    }
    
}