package org.example;

import java.util.*;

public class Lesson5 {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Lenght = o1.length();
                int o2Lenght = o2.length();
                if (o1Lenght < o2Lenght) {
                    return -1;
                } else if (o1Lenght > o2Lenght) {
                    return 1;
                }
                return 0;
            }
        });
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

//      Внутри HashMap есть массив, изначально на 16 индексов
//      [b0, b1, b2,..., b15] - bucket, в этих бакетах хранятся пары
//      Из ключа вычисляется hash (32 бита)
//      key - hash значения [-2^32, 2^32-1]
//      hash нужно поставить какую-то ячейку в массиве, для этого вычисляется остаток от деления hash/кол-во index
//      hash = 18 => 18 % 15 = 2, т.е. b2 - занимаемая ячейка
//      В данную ячейку помещается [Entry(key, hash, value)]
//      Если остаток от деления у двух ключей совпадает, то в bucket добавляется еще одно Entry
//      За каждым bucket хранится LinkedList с одним или множеством Entry

        hashMap.put("key", 100);
        treeMap.put("key2", 200);
        linkedHashMap.put("key3", 300);

//      1. Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
//          Изоморфные строки имеют одинаковую длину.
//          Примеры:
//          (foo, bar) -> false f -> b, o -> a
//          (paper, title) -> true p -> t, a -> i, e -> l, r -> e
//          (egg, add) -> true e -> a, g -> d
//          (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
        System.out.println(isMatches("abc", "abc"));

//      2. Определить правильную последовательность скобочек (т.е. скобка корректно открылась и закрылась)
//          () - true
//          [() - false
//          [()] - true
//          {}()[]<> - true
//          {(]])}{()} - false
//          ([)] - false

        System.out.println(isCorrectParentheses("()"));
        System.out.println(isCorrectParentheses("[()"));
        System.out.println(isCorrectParentheses("[()]"));
        System.out.println(isCorrectParentheses("{}()[]<>"));
        System.out.println(isCorrectParentheses("{(]])}{()}"));
        System.out.println(isCorrectParentheses("([)]"));
        System.out.println(isCorrectParentheses("]("));
        System.out.println(isCorrectParentheses("((("));
    }

    static boolean isMatches(String s1, String s2) {
        Map<Character, Character> dict= new HashMap<>();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length != chars2.length){
            return false;
        }
        for (int i = 0; i < chars1.length; i++) {
            if (dict.containsKey(chars1[i])) {
                Character characterValue = dict.get(chars1[i]);
                if (characterValue != chars2[i]) {
                    return false;
                }
            }
            dict.put(chars1[i], chars2[i]);
        }
        return true;
    }

    static boolean isCorrectParentheses(String parentheses) {
        char[] chars = parentheses.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        Map<Character, Character> dict = Map.of(
                '(', ')',
                '[', ']',
                '<', '>',
                '{', '}'
        );
        Deque<Character> symbols = new ArrayDeque<>(); // queue FIFO
        for (char c : chars) {
            if (dict.containsKey(c)) { // c - открывающаяся скобка
                symbols.add(c); // сохраняем
            } else { // c - закрывающаяся
                if (symbols.isEmpty()) {
                    return false;
                }
                Character lastSymbol = symbols.pollLast(); // открывающая
                if (!Objects.equals(dict.get(lastSymbol), c)) { // Закрывающаяся для lastSymbol не совпадает с с
                    return false;
                }
            }
        }
        return symbols.isEmpty();
    }
}
