/*Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
*/

import javax.swing.JOptionPane;

public class ExercLt01_09 {
    public static void main(String[] args){
        double num1, num2, total;
        
        num1 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º valor: ")));
        num2 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º valor: ")));
        
        num1 = Math.pow(num1, 2);
        num2 = Math.pow(num2, 2);
        total = num1 + num2;
           
        System.out.println("Soma dos quadrados: " + total); 
    }
}
