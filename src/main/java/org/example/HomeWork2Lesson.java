package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
public class HomeWork2Lesson {
    public static void main(String[] args) throws IOException {
        // 1. Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
        // которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
        System.out.println(buildString(6,'a','b')); // "ababab"

        // 2. Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него
        // Слово "TEXT" 100 раз
        Path of = Path.of("file.txt");
        System.out.println(Files.exists(of));
//      Files.createFile(of);
//      System.out.println(Files.exists(of));

        Files.writeString(of, textInFile());
    }

    // 1. Задание
    static String buildString(int n,char c1, char c2){
        String str = "";
        for (int i = 0; i < n; i += 2){
            str += String.valueOf(c1) + String.valueOf(c2);
        }
        return str;
    }

    // 2. Задание
    static String textInFile (){
        StringBuilder str = new StringBuilder("TEXT");
        for (int i = 0; i < 100; i++){
            str.append("TEXT\n");
        }
        String s = str.toString();
        return s;
    }
}
