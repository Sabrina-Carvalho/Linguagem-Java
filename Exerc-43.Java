/*Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
Maria sabedno que Ana tem 1,10m e cresce 3cm ao ano e Maria tem 1,5m e cresce 2cm ao ano.
*/

import java.util.Scanner;

public class Exerc43 {
    //PROGRAMA PRINCIPAL
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double maria_Alt = 1.5, ana_Alt = 1.1;
        
        System.out.println("Serão necessários " + FunçãoAlt(maria_Alt, ana_Alt) + " anos para que Ana seja maior que Maria.");
    }
    
    //FUNÇÃO
    static double FunçãoAlt(double m, double a){
        double anos = 0;
        while(a < m){
            anos = anos + 1;
            m = m + 0.02;
            a = a + 0.03;
        }
        return anos;
    }   
            
}