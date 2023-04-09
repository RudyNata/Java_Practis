package org.example;

import java.util.*;

public class HomeWork4Lesson {
    public static void main(String[] arg) {
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя строку вида text~num
//        2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        3. Если введено print~num, выводит строку из позиции num в связном списке.
//        4. Если введено exit, завершаем программу

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (Objects.equals(s, "exit")) {
                break;
            } else {
                String[] firstArray = s.split("~");
//            System.out.println(Arrays.toString(firstArray));
                if (Objects.equals(firstArray[0], "print")) {
                    if (Integer.parseInt(firstArray[1]) <= list.size()) {
                        System.out.println(list.get(Integer.parseInt(firstArray[1])));
                    } else {
                        System.out.println("No word");
                    }
                } else {
//                    System.out.println(list.size());
                    if (list.size() <= Integer.parseInt(firstArray[1])) {
                        while (list.size() <= Integer.parseInt(firstArray[1])) {
                            list.add(null);
                        }
                    }
                    for (int i = 0; i < list.size(); i++) {
                        list.set(Integer.parseInt(firstArray[1]), firstArray[0]);
                    }
                    System.out.println(list);
                }
            }
        }
    }
}


