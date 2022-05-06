class Aluno	 
{	 
 String pnome;	 
 String unome;	 
 int    pontos;	 
	 
 // construtor	 
 Aluno () {	 
  this("" ,"" ,0);	 
 }	 
	 
   Aluno ( String pnomealuno,	 
   String unomealuno,	 
   int pontosaluno )	 
 {	 
  pnome   = pnomealuno;	 
  unome  = unomealuno;	 
  pontos  = pontosaluno;	 
 }	 
}	





import java.io.*;	
import javax.swing.*;	
class GravaAluno	
{	
	
 public static void main ( String[] args ) throws IOException	
 {	
  Aluno[] aluno = new Aluno[3];	
  int i,ptos;	
  String fileName = "ArquivoAluno.txt";	
	
  BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	

  for (i = 0 ; i < 3 ; i++)	
   aluno[i] = new Aluno();
	
  for (i = 0 ; i < 3 ; i++)
   {	
   aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
   writer.write( aluno[i].pnome );  	
   writer.newLine();	
   aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
   writer.write( aluno[i].unome );  	
   writer.newLine();	
   aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));	
   writer.write(Integer.toString(aluno[i].pontos));   	
   writer.newLine();	

   }	
  	
  for (i = 0 ; i < 3; i++) {	
   System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
  }
  writer.close();	
  System.exit(0);	
   } // fim do método	
} // fim da classe	





import java.io.*;	
import javax.swing.*;	
class LerAluno	
{	
	
 public static void main ( String[] args ) throws IOException	
 {	
  Aluno[] aluno = new Aluno[3];	
  int i,ptos;	
  String fileName = "ArquivoAluno.txt";	
	
  BufferedReader ler = new BufferedReader(new FileReader( fileName ));	

  for (i = 0 ; i < 3 ; i++)	
   aluno[i] = new Aluno();
	
  for (i = 0 ; i < 3 ; i++)
   {	
    aluno[i].pnome = ler.readLine();  	
    aluno[i].unome = ler.readLine();	
    aluno[i].pontos = Integer.parseInt(ler.readLine());	
   }	
  	
  for (i = 0 ; i < 3; i++) {	
   System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
  }
  ler.close();	
  System.exit(0);	
   } // fim do método	
} // fim da classe	
