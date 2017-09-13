package exercicio26;

import java.util.Scanner;

/*
* Aluno: Christian Lopes
*/
public class Main {

    public static void main(String[] args) {

        int numero = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = leia.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Este não é um número válido!");
        }
    }
}
