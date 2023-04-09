package org.example;

public class Lesson2 {
    // Работа с файлами:
    // FileInputStream fileInputStream = new FileInputStream("file.txt");
    // byte[] bytes = new byte[100];
    // fileInputStream.read(bytes);
    // byte[] bytes = fileInputStream.readAllBytes();
    // System.out.println(Arrays.toString(bytes));

    // BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));
    // String text = "12фафыва";
    // byte[] bytes = text.getBytes();
    // System.out.println(Arrays.toString(bytes));
    // os.write(bytes);
    // os.flush();

    public static void main(String[] args){
        String s = "aaaabbbcdde";
        String compressed = compress(s);
        System.out.println(compressed);
    }

    // aaaabbbcdd = a4b3cd2
    static String compress (String input){
        String result = "";
        int count = 1;
        char tmp = input.charAt(0);
        for (int i = 1; i < input.length(); i++){
            char c = input.charAt(i);
            if (tmp == c){
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(tmp) + count;
                } else {
                    result += tmp;
                }
                tmp = c;
                count = 1;
            }
        }
        if (count > 1) {
            result += String.valueOf(tmp) + count;
        } else {
            result += tmp;
        }
        return result;
    }
}
