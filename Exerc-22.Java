//Receba 2 números inteiros e diferentes. Mostre seus valores em ordem crescente.


import javax.swing.JOptionPane;

public class Exerc22 {

     public static void main(String[] args){
        int num1, num2;
        
        num1 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º valor: ")));
        num2 = (Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º valor: ")));
        
        if (num1 >= num2)
                {
                    JOptionPane.showMessageDialog(null, "Ordem crescente dos valores inseridos: " + num2 + "; " + num1);
                    
                }
                else {
                        JOptionPane.showMessageDialog(null,"Ordem crescente dos valores inseridos: " + num1 + "; " + num2);
                     }
    }
}
