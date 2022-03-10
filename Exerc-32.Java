//Receba um número inteiro. Calcule e mostre o seu fatorial.


import java.util.Scanner;

public class Exerc32{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double n1, num = 0;
        double soma = 1; 
        
        System.out.println("Insira um número inteiro: ");
        num = scan.nextInt();
        n1 = num;
        if(num > 1){
            while(num > 1){
                soma =(soma*(num)); 
                num--;
            }   
        
        System.out.println("O fatorial de " + n1 + " é: " + soma);
        }
        else
            if(num == 0){
            System.out.println("O fatorial de 0 é 1.");
        }
        else{
            System.out.println("**ERRO** ");
            System.out.println("**Insira outro valor** ");
        }
    }
}
