package FinalWork;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDataValidator {
    public static UserData validateUserData(String input) throws InvalidDataException {
        String[] userData = input.split(" ");
        if (userData.length != 6) {
            throw new InvalidDataException("Некорректное количество данных. Ожидается 6 параметров.");
        }

        String firstName = userData[0];
        String lastName = userData[1];
        String patronymic = userData[2];
        String birthDate = userData[3];
        String phoneNumber = userData[4];
        char gender = userData[5].charAt(0);

        // Проверка формата даты (dd.mm.yyyy)
        Pattern datePattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        Matcher dateMatcher = datePattern.matcher(birthDate);
        if (!dateMatcher.matches()) {
            throw new InvalidDataException("Неверный формат даты рождения. Ожидается dd.mm.yyyy");
        }

        // Проверка формата номера телефона (только цифры)
        Pattern phonePattern = Pattern.compile("^\\d+$");
        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
        if (!phoneMatcher.matches()) {
            throw new InvalidDataException("Неверный формат номера телефона. Ожидается только цифры.");
        }

        return new UserData(firstName, lastName, patronymic, birthDate, phoneNumber, gender);
    }
}





