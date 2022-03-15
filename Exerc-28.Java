/* Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço.

/REFAZER

VENDA MENSAL   | PREÇO ATUAL   |   PREÇO NOVO   |   
< 500          | < 30          |   +10%         |
>= 500 e < 100 | >= 30 e < 80  |   +15%         |
>= 1000        | >= 80         |   -5%          |

Obs.: para outras condições, preço novo será igual ao preço atual.
*/

import java.util.Scanner;

public class Exerc28{
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        double preco_Atual, preco_Novo, media_Mensal;
                
        System.out.println("Insira o preço atual do produto: ");
        preco_Atual = scan.nextDouble();
        
        System.out.println("Insira a média mensal de venda do produto: ");
        media_Mensal = scan.nextDouble();
        
        if((media_Mensal < 500) && (preco_Atual < 30)){
            preco_Novo = preco_Atual * 1.10; 
            System.out.println("Valor do produto:  " + preco_Atual);
            System.out.println("Média mensal:  " + media_Mensal);
            System.out.println("Novo preço:  " + preco_Novo);
        }
        else
            if(((500 <= media_Mensal) && (media_Mensal < 100)) && ((30 <= preco_Atual) && (preco_Atual < 80))){
                preco_Novo = preco_Atual * 1.15;
                System.out.println("Valor do produto:  " + preco_Atual);
                System.out.println("Média mensal:  " + media_Mensal);
                System.out.println("Novo preço:  " + preco_Novo);
            }
            else
                if((media_Mensal >= 1000) && (preco_Atual >= 80)){
                    preco_Novo = (preco_Atual - (preco_Atual * 0.05));
                    System.out.println("Valor do produto:  " + preco_Atual);
                    System.out.println("Média mensal:  " + media_Mensal);
                    System.out.println("Novo preço:  " + preco_Novo);
        }
    }
}
