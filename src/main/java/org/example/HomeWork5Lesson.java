package org.example;

import java.util.*;


public class HomeWork5Lesson {
    public static void main(String[] args) {
//      Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
//      Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
//      и
//      ты
//      Еще
//      день друг Пора
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(text);
    }

    public static void collectStats(String txt) {
        // Если слово такой длинны уже есть, найти список и в него добавить, если не было - вставляем ключ и слово
        Map<Integer, List<String>> stats = new HashMap<>();

        String[] words = txt.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            List<String> list = new ArrayList<>();
            String word = words[i].toString();
            int length = word.length();
            list.clear();
            if (stats.containsKey(length)) {
                String forSizeWord2 = stats.get(length).toString();
                int size = forSizeWord2.length();
                String word2 = stats.get(length).toString().substring(1,size - 1);
                list.add(word2);
                list.add(word);
                stats.put(length, list);
            } else {
                list.add(word);
                stats.put(length, list);
            }
        }
        for (int j = 0; j < stats.size() + 2; j++)
            if (stats.containsKey(j)) {
                System.out.println(stats.get(j));
            }
//        System.out.println(stats.values());
    }
}

