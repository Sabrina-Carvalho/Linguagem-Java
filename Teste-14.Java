import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args){
        int m[][];
        m = new int [8][8];
        int x, y, z;
        
        for(z = 1; z<= 4; z++){
            for(x = (z - 1); x<= (8-z); x++){
                for(y = (z-1); y<= (8-z); y++){
                    z = m[x][y];
                   
                }
            }
        }
        for(x = 0; x<7; x++){
            for(y = 0; y < 7; y++){
                System.out.println(m[x][y]);
            }
        }
    }
    
}
