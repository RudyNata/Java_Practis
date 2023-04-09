package org.example;
import java.util.Arrays;
public class HomeWork1Lesson {

        public static void main(String[] args) {
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false

            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false

            printString("abcd", 5); // abcdabcdabcdabcdabcd

            System.out.println(isLeapYear(1600)); // true
            System.out.println(isLeapYear(2000)); // true
            System.out.println(isLeapYear(1988)); // true
            System.out.println(isLeapYear(1700)); // false

            System.out.println(createArray(7, 15)); // [15, 15, 15, 15, 15, 15, 15]

            int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(newArray(array1));

            int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(anotherArray(array2));

            int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
            int x = array[2][3];
            squareArray(array);
            System.out.println(Arrays.deepToString(array));


        }

        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
            // проверить, что сумма a и b лежит между 10 и 20
            if (a + b <= 20 || a + b <= 10){
                return true;
            } else {return false;}
        }

        private static boolean isPositive(int x) {
            // проверить, что х положительное
            if (x > 0){
                return true;
            } else {return false;}
        }

        private static void printString(String source, int repeat) {
            // напечатать строку source repeat раз
            for (int i = 1; i <= repeat; i++){
                System.out.print(source);
            }
        }

        private static boolean isLeapYear(int year) {
            // проверить, является ли год високосным. если да - return true
            if (year % 4 == 0 && year % 100 != 0){
                return true;
            } else if (year % 100 == 0 && year % 400 == 0){
                return true;
            } else return false;

        }

        private static int[] createArray(int len, int initalValue) {
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            int[] array = new int[len];
            for (int i = 0; i < len; i++){
                array[i] = initalValue;
            }
            return array;
        }

        private static int[] newArray(int[] array){
            // 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
            // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++){
                if (array[i] == 1){
                    newArray[i] = 0;
                } else newArray[i] = 1;
            }
            return newArray;
        }

        private static int[] anotherArray(int[] array){
            // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
            // пройти по нему циклом, и числа меньшие 6 умножить на 2;
            for (int i = 0; i < array.length; i++){
                if (array[i] < 6){
                    array[i] = array[i] * 2;
                }
            }
            return array;
        }
        private static int[][] squareArray(int[][] array){
            // 3. C помощью цикла(-ов) заполнить его диагональные элементы единицами
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    if (i == j){
                        array[i][j] = 1;
                    } else array[i][j] = 0;
                }
            }
            return array;
        }


/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
    }
