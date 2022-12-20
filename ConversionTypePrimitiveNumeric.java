package Udemy;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // Conversão IMPLICITA

        float b = 1.123456788888F; // Conversão EXPLICITA sem usar (CAST)
        float bb = (float) 1.123456788888; // Conversão EXPLICITA usando o (CAST)

        // A preferencia de conversão é usando o (CAST)

        int c = 4;
        byte d = (byte) c;

        double e = 1;
        int f = (int) e;

    }
}
