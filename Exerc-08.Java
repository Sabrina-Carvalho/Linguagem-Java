/*Receba o valor de um depósito em poupança. calcule e mostre o valor após 1 mês 
de aplicação sabendo que rende 1,3% a.m.

VERIFICAR
*/

import java.util.Scanner;

public class ExercLt01_08 {
    public static void main(String[] args) {
        double depValor = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do depósito: ");
        depValor = scan.nextDouble();
        
        depValor = (depValor * 1.3);
        
        System.out.println("O valor do depósito após um mês de aplicação é de: " + depValor);
    }
    
}
