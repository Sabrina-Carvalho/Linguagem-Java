///Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

public class Exerc45 {
    public static void main(String[] args){
        ProcedureSerie();
    }
    
    static void ProcedureSerie(){
        float i = 1, den = 0, c = 1;
        
        while(c < 15){
            System.out.println(i + "/" + den);
            i++;
            den = i * i;
            c = c+1;
        }
    }
}
