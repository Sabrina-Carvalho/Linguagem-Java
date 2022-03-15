//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

import java.util.Scanner;

public class Exerc44 {
    //PROGRAMA PRINCIPAL
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double base, exp; 
        
        System.out.println("Insira o número para a base: ");
        base = scan.nextDouble();
        
        System.out.println("Insira o número para o expoente: ");
        exp = scan.nextDouble();
        
        System.out.println("O valor da potência é: " + FunçãoPot(base, exp));
    }
    
    static double FunçãoPot(double base_Pot, double exp_Pot){
        double total;
        
        total = Math.pow(base_Pot, exp_Pot);
        return total;
    }
}

