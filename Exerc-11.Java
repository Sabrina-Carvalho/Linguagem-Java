/* Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/

import java.util.Scanner;

public class ExercLt01_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r, C;
        
        System.out.println("Insira um valor para o raio da circunferência: ");
        r = scan.nextDouble();
        
        C = 2 * 3.14 * r;
        
        System.out.println("O valor da circunferência é de: " + C);
        
    }
}