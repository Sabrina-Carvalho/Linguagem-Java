/*Criar e coletar um vetor[10] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.
*/

import javax.swing.JOptionPane;

public class Exerc47 {
    public static void main(String[] args){
        int v[] = new int[10];
        float maior=0, menor=0, media=0; 
        int i=0;
        
        for(i=0; i<10; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
            media = media + v[i];
            if(i == 0){
                maior = v[i] + 0;
            }
            
            else
                if(i != 0){
                    
                
                    if(v[i] > v[i-1]){
                        maior = v[i] + 0;
                    }
                    else{
                        menor = v[i] + 0;
                    }
                }
            }
    media = media / 10;
    System.out.println("Média: " + maior);
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
    }  
   
}