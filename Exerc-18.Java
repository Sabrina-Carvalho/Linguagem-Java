/*Receba os 2 números inteiros. Calcule e mostre o resultado da diferença do maior 
pelo menor valor.
*/

import javax.swing.JOptionPane;

public class Exerc18 {

     public static void main(String[] args){
        int num1, num2, total;
        
        num1 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º valor: ")));
        num2 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º valor: ")));
        
        if (num1 >= num2)
                {
                    total = num1 - num2;
                }
                else {
                        total = num2 - num1;
                     }
           
        System.out.println("Diferença dos números inteiros: " + total); 
    }
}
