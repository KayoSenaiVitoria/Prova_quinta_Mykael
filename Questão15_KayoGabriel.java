/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão15_kayogabriel;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questão15_KayoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe numero 1");
        int um = scanner.nextInt();
        
        System.out.println("Informe numero 2");
        int dois = scanner.nextInt();
        
        System.out.println("Informe numero 3");
        int tres = scanner.nextInt();
        
        int media = (um + dois + tres) / 3;
        int soma = (um + dois + tres);
        
        System.out.println("Numeros informados " + um + ", " + dois + ", " + tres + ".");
        System.out.println("Media " + media);
        System.out.println("Soma " + soma);
    }
    
}
