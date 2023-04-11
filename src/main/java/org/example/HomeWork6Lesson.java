package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork6Lesson {
    public static void main(String[] args) {
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

        Person person1 = new Person("Ivan", "Ivanov", 30, 1, 195);
        Person person2 = new Person("Ivan", "Ivanov", 15, 1, 170);
        Person person3 = new Person("Vasya", "Pupkin", 22, 1, 182);
        Person person4 = new Person("Nikol", "Kidman", 55, 0, 180);
        Person person5 = new Person("Evgenia", "Ezhova", 7, 0, 135);

        System.out.println(person1.equals(person2));

        ArrayList<Person> person = new ArrayList<>();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        person.add(person5);

        String str = person1.toString();
        System.out.println(str);

        for (Person i : person) {
            int age = i.getAge();
            String name = i.getName();
            if (age > 20) {
                System.out.print(name + ", ");
            }
        }
    }
}
