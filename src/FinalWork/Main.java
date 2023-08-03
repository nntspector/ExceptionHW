package FinalWork;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные пользователя в формате: Фамилия Имя Отчество, дата рождения, номер телефона, пол");
        String input = scanner.nextLine();

        try {
            UserData userData = UserDataValidator.validateUserData(input);
            UserDataWriter.writeUserDataToFile(userData);
            System.out.println("Данные успешно записаны в файл.");
        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
    }
}








