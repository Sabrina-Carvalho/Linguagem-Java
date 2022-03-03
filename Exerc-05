/* Receba os coeficientes A, B e C de uma equção do 2º grau (AX^2+BX+C=0).
Calcule e mostre as raízes reais (considerar qu a equação possue 2 raízes).
*/

import static java.lang.Math.sqrt;
import javax.swing.*;
public class Exerc05 {
    public static void main (String args []){
        
        double a, b, c, x1=0, x2=0, y, delta;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente 'a':"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente 'b':"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente 'c':"));
        //x = Double.parseDouble((JOptionPane.showInputDialog("Insira o valor de 'x'")));//
        
        //Verificação do tipo de função de 2º grau
        if (a == 0){ 
            System.out.println("Não é uma equação de 2º grau (a = 0).");     
        }
        else {
            delta = (b*b) - (4 * (a) * (c));
            
            if (delta < 0){
                System.out.println("A equação não possui raizes reais! (delta < 0)");
            }
            else if (delta == 0){
                x1 = (-(b) + sqrt(delta)) / (2 * (a));
                System.out.println("A função possui apenas uma raiz real: " + x1 + ".");            
            }
            else {
                x1 = (-(b) + sqrt(delta)) / (2 * (a));
                x2 = (-(b) - sqrt(delta)) / (2 * (a));
                
                System.out.println("As raízes reais da equação são x1=" + x1 + " e x2=" + x2 + ("."));
            }
        }
    }
}
