package FinalWork;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDataWriter {
    public static void writeUserDataToFile(UserData userData) {
        String firstName = userData.getFirstName();

        try (FileWriter fileWriter = new FileWriter(firstName + ".txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(userData.getFullName() +  userData.getBirthDate() +
                    userData.getPhoneNumber() +  userData.getGender());
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        }
    }
}











