// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
package ExceptionHW;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        try {
            System.out.printf("\"%s\"", InputData());
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String InputData() throws EmptyStringException {
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        data = scanner.nextLine();
        scanner.close();
        if (data.isEmpty())
            throw new EmptyStringException("Пустая строка!");
        return data;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}