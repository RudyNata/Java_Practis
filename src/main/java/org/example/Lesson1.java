package org.example;

public class Lesson1 {
    public static void main(String[] args) {
//     1. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
       int curr = 0;
       int best = 0;
       int[] array1 = {1, 1, 0, 0, 1, 1, 1};
       for (int i = 0; i < array1.length; i++){
           int a = array1[i];
           if(a == 1){
               curr++;
           }else{
               if(curr > best) {
                   best = curr;
               }
               curr = 0;
           }
       }
       if(curr > best) {
            best = curr;
       }
       System.out.println(best);

//    2. Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть
//      числа, равные заданному, нужно перенести эти элементы в конец массива.
//      Таким образом, первые несколько (или все) элементов массива должны быть
//      отличны от заданного, а остальные - равны ему
        int[] array2 = {3, 2, 2, 3, 1, 5, 3, 3};
        int val = 3;
        swap(array2, val);

        for (int x : array2) {
            System.out.print(x + " ");
            // Вывод массива: System.out.println(Arrays.toString(array));
        }

//    3. Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//      Если общего префикса нет, вернуть пустую строку ""
        String[] array = {"abc", "abcggggg", "abceee"}; // общий префикс ab
        String commonPrefix = findCommonPrefix(array);
        System.out.println(commonPrefix);
    }

    static void swap(int [] array, int val) {
        int size = array.length;
        int shift = 1;
        for (int i = 0; i < size - shift; i++) {
            while (array[size - shift] == val) {
                shift++;
            }
            if (array[i] == val) {
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }
        }
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