package org.example;

public class Task3 {
//    Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//    Если общего префикса нет, вернуть пустую строку ""
    public static void main(String[] args){
        String[] array = {"abc", "abcggggg", "abceee"}; // общий префикс ab
        String commonPrefix = findCommonPrefix(array);
        System.out.println(commonPrefix);
    }

    static String findCommonPrefix(String[] array){
        String result = "";
        String first = array[0];
        for (int i = 1; i < array.length; i++){
            if (first.length() > array[i].length()) {
                first = array[i];
            }
        }
        first: for (int index = 0; index < first.length(); index++) {
            char firstIndexChar = first.charAt(index);
            for (int i = 1; i < array.length; i++) {
                // Сделать из элемента строкового массива отдельный массив: char[] chars = first.toCharArray()
                // Получить первый символ элемента массива: char *имя* = first.charAt(index);
                char secondStringChar = array[i].charAt(index);
                if (firstIndexChar != secondStringChar){
                    break first;
                }
            }
            result += first.charAt(index);
        }
        return result;
    }

}
