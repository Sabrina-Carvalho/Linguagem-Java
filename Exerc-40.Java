//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

import javax.swing.JOptionPane;

public class Exerc40 {
    static int num1=0, num2=0;
    
    //PROGRAMA PRINCIPAL
    public static void main(String[] args){
        int i=0;
        ProcedureNum();
        
        if(num1 < num2){
            for(i = num1; i < num2; i++){
              if(i / 2 == 0){
                  if(i / 3 == 0){
                      if( i / 5 == 0){
                          if(i / 7 == 0){
                              System.out.println(i);
                          }
                      }
                  }
              }
            }
        }
        else
        {
            if(num2 < num1){
                for(i = num2; i < num1; i++){
              if(i / 2 == 0){
                  if(i / 3 == 0){
                      if( i / 5 == 0){
                          if(i / 7 == 0){
                              System.out.println(i);
                          }
                      }
                  }
              }
            }
                
            }
        }
           
        
        
    }
    static void ProcedureNum(){

       // float num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor superior a zero: "));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor superior a zero: "));

        
    }
    
}
