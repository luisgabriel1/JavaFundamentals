package Udemy;

import java.util.Scanner;

public class ChallengeFinal4 {

    // Create a program that reads a value and outputs the squared and cubed results of the value.

    public static void main(String[] args) {

        Scanner RequestOneValue = new Scanner(System.in);

        System.out.print("Inform one value: ");
        double Value = RequestOneValue.nextDouble();


        double CalculationValue = Math.pow(Value, 2);
        System.out.printf("The cubed result is: %.2f", CalculationValue);
    }
}
