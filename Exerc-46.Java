Criar e coletar um vetor [10] inteiro. Calcular e exibir:
a. A média dos valores inseridos;
b. A soma dos números ímpares.

  
import javax.swing.JOptionPane;

public class Exerc46{
    public static void main(String[] args){
        int v[] = new int[10];
        int media=0, soma=0, i=0;
        
        for(i=0; i<10; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
            media = media + v[i];
                if(v[i] % 2 != 0){
                    soma = soma + v[i];
                }
        }
        media = media / 10;
        System.out.println("Valor da média dos números inseridos: " + media);
        System.out.println("Valor da soma dos números ímpares : " + soma);
    
    
    }
}
