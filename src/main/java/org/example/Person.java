package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public class Person {
//    Создать класс Person.
//    У класса должны быть поля:
//    1. Имя (String)
//    2. Фамилия (String)
//    3. Возраст (продумать тип)
//    4. Пол
//    5*. Придумать свои собственные поля
//    Для этого класса
//    1. Реализовать методы toString, equals и hashCode.
//    2*. Придумать собственные методы и реализовать их

//    В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

    private String firstName;
    private String lastName;
    private int age;
    private int sex; // 0 - female, 1 - male
    private int height;

    public Person(String firstName, String lastName, int age, int sex, int height) { // конструктор класса
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public String getName() { // методы класса
        return firstName + " " + lastName;
    }
    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public String toString(Person i) {
        String name = i.getName();
        int age = i.getAge();
        int sex = i.getSex();
        int height = i.getHeight();
        return String.format(name + ", %d, %d, %d", age, sex, height);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        if (firstName == anotherPerson.firstName && lastName == anotherPerson.lastName && age == anotherPerson.age
                && sex == anotherPerson.sex && height == anotherPerson.height) {
            return true;
        } else {
            return false;
        }
    }
//    public int hashCode() {
//        return Object.hash(lastName, firstName, age, height); // не работает, hash красный, хотя есть импорт util.Object
//    }
    public boolean isNamesake (String firstName1, String lastName1, String firstName2, String lastName2) {
        if (firstName1 == firstName2 && lastName1 == lastName2) {
            return true;
        } else {
            return false;
        }
    }
    public static void asString(ArrayList<Person> arrayList) {
        for (Person i : arrayList)
            System.out.println(i);
    }
}
