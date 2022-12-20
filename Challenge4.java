package Udemy;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        // The numbers to solution
        double NumberOne = 2.59;
        double NumberTwo = 2.57;

        // The solutions
        double SolutionAdd = NumberOne + NumberTwo;
        double SolutionSubtract = NumberOne - NumberTwo;
        double SolutionMultiplication = NumberOne * NumberTwo;
        double SolutionShare = NumberOne / NumberTwo;
        double SolutionRest = NumberOne % NumberTwo;

        // Here below is the request of operation

        Scanner RequestOperator = new Scanner(System.in);

        System.out.print("What your operator:  ");
        String RespondOperation = RequestOperator.nextLine();

        // Here below is the conditionals of requests
        switch (RespondOperation) {
            case "+" -> System.out.printf("The result of operation chosen is: %.2f", SolutionAdd);
            case "-" -> System.out.printf("The result of operation chosen is: %.2f", SolutionSubtract);
            case "*" -> System.out.printf("The result of operation chosen is: %.2f", SolutionMultiplication);
            case "/" -> System.out.printf("The result of operation chosen is: %.2f", SolutionShare);
            default -> System.out.printf("The result of operation chosen is: %.2f", SolutionRest);
        }

    }
}
