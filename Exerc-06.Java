/*Receba os valores em x e y. Efetue a troca de seus valores e mostre seus 
conteúdos.
*/

import  java.util.Scanner;

public class ExercLt01_06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x, y, z;
        
        
        System.out.println("Insira um valor para X: ");
        x = scan.nextFloat();
        System.out.println("Insira um valor para Y: ");
        y = scan.nextFloat();
        
        z = x + 0;
        x = y + 0;
        y = z + 0;
                
        System.out.println("Novo valor de x: " + x);
        System.out.println("Novo valor de y: " + y);
                 
    }
}
