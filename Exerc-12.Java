/* Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e 
quantos anos terá daqui a 17 anos.
*/

import java.util.Scanner;

public class ExercLt01_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ano_Atual, ano_Nasc, id_Atual, id_Fut;
        
        System.out.println("Insira seu ano de nascimento: ");
        ano_Nasc = scan.nextInt();
        
        System.out.println("Insira o ano atual: ");
        ano_Atual = scan.nextInt();
        
        id_Atual = ano_Atual - ano_Nasc;
        id_Fut = id_Atual + 17;
        
        System.out.println("Você tem " + id_Atual + " anos. E terá " + id_Fut + " anos daqui a 17 anos.");
    }
}