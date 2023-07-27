package Lesson2;

import java.util.Scanner;

public class ex4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите текст: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Ошибка: пустые строки вводить нельзя!");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

