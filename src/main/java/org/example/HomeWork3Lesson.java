package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork3Lesson {
    public static void main(String[] args){
        // 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
//        System.out.println(numbers);
//        oddNumbers(numbers);
//        System.out.println(numbers);

        // 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами.
        // Пример: ArrayList<String> = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        // Должно получиться: ["string", "s", "my_value"]
        ArrayList<String> someString = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(someString);
        removeNumbers(someString);
        System.out.println(someString);
    }

    private static void oddNumbers(ArrayList<Integer> integ){
        for(int i = 0; i < integ.size(); i++){
            if(integ.get(i) % 2 != 0){
                integ.remove(i);
            }
        }
    }

    private static void removeNumbers(ArrayList<String> str){
        String listString = str.toString();
        System.out.println(str.removeIf(x -> x == "\\d" ));
//        for(int i = 0; i < str.size(); i++) {
//            if (str.get(i) == "\\d") {
//                str.remove(i);
//            }
//        }
    }
}
