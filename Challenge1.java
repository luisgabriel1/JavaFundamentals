package Udemy;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        // Here below are the request Scanner as used System.in
        Scanner RequestSalary = new Scanner(System.in); // Here is Scanner request

        System.out.println("What your first salary: ");
        double salary1 = RequestSalary.nextDouble();

        System.out.println("What your second salary: ");
        double salary2 = RequestSalary.nextDouble();

        System.out.println("What your third salary: ");
        double salary3 = RequestSalary.nextDouble();

        // Here below is the calculation salary
        double calculationAverageSalary = (salary1 + salary2 + salary3) / 2;
        System.out.printf("%nYour average salary is : $%.2f", calculationAverageSalary);


    }
}
