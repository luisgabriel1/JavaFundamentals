package Udemy;

public class TypeString {
    public static void main(String[] args) {
        System.out.println("Hello guys".charAt(2));

        String s = "Good Afternoon";

        System.out.println(s.concat("!!!"));

        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Good"));

        System.out.println(s.toLowerCase().startsWith("good"));

        System.out.println(s.toUpperCase().endsWith("AFTERNOON"));

        System.out.println(s.length());

        System.out.println(s.toLowerCase().equals("good afternoon"));

        System.out.println(s.equalsIgnoreCase("good afternoon"));

        var FirstName = "Luis";
        var LastName = "Oliveira";
        var age = 17;
        var salary = 12345.987;

        System.out.println("Name: " + FistName + "\nSobrenome: " + LastName + "\nIdade: " + age + "\nSalario: R$" + salary + "\n\n");

        System.out.printf("The Mr %s %s have %d age and earn $%.2f", FirstName, LastName, age, salary);

        String phrase = String.format("\nO senhor %s %s tem %d anos e ganha $%.2f", FirstName, LastName, age, salary);
        System.out.println(phrase);
    }
}
