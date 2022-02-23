/* Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
de desconto e o número de descendentes. Calcule o salário que serão as 
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário 
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário 
Líquido. Exiba o salário a receber.
*/

import java.util.Scanner;

public class ExercLt01_16 {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
        float hrs_Trabalhadas, valor_Hr, perc_Desc, dependentes;
        float sal_Liq, sal_Bru, sal_Final;
        
        System.out.println("Insira a quantidade de horas trabalhadas: ");
        hrs_Trabalhadas = scan.nextFloat();
        
        System.out.println("Insira o valor por hora: ");
        valor_Hr = scan.nextFloat();
        
        System.out.println("Insira o percentual de desconto: ");
        perc_Desc = scan.nextFloat();
        
        System.out.println("Insira o número de dependentes: ");
        dependentes = scan.nextFloat();
        
        sal_Bru = hrs_Trabalhadas * valor_Hr;
        sal_Liq = sal_Bru - ((sal_Bru * perc_Desc) / 100);
	    sal_Final = ((100 * dependentes) + sal_Liq);
	
	    System.out.println("Salário a receber: R$" + sal_Final);
    }
    
}