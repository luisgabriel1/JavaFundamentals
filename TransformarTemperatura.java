package Udemy;

public class TransformarTemperatura {
    public static void main(String[] args) {
        // Formula = (F - 32) * 5/9.0 = C
        final int ajuste = 32;
        final double fator = 5/9.0;
        int F = 32;
        double C = (F - ajuste) * fator ;
        System.out.print(C);
    }
}
