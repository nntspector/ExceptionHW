package FinalWork;

public class UserData {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthDate;
    private String phoneNumber;
    private char gender;

    // Конструктор
    public UserData(String firstName, String lastName, String patronymic, String birthDate, String phoneNumber, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
    public String getFullName() {
        return firstName+ " " + lastName + " " + patronymic;
    }
}


