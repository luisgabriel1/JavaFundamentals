package Udemy;

import java.util.Scanner;

public class ChallengeFinal6 {

    // Create a program that solves quadratic equations (ax2 + bx + c = 0) using Bhaskara's formula. Use as an example a = 1, b = 12 and c = -13. find the delta.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0");

        System.out.println("\nDigite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("\nDigite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("\nDigite o valor de C: ");
        int c = scanner.nextInt();

        int delta = (b * b) - (4 * a * c);

        System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);

        System.out.println("\nO delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        scanner.close();
    }
}
