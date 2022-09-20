package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static int size(LinkedList<String> numbers){
        int length = numbers.size();
        return length;
    }
    static boolean isEmpty(LinkedList<String> numbers) {
        int length = numbers.size();
        if(length == 0){
            return true;
        }
        else return false;
    }
    static void add(LinkedList<String> name, String value){
        name.add(value);
    }
    void Traverse(LinkedList<String> name){
        System.out.println(name);
    }

    static  void index(LinkedList<String> name,String value){
        System.out.print("The index of "+value);
        System.out.println(" is:"+name.indexOf(value));
    }



}
