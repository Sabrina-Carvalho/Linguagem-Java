//Receba um número. Calcule e mostre a soma da série:

import java.util.Scanner;

    public class Exerc33{
        public static void main(String[] args){
            float c = 0;
            float n, soma = 0;
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite um número: ");
            n = scan.nextFloat();

               while(c < n){
                    c = c + 1;
                    soma = soma + (1/c);
                }

            System.out.println("A soma da série é: " + soma);
        }
    }

