
package exemplomedia2;

import javax.swing.JOptionPane;

public class ExemploMedia2 {

    public static void main(String[] args) {
        float[] nota = new float [4];
        String[] nome =  new String[4];
        float soma = 0, media;
        
        for(int i=0; i < 4; i++){
          nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i+1) + "° aluno");
            
          nota [i] = Float.parseFloat (JOptionPane.showInputDialog(null, "Digite a nota do " + nome[i]));
          
          soma += nota[i];
        }
        media = soma / 4;
        for(int i=0; i<4; i++){
            if (nota[i] > media)
                System.out.println("Parabéns: " + nome[i] + " Sua nota foi: " + nota[i]);
        }
    }
    
}
