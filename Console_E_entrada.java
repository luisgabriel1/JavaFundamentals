package Udemy;

import java.util.Scanner;

public class Console_E_entrada {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.println("dia!\n\n");

        System.out.println();
        System.out.println();

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1, 2, 3, 4, 5, 6);
        System.out.printf("Salario: %.1f %n",
                1234.5678);
        System.out.printf("Nome: %s %n",
                "Luis");



        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n",
                nome, sobrenome, idade);
    }
}
