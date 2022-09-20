package com.company;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        System.out.println(letters);            // [A, B, C, D, E]
        System.out.println(letters .remove("C"));   // prints true
        System.out.println(letters);            // [A, B, D, E]
    }
}
