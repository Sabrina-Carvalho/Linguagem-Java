/* Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

import java.util.Scanner;

public class ExercLt01_17 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        float litros, tempo_Perc, vel_Media, km;
        
        System.out.println("Insira o tempo de percurso: ");
        tempo_Perc = scan.nextFloat();
       
        System.out.println("Insira a velocidade média: ");
        vel_Media = scan.nextFloat();
        
	    km = (tempo_Perc * vel_Media);
	    litros = (km/12);
        
	    System.out.println("A quantidade de combustível que será(ão) gasto(s) em todo o percurso será(ão) de " + litros + " litro(s).");
    }
    
}
