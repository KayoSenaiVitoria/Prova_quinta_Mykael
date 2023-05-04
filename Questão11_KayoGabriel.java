/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão11_kayogabriel;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;

/**
 *
 * @author aluno
 */
public class Questão11_KayoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        DataInputStream dado = new DataInputStream(System.in);
        String lerAno = "";
        String lerMes = "";
        String lerDia = "";
        
        System.out.print("Informe anos -> ");
        lerAno = dado.readLine();
        
        System.out.print("Informe meses -> ");
        lerMes = dado.readLine();
        
        System.out.print("Informe dias -> ");
        lerDia = dado.readLine();
        
        int i = parseInt(lerAno);
        int y = parseInt(lerMes);
        int x = parseInt(lerDia);
        
        int ano_convertido = (i * 365);
        System.out.println("Ano convertido em dias -> " + ano_convertido);
        
        int mes_convertido = (y * 30);
        System.out.println("Mês convertido em dias -> " + mes_convertido);
        
        System.out.println("Dias -> " + x);
        
        int soma_dias = (ano_convertido + mes_convertido + x);
        System.out.println("Total de dias convertidos -> " + soma_dias);
    }
}
