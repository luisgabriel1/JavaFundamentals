package Udemy;

public class Challenge2 {
    public static void main(String[] args) {
        // ([6*(3+2)]**2 /3*2   -   ((1-5)*(2-7)**2 / 2) **3 /10**3)

        int a = 6*(3+2);
        int a1 = (int) Math.pow(a, 2) / (3*2);

        int b = (1-5)*(2-7);
        int b1 = (int) Math.pow(b, 2) / 2;

        int t = b1 - a1 ;
        int x = (int) Math.pow(t, 3) ;
        int x1 = (int)Math.pow(10, 3) ;
        int t1 = x / x1;

        System.out.println(t1);
    }
}
