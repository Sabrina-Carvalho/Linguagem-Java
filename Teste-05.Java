//Desenvolva um algoritmo que receba um valor numérico real, verifique e mostre se esse número é positivo.
import javax.swing.JOptionPane;

public class Teste05 {
    public static void main(String[] args){
        double x; // declaração de variáveis 
        
        // mensagem ao usuário e entrada de dados
        x = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número real"));
        
        // condicionais
        if(x > 0)
        {
        System.out.println (x + " é positivo"); // saída de resultados
        } // fim do if
        
    } // fim do void main
} // fim da classe Positivo
