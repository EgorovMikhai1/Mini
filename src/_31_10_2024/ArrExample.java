package _31_10_2024;

public class ArrExample {

    public static void main(String[] args) {
        int[] b = {2, 4, 5, 1, 0, -23, 44, -1};

        int sum = 0;

        for (int i = 0; i < b.length; i+=2) {
            sum = sum + b[i];
        }
        System.out.println(sum);
    }
}
