/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão13_kayogabriel;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questão13_KayoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String numero = JOptionPane.showInputDialog(null, "Informe numero");
        int n = parseInt(numero);
        
        int antecessor = (n - 1);
        int sucessor = (n + 1);
        
        JOptionPane.showMessageDialog(null, "Numero " + n + "\nAntecessor " + antecessor + "\nSucessor " + sucessor);
    }
    
}
