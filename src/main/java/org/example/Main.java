package org.example;

public class Main {

    // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
       int curr = 0;
       int best = 0;
       int[] array = {1, 1, 0, 0, 1, 1, 1};
       for (int i = 0; i < array.length; i++){
           int a = array[i];
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
    }
}