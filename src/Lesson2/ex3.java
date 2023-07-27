package Lesson2;

import java.io.FileNotFoundException;

public class ex3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 0, 0}; // Увеличили размер массива до 4
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Что-то пошло не так при делении...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

