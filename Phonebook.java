package HW3;

import java.util.*;

public class Phonebook {
    HashMap<String, ArrayList> phoneBookMap = new HashMap<>();

    public Phonebook(Person[] person){
        for (int i = 0; i < person.length; i++){
            ArrayList sameFamily = new ArrayList();
            ArrayList listPhone = new ArrayList();
            ArrayList listEmail = new ArrayList();

            if (phoneBookMap.containsKey(person[i].family)) {
                listPhone.add(phoneBookMap.get(person[i].family).get(0));
                listPhone.add(person[i].phone);

                listEmail.add(phoneBookMap.get(person[i].family).get(1));
                listEmail.add(person[i].email);

                sameFamily.add(listPhone);
                sameFamily.add(listEmail);
            } else {
                listPhone.add(person[i].phone);
                listEmail.add(person[i].email);

                sameFamily.add(listPhone);
                sameFamily.add(listEmail);
            }
            phoneBookMap.put(person[i].family, sameFamily);
        }
    }

    public void findPhone(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String family = in.nextLine();

        if (phoneBookMap.containsKey(family)) {
            System.out.println(family + ": " + phoneBookMap.get(family).get(0));
        } else {
            System.out.println("Такой фамилии нет в телефонной книге");
        }
    }

    public void findEmail(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String family = in.nextLine();

        if (phoneBookMap.containsKey(family)) {
            System.out.println(family + ": " + phoneBookMap.get(family).get(1));
        } else {
            System.out.println("Такой фамилии нет в телефонной книге");
        }
    }
}