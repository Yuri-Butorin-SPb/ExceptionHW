package ExceptionHW;

import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает 
// у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println(Float.toString(InputFloat()));
    }

    public static float InputFloat() {
        float data = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            data = scanner.nextFloat();
            scanner.close();
            return data;
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
            return InputFloat();
        }
    }
}