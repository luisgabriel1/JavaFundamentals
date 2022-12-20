package Udemy;

import java.util.Scanner;

public class ChallengeFinal2 {

    // Here have what create one program what do it conversion of Celsius for Fahrenheit

    public static void main(String[] args) {
        // Formula is: (C × 9/5) + 32 = 32

        Scanner RequestCelsius = new Scanner(System.in);

        System.out.println("Which the Celsius what wish? ");
        int questionC = RequestCelsius.nextInt();

        final double formulaResult = (questionC * 9/5) + 32;

        System.out.printf("The temperature is %.0f Celsius.", formulaResult);
    }
}
