/* Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/

import javax.swing.JOptionPane;

public class Exerc29{


    public static void main(String[] args){

        Integer tipo_Invest;
        Double valor_Invest;
        
        tipo_Invest = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento: (1 = poupança) (2 = renda fixa)"));
        
        valor_Invest = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento: "));
        
        if(tipo_Invest == 1)
        {
            valor_Invest = valor_Invest * 1.03;
            System.out.println("Valor atual do investimento: " + valor_Invest);
        }
        else{
            valor_Invest = valor_Invest * 1.05;
            System.out.println("Valor atual do investimento: " + valor_Invest);
           
        }
        }
    }
