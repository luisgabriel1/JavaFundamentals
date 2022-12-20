package Udemy;

import java.util.Scanner;

public class ChallengeFinal3 {

    // Create a program that reads the user's weight and height and prints the BMI on the console.

    public static void main(String[] args) {
        // Formula is: IMC = Weight / Math.pow(Height, 2)

        Scanner RequestInfoOfPeople = new Scanner(System.in);

        System.out.print("Inform you weight: ");
        double AnswerWeight = RequestInfoOfPeople.nextDouble();

        System.out.print("Inform you height: ");
        double AnswerHeight = RequestInfoOfPeople.nextDouble();

        final double ResultImc = AnswerWeight / Math.pow(AnswerHeight, 2.0);
        System.out.printf("The you IMC is: %.2f", ResultImc);

        RequestInfoOfPeople.close();

    }
}
