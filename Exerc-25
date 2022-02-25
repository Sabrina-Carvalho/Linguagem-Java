/* Receba a hora de início e de final de um jogo (HH, MM) 
sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
*/

import java.util.Scanner; 

public class Exerc25{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int hi, hf, ht = 0, mi, mf, mt = 0;
              
        System.out.println("Insira a hora de início do jogo:");
        hi = scan.nextInt();
      
        System.out.println("Insira os minutos de início do jogo:");
        mi = scan.nextInt();
      
        System.out.println("Insira a hora de fim do jogo:");
        hf = scan.nextInt();
      
        System.out.println("Insira os minutos de fim do jogo:");
        mf = scan.nextInt();
      
        if((hi > 23) || (hf > 23)){
            System.out.println("**ENTRADA DE DADOS INVÁLIDA**");
            System.out.println("      **TENTE NOVAMENTE**  ");
        }
        else
            if((mi > 59) || (mf > 59)){
                System.out.println("**ENTRADA DE DADOS INVÁLIDA**");
                System.out.println("     **TENTE NOVAMENTE**  ");
            }
            else
                if(hi < hf){
                    ht = (hf - hi);
                }
                else
                    if(hi > hf){
                        ht = ((hf + 24) - hi);
                    }
    
	if(mi > mf){
           ht = (ht - 1); 
        }	
        
        if(mi < mf){
            mt = (mf - mi);
        }
        else
            if(mi > mf){
                mt = ((mf + 60) - mi);
            }
        
        if(((hi <= 23) || (hf <= 26)) || ((mi < 59) || (mf < 59))){
            System.out.println("O tempo de duração do jogo foi de: " + ht + " hora(s)" + mt + " minuto(s).");
        }
    }
}