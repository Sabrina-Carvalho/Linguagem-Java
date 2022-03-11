//Exemplo de Switch … Case

import javax.swing.JOptionPane;

public class Teste11
{
    public static void main (String arg [ ]) {
      int opc;
      opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quadrado \n 2 - Retângulo \n 3 - Triângulo \n 4 - Trapézio"));
      switch (opc)
         {
            case 1: JOptionPane.showMessageDialog(null,"QUADRADO ");
                          break;
            case 2: JOptionPane.showMessageDialog(null,"RETÂNGULO ");
                           break;
            case 3: JOptionPane.showMessageDialog(null,"TRINGULO ");
                          break;
            case 4: JOptionPane.showMessageDialog(null,"TRAP^ÉZIO ");
                           break;
            default: JOptionPane.showMessageDialog(null,"inválido");
         }

   }
}
