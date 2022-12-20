package Udemy;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner in = new Scanner(System.in);

        String s2 = in.nextLine(); // If used .nextLine no necessary the use of .trim()
        // Else use the .trim()
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        in.close();
    }
}
