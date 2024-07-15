package view;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Bruno
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //*************************************PREPARAÇÂO DA MEMÒRIA
        // CARCTERE
        String nome = "bruno";
        // VALORES INTEIROS
        double numero2;
        double numero1;
        double res;
        // LOGICOS        
        boolean logico;
        double quebrados;

        //**************************************ENTADA DE DADOS
        System.out.print("Digite um numero com ,: ");
        // LEIA
        numero1 = scanner.nextDouble();
        System.out.print("Digite um numero: ");
        numero2 = scanner.nextDouble();
        //****************************************************
        
        //*************************************PROCESSAMENTO
        // OPERADORES ARITIMETICOS
        // +-MAIS -MENOS / *-VEZES %-MOD
        res = numero1 + numero2;
//        ******************************************************

//        *************************************************SAIDA DE DADOS
        // ESCREVA
//        System.out.print("ola: zn");
//          HARD CODE
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é igual a " + res);
        //888888888888888888888888888888888888888888888888888888
    }
}
