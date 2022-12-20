package Udemy;

public class ChangeTemperature {
    public static void main(String[] args) {
        // Formula = (F - 32) * 5/9.0 = C
        final int adjustment = 32;
        final double factor = 5/9.0;
        int F = 32;
        double C = (F - adjustment) * factor ;
        System.out.print(C);
    }
}
