//Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
//Obs.: somente valores positivos.

//REFAZER

import java.util.Scanner;

public class Exerc38 {
    static float x=0, y=0, w=0, z=0, aux;
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        float x=0, y=0, w=0, z=0, aux;
        
        System.out.println("Logo a seguir, insira valores maiores que zero");
        
        System.out.println("Insira o 1º valor: ");
        x = scan.nextFloat();
        
        System.out.println("Insira o 2º valor: ");
        y = scan.nextFloat();
        
        System.out.println("Insira o 3º valor: ");
        w = scan.nextFloat();
        
        System.out.println("Insira o 4º valor: ");
        z = scan.nextFloat();
        
        ProcedureMaiorMenor();
    }
    
    static void ProcedureMaiorMenor(){
        
        if((x == 0) || (y == 0) || (w == 0 ) || (z == 0)){
            System.out.println("**Insira valores maior que zero**");
        }
        else{
            if(x >= y){
                aux = x;
                x = y;
                y = aux;
            }
        }
            else{
                if(y >= w){
                    aux = y;
                    y = w;
                    w = aux; 
                }
                else{
                    if(w >= z){
                        aux = w;
                        w = z;
                        z = aux;
                    }
                }
            }
        System.out.println(x + " " + y + " " +  w + " " + z);
    }
}
