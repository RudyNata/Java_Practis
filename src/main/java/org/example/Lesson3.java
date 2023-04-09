package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 9, 11));
        System.out.println(integers); // [1, 1, 2, 3, 1, 6, 3, 5, 6, 9, 11]
        removeDuplicates(integers);
        System.out.println(integers); // [1, 2, 3, 5, 6, 9, 11]
    }

    private static void removeDuplicates(List<Integer> source){
        // нужно удалить в нем все дубликаты
//        int i = 0;
//        while (i < source.size()){
//            int j = i +1;
//            while (j < source.size()){
//                if (source.get(i).equals(source.get(j))){
//                    source.remove(j);
//                }
//                j++;
//            }
//            i++;
//        }
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < source.size()){
            Integer element = source.get(i);
            if (!duplicates.contains(element)){
                duplicates.add(element);
            }else{
                source.remove(i--);
            }
            i++;
        }
    }
}
