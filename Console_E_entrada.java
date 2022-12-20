package Udemy;

import java.util.Scanner;

public class Console_the_in {
    public static void main(String[] args) {
        System.out.println("Good");
        System.out.println("Morning!\n\n");

        System.out.println();
        System.out.println();

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1, 2, 3, 4, 5, 6);
        System.out.printf("Salary: %.1f %n",
                1234.5678);
        System.out.printf("name: %s %n",
                "Luis");



        Scanner in = new Scanner(System.in);

        System.out.print("Inform your first name: ");
        String FirstName = in.nextLine();

        System.out.print("Inform your last name: ");
        String LastName = in.nextLine();

        System.out.print("inform your age: ");
        int Age = in.nextInt();

        System.out.printf("%s %s have %d age.%n",
                FirstName, LastName, Age);
    }
}
