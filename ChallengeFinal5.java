package Udemy;

import java.util.Scanner;

public class ChallengeFinal5 {

    // Create a program that reads the value of the base and height of a triangle and calculates an area.

    public static void main(String[] args) {
        // Formula is: area = base * height / 2

        Scanner RequestValues = new Scanner(System.in);


        System.out.print("Inform the base: ");
        double BaseOfTriangle = RequestValues.nextDouble();

        System.out.print("Inform the Height: ");
        double HeightOfTriangle = RequestValues.nextDouble();


        double ResultArea = (BaseOfTriangle * HeightOfTriangle) / 2;
        System.out.printf("The area is: %.2f", ResultArea);

        RequestValues.close();

    }
}
