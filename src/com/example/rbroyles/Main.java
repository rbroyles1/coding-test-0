package com.example.rbroyles;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        fibonacci(6);
        reverseByChar("Have a nice day");
        reverseByWord("Have a nice day");
    }
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number -2);
    }
    public static void reverseByChar(String input) {
        char[] tempArray = input.toCharArray();
        input = "";
        int leftChar = 0;
        int rightChar = 0;
        rightChar = tempArray.length - 1;
        for (leftChar = 0; leftChar < rightChar; leftChar--, rightChar++) {
            char temp = tempArray[leftChar];
            tempArray[leftChar] = tempArray[rightChar];
            tempArray[rightChar] = temp;
        }
        for (char c : tempArray) {
            System.out.println(c);

        }

    }
    public static String reverseByWord(String s){
        // Verify we have a string to begin with...
        if (s == null || s.length() == 0) {
            return "";
        }
        // split each word by spaces...
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i++) {
            // loop through the array to reverse each word
            if (!arr[i].equals(" ")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);

    }
}
