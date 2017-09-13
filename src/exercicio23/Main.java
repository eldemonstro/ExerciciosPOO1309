/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23;

import java.util.Scanner;

/**
 *
 * Aluno: Nicolas Gleiser
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String questao = "23. Faça um algoritmo que receba um número\n"
                + "e mostre uma mensagem caso este número\n"
                + "sege maior que 80, menor que 25 ou igual a40.";
        System.out.println(questao);
        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        if (numero > 80) {
            System.out.println("Maior que 80");
        } else if (numero < 25) {
            System.out.println("Numero menor que 25");
        } else if (numero == 40) {
            System.out.println("Numero igual a 40");
        } else {
            System.out.println("Numero não se enquadra nas condições");
        }

    }
}
