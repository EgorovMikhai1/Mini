package _01_11_2024;

public class MetEx {

    int sum() {
        int a = 123;
        int a1 = 1223;

        for (int i = a; i < a1; i++) {

        }

        return 9;
    }

    void sumV() {

    }

    static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    static int average(int[] array) {
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(getSum(arr));
    }
}