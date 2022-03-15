/* Receba a base e a altura de um triângulo. Calcule e mostre a sua área*/

import javax.swing.JOptionPane;

public class ExercLt01_03 {

    public static void main(String[] arg) {
        
        float base = 0, altura = 0, area = 0;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        area = (base * altura);
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
