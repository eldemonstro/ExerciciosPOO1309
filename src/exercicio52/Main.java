package exercicio52;

import java.util.Scanner;

/*
* Aluno: Gian Moura
*/

public class Main {
    public static void main(String[] args) {
        int op = 0, num;
        String menu = "Escolha uma opção:\n1 - Verificar Numero\n2 - Sair";
        Scanner sc = new Scanner(System.in);
        while (op != 2) {
            System.out.println(menu);
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Entre com um numero inteiro.");
                    num = sc.nextInt();
                    System.out.print(num % 2 == 0 ? "É par":"É impar");
                    System.out.println(num >= 0 ? " e positivo":" e negativo");
                    break;
                case 2:
                    System.out.println("Encerrando!");
                    System.exit(0);
                    break;
            }   
        }
    } 
}