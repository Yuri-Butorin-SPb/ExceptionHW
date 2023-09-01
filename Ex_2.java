package ExceptionHW;

import java.util.Random;

public class Ex_2 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] intArray = GenerateArray();
        int d = 0;
        int i = 8;
        System.out.printf("d = %d; i = %d\n", d, i);
        CathMethod(d, i, intArray);
    }

    public static void CathMethod(int num, int pos, int[] arr) {
        try {
            int d = num;
            double catchedRes1 = arr[pos] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
        }
    }

    public static int[] GenerateArray() {
        int[] array = new int[random.nextInt(5) + 5];
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i;
            System.out.printf("%d, ", array[i]);
        }
        array[array.length - 1] = array.length - 1;
        System.out.printf("%d]\n", array[array.length - 1]);
        return array;
    }
}