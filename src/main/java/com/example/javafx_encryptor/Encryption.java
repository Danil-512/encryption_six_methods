package com.example.javafx_encryptor;

public class Encryption {
    public String FirstMethod(String input) {
        // Шифр Цезаря
        int key = 2;
        //
        StringBuilder result = new StringBuilder();
        //
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) ('a' + (ch - 'a' + key % 26 + 26) % 26));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) ('A' + (ch - 'A' + key % 26 + 26) % 26));
            } else {
                result.append(ch);
            }
        }
        //
        return result.toString();
    }
    //
    public String SecondMethod(String input) {
        return input + " 2";
    }
    //
    public String ThirdMethod(String input) {
        return input + " 3";
    }
    //
    public String FourthMethod(String input) {
        return input + " 4";
    }
    //
    public String FifthMethod(String input) {
        return input + " 5";
    }
    //
    public String SixthMethod(String input) {
        return input + " 6";
    }
}
