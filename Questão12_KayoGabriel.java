/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão12_kayogabriel;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questão12_KayoGabriel {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        
        
        DataInputStream dado = new DataInputStream(System.in);
        
       
        int cafeExpresso = 0, cafeCapuccino = 0, cafeComLeite = 0, totalizar = 4;
        double valorExpresso = 0.75;
        double valorCapuccino = 1.00;
        double valorCafeComLeite = 1.25;
        
        
        System.out.println("Selecione o café\n");
        System.out.print("[ 1 ] Café Expresso [ 2 ] Café Capuccino [ 3 ] Café com Leite [ 4 ] Totalizar.\n Informe -> ");
        String cafe = dado.readLine();
        int programa = 0;
          
        do{
        int cafe_c = parseInt(cafe);
        switch(cafe_c){
            case 1:
                int expresso = (cafeExpresso++);
                double ve = (valorExpresso++);
                break;
            case 2:
                int capuccino = (cafeCapuccino++);
                double vc = (valorCapuccino++);
                break;
            case 3:
                int comleite = (cafeComLeite++);
                double vcl = (valorCafeComLeite++);
                break;
           
        }
        
        int quantidadeExpresso = cafeExpresso++;
        int quantidadeCapuccino = cafeCapuccino++;
        int quantidadeLeite = cafeComLeite++;
        
        double v_expresso = valorExpresso++;
        double v_capuccino = valorCapuccino++;
        double v_comleite = valorCafeComLeite++;
        
        System.out.println("Café Expresso -> " + quantidadeExpresso);
        System.out.println("Café Capuccino -> " + quantidadeCapuccino);
        System.out.println("Café Com Leite -> " + quantidadeLeite);
        int totalQ = (quantidadeExpresso + quantidadeCapuccino + quantidadeLeite);
        
        System.out.println("Valor");
        System.out.println("Café Expresso -> " + v_expresso);
        System.out.println("Café Capuccino -> " + v_capuccino);
        System.out.println("Café Com Leite -> " + v_comleite);
        
        double totalV = (v_expresso * v_capuccino * v_comleite);
        
        System.out.println("Quantidade total consumido -> " + totalQ);
        System.out.println("Valor total -> " + totalV);
      
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("parar [ 4 ]");
        programa = scanner.nextInt();
        
        }while(programa != 4);    
}
}
