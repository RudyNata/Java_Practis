package org.example;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ListWorkTime {

    public static final int SIZE = 1000000;
    public static void main(String[] str) {
//        Integer[] data = createInitialArray(SIZE);
//
//        ArrayList<Integer> arrayList = createArrayList(data);
//        LinkedList<Integer> linkedList = createLinkedList(data);

//        long arrayListTimer = timer(arrayList);
//        long linkedListTimer = timer(linkedList);

        ArrayDeque<Integer> arrayDeque = createArrayDeque();
        LinkedList<Integer> linkedList = createLinkedList();

        for (int i = 0; i < SIZE; i++){
            arrayDeque.add(i);
            linkedList.add(i);
        }

        long arrayDequeTimer = timer(arrayDeque);
        long linkedListTimer = timer(linkedList);

        System.out.println("ArrayDeque: " + arrayDequeTimer);
        System.out.println("LinkedList: " + linkedListTimer);
    }

    private static Integer[] createInitialArray(int size) {
        Integer[] data = new Integer[size];
        for (int i = 0; i < data.length; i++){
            data[i] = ThreadLocalRandom.current().nextInt(1000);
        }
        return data;
    }

//    static long timer(List<Integer> list) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++){
//            list.add(0,i);
//        }
//        long end = System.currentTimeMillis();
//        return end - start;
//    }

//    static ArrayList<Integer> createArrayList(Integer[] data) {
//        return new ArrayList<>(List.of(data));
//    }
//
//    static LinkedList<Integer> createLinkedList(Integer[] data) {
//        return new LinkedList<>(List.of(data));
//    }

    static long timer(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++){
//            deque.add(i);
//        }
        while (!deque.isEmpty()){
            deque.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static ArrayDeque<Integer> createArrayDeque() {
        return new ArrayDeque<>();
    }

    static LinkedList<Integer> createLinkedList() {
        return new LinkedList<>();
    }
}
