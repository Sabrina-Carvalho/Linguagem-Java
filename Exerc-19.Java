/* Receba 2 valores reais. Calcule e mostre o maior deles.
*/

import javax.swing.JOptionPane;

public class Exerc19 {

     public static void main(String[] args){
        float num1, num2, total;
        
        num1 = (Float.parseFloat(JOptionPane.showInputDialog("Insira o 1º valor: ")));
        num2 = (Float.parseFloat(JOptionPane.showInputDialog("Insira o 2º valor: ")));
        
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
