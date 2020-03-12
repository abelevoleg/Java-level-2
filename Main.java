package HW3;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[7];
        person[0] = new Person("Иванов", "+7(495)111-11-11", "1@mail.ru");
        person[1] = new Person("Петров", "+7(495)222-22-22", "2@mail.ru");
        person[2] = new Person("Сидоров", "+7(495)333-33-33", "3@mail.ru");
        person[3] = new Person("Иванов", "+7(495)444-44-44", "4@mail.ru");
        person[4] = new Person("Петров", "+7(495)555-55-55", "5@mail.ru");
        person[5] = new Person("Петров", "+7(495)666-66-66", "6@mail.ru");
        person[6] = new Person("Петров","+7(495)777-77-77", "7@mail.ru");

        Phonebook phonebook = new Phonebook(person);

        phonebook.findPhone();
        phonebook.findEmail();
    }
}
