package Udemy;

public class ConversionTypePrimitiveNumeric {
    public static void main(String[] args) {

        double a = 1; // Conversion IMPLIED

        float b = 1.123456788888F; // Conversion EXPLICIT without using (CAST)
        float bb = (float) 1.123456788888; // Conversion EXPLICIT used the (CAST)

        // The preferenci of conversion is used the (CAST)

        int c = 4;
        byte d = (byte) c;

        double e = 1;
        int f = (int) e;

    }
}
