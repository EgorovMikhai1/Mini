package _29_10_2024;

public class WhileIf {
    public static void main(String[] args) {

        int x = 10;

        while (x >= 0) {
            if (x % 2 == 1) {
                System.out.println("Н");
            } else {
                System.out.println("Ч");
            }
            x--;
        }

    }
}
