package exercicio46;

import java.util.Scanner;
/*
* Aluno: André Luiz
*/
public class Main {
    public static void main(String[] args) {
        int n1, n2, n3, m;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        n1 = ler.nextInt();

        System.out.println("Digite a nota 2");
        n2 = ler.nextInt();

        System.out.println("Digite a nota 3");
        n3 = ler.nextInt();

        m = (n1 + n2 + n3) / 3;

        if (m >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }
}
