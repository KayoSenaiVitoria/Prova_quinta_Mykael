/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão14_kayogabriel;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questão14_KayoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String senha = JOptionPane.showInputDialog(null, "Informe a senha");
        int s = parseInt(senha);
        
        if(s < 9999){
            JOptionPane.showMessageDialog(null, "Acesso invalido");
        }else if(s > 9999){
            JOptionPane.showMessageDialog(null, "Acesso invalido");
        }else if(s == 9999){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        }
    }
    
}
