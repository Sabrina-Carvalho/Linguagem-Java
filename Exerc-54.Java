/*Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a 
diagonal principal terá seus dados carregados no programa segundo:
*/

import javax.swing.JOptionPane; 

public class Exerc54 {
    public static void main(String[] args){
        int m[][] = new int [4][4];
        int l, c;
        
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                m[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
                
            } 
        }
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                if(l == c){
                    System.out.println(m[l][c]);
                }
                
            } 
        }
    }
    
}
