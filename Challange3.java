package Udemy;

public class Challange3 {
    public static void main(String[] args) {
        // Works:
        Boolean Work1 = false;
        Boolean Work2 = false;

        // Work1 && Work2 = true                "Buy Tv 50pl and Buy ice cream to family"

        if (Work1 && Work2 == true){
            System.out.println("Buy Tv 50pl and Buy ice cream to family");
        }

        // Work1 = false or Work2 = false        "Buy Tv 32pl and Buy ice cream to family"

        else if (Work1 != true ^ Work2 != true){
            System.out.println("Buy Tv 32pl and Buy ice cream to family");
        }

        // Work1 && Work2 = false                "Don't buy Tv and Don't buy ice cream to family"
        else {
            System.out.println("Don't buy Tv and Don't buy ice cream to family");
        }

    }
}
