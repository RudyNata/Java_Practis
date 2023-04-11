package org.example;

import java.util.HashSet;
import java.util.Set;


public class Lesson6 {
    public static void main(String[] args) {
        Set<String> string = new HashSet<>(); // Только уникальные значения

        Cat cat1 = new Cat("Murzik", 10);
        Cat cat2 = new Cat("Murzix", 10);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);

        System.out.println(cats);
    }
}
