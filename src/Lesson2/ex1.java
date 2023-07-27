package Lesson2;

import java.util.Scanner;

public class ex1 {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка ввода! Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очистить буфер ввода
            }
        }

        scanner.close();
        return number;
    }

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }
}

