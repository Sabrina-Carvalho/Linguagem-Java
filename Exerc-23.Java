/* Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor nõa necessariamente
e ordem. Mostre os 4 números em ordem crescente.
*/

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num1, num2, num3, num4;
        
        System.out.println("INSIRA 3 VALORES, OBRIGATORIAMENTE, EM ORDEM CRESCENTE");
        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextFloat();
        
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextFloat();
        
        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextFloat();
        
        System.out.println("AGORA, INSIRA UM NÚMERO ALEATÓRIO");
        System.out.println("Insira o quarto valor: ");
        num4 = scan.nextFloat();
        
        if(num4 >= num3){
            System.out.println("A ordem dos valores são: " + num1 + ", " + num2 + ", " + num3 + " e " + num4);
        }
        else
            if((num4 >= num2) && (num4 <= num3)){
                System.out.println("A ordem dos valores são: " + num1 + ", " + num2 + ", " + num4 + " e " + num3);
            }
            else
                if ((num4 >= num1) && (num4 <= num2)){
                    System.out.println("A ordem dos valores são: " + num1 + ", " + num4 + ", " + num2 + " e " + num3);
                }
                else{
                    System.out.println("A ordem dos valores são: " + num4 + ", " + num1 + ", " + num2 + " e " + num3);
                }
                        
    }
}
