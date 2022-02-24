/*Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média:

Se a média for >= 6.0 ---------> exibir “APROVADO”;
Se a média for >= 3.0 e < 6.0 -> exibir “EXAME”;
Se a média for < 3.0 ----------> exibir “RETIDO”.
*/
 
import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        
        float n1, n2, n3, n4, media;
        
        System.out.println("Insira a primeira nota:");
        n1 = scan.nextFloat();
        
        System.out.println("Insira a segunda nota:");
        n2 = scan.nextFloat();
        
        System.out.println("Insira a terceira nota:");
        n3 = scan.nextFloat();
        
        System.out.println("Insira a quarta nota:");
        n4 = scan.nextFloat();
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 6.0){
               System.out.println("Média do aluno(a): " +  media);
               System.out.println("ALUNO APROVADO :D");
        }
            else
            if ((media >= 3.0) && (media < 6.0)){
                   System.out.println("Média do aluno(a): " +  media);
                   System.out.println("ALUNO EM EXAME :/");
            }
            else {
                    System.out.println("Média do aluno(a): " +  media);
                    System.out.println("ALUNO(A) RETIDO(A) :(");
            }      
    }
}
