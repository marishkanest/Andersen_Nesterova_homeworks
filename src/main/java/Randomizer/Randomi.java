package Randomizer;

import java.security.SecureRandom;
import java.util.*;

public class Randomi {

    public static void main(String[] args) {

        List<String> list  = new ArrayList<>();
        list.add("Епифанов");
        list.add("Иванов");
        list.add("Петров");
        list.add("Квачевский");
        list.add("Мурчалкин");

        Vybor(list);
        System.out.println("Остались " + list);

        Vybor(list);
        System.out.println("Остались " + list);
    }

    private static void Vybor(List<String> source) {
        Random random = new SecureRandom();
        int randomIndex = random.nextInt(source.size());
        String randomElement = source.get(randomIndex);
        System.out.println("Спрашивает: " + randomElement);
        source.remove(randomIndex);

        Random random2 = new SecureRandom();
        int randomIndex2 = random2.nextInt(source.size());
        String randomElement2 = source.get(randomIndex2);
        System.out.println("Отвечает: " + randomElement2);
        source.remove(randomIndex2);

    }
}





