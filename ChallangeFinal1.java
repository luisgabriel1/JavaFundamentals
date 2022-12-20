package Udemy;

import java.util.Scanner;

public class ChallangeFinal1 {

    // Here have what create one program what do it conversion of Fahrenheit for Celsius

    public static void main(String[] args) {
        //Formula is (F - 32) * 5/9.0 = C


        Scanner RequestFahrenheit = new Scanner(System.in);

        System.out.print("Which the Fahrenheit what wish? ");
        int questionF = RequestFahrenheit.nextInt();



        final double formulaResult = (questionF - 32)   * 5/9.0;
        System.out.printf("The temperature is %.0f Celsius.", formulaResult);

    }
}
