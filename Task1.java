package HW3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] string = {"Ах", "запахнувшись", "в", "цветные", "тоги", "восторг", "пьянящий", "из", "кубка", "пили",
                           "Мы", "восхищались", "и", "жизнь", "как", "боги", "познаньем", "новым", "озолотили",
                           "Венки", "засохли", "и", "тоги", "сняты", "дрожащий", "светоч", "едва", "светится",
                            "Бежим", "куда-то", "тоской", "объяты", "и", "мрак", "окрестный", "бедой", "грозится"};

        wordListing(string);
        wordCount(string);
    }

    static void wordListing(String[] string){
        Set<String> set = new HashSet<>(); /* 1й пункт 1й задачи (Найти список слов, из которых состоит текст) */

        for (int i=1; i < string.length; i++){
            set.add(string[i]);
        }
        System.out.println(set);
    }

    static void wordCount(String[] string){
        HashMap<String, Integer> hm = new HashMap<>(); /* 2й пункт 2й задачи (Посчитать сколько раз встречается каждое слово) */

        for (int i=1; i < string.length; i++){
            int count = 1;
            if (hm.containsKey(string[i])) {count = hm.get(string[i]) + 1;}
            hm.put(string[i], count);
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}