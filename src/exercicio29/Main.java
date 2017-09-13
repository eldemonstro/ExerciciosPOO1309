package exercicio29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 29. Faça um algoritmo que receba o número do
* mês e mostre o mês correspondente. Valide
* mês inválido.
*
* Aluno: Fabricio Bezerra
*/

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 29. Faça um algoritmo que receba o número do\n" +
            "mês e mostre o mês correspondente. Valide\n" +
            "mês inválido.\n" +
            "Digite um numero: ");        
        try{
            int i = Integer.parseInt(br.readLine());
            String mes;
            switch (i) {
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Maio";
                    break;
                case 6:
                    mes = "Junho";
                    break;
                case 7:
                    mes = "Julho";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Setembro";
                    break;
                case 10:
                    mes = "Outubro";
                    break;
                case 11:
                    mes = "Novembro";
                    break;
                case 12:
                    mes = "Dezembro";
                    break;
                default:
                    System.err.println("Numero não valido");
                    return;
            }
            System.out.println("O mês correspondente ao numero " + i + " é " + mes);
        }catch(NumberFormatException nfe){
            System.err.println("Numero não valido");
        }
    }
    
}
