/* Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
Calcule e mostre a velocidade média em km/h.
*/

// CONFERIR PARA VER SE ESTÁ CERTO (precisa mesmo do número de voltas?)

import java.util.Scanner;

public class Exerc27{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num_Voltas; 
        float ext_Metro, tempo_Min, vel_Media;
        
        System.out.println("Insira o número de voltas: ");
        num_Voltas = scan.nextInt();
        
        System.out.println("Insira a extensão do circuito, em metros: ");
        ext_Metro = scan.nextFloat();
        
        System.out.println("Insira o tempo de duração, em minutos: ");
        tempo_Min = scan.nextFloat();
        
        vel_Media = ext_Metro / tempo_Min;
        
        System.out.println("A velocidade média do percurso é de: " + vel_Media + "km/h.");
        
        
    }
}