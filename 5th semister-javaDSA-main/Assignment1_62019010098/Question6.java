package com.company;

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("element1");   // [element1]
        list.add(Boolean.TRUE); // [element1, true]
        list.add("last element");    // [element1, true, last element]
        System.out.println(list);   // [element1, true, last element]
    }
}
