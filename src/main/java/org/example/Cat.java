package org.example;

import java.util.Objects;

public class Cat {
    // Create new class
    private String name; // поля класса
    private int age;

    public Cat(String name, int age) { // конструктор класса
        this.name = name;
        this.age = age;
    }

    public String getName() { // методы класса
        return name;
    }
    public int getAge() {
        return age;
    }


    public int compareTo(Cat another) {
        if (age < another.age) {
            return -1;
        } else if (age > another.age){
            return 1;
        }
        return 0;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (!(obj instanceof Cat)) { // boolean objIsCat = obj instanceof Cat;
//            return false;
//        }
//        Cat anotherCat = (Cat) obj;
////        return Object.equals(name, anotherCat.name) && age == anotherCat.age;
//    }

//    @Override
//    public int hashCode() {
//        return Object.hash(name, age);
//    }
}
