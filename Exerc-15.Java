/* Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre 
a hipotenusa.
*/

import java.util.Scanner;

public class ExercLt01_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Insira o valor para o cateto oposto: ");
        a = scan.nextDouble();
        System.out.println("Insira o valor para o cateto adjacente: ");
        b = scan.nextDouble();
        
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.println("Valor da hipotenusa: " + c);
    }
    
    
}