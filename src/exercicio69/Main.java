package exercicio69;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 69. Escrever um algoritmo que calcule os
 * sucessivos valores de E usando a série abaixo
 * e considerando primeiro 3 termos, depois 4
 * termos e, por fim, 5 termos:
 * E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4!
 * 
 * Aluno: Fabricio Bezerra
 */
public class Main {
    
    public static int fatorial(int x){
        return (x == 1 || x == 0) ? 1 : x * fatorial(x - 1);
    }
    
    public static int fazerSequencia(int i){
        return (i == 0) ? 1 : (1 / fatorial(i)) + fazerSequencia(i - 1);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("69. Escrever um algoritmo que calcule os\n" +
            "sucessivos valores de E usando a série abaixo\n" +
            "e considerando primeiro 3 termos, depois 4\n" +
            "termos e, por fim, 5 termos:\n" +
            "E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4!\n" + 
            "Digite um numero positico");        
        try{
            int i = Integer.parseInt(br.readLine());
            if (i < 0) {
                System.err.println("Numero não valido");
                return;
            }
            System.out.println("Resultado = " + fazerSequencia(i));
        }catch(NumberFormatException nfe){
            System.err.println("Numero não valido");
        }
        
    }
}
