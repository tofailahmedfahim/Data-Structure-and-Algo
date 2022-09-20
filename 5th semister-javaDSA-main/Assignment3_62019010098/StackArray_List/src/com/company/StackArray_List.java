package com.company;

import java.util.*;

public class StackArray_List {
//
//    Liam, Noah, Ames, Oliver, Benjamin, Lucas, Mason, Jacob,
//    Michael, Daniel, Jackson, Aiden, Matthew.
        public static void main(String[] args) {
            StackUsingArrayList myStack = new StackUsingArrayList(); // Declare a stack of maximum size 4
            // Populate the stack
            myStack.push("Liam");
            myStack.push("Noah");
            myStack.push("Ames");
            myStack.push("Oliver");
            myStack.push("Benjamin");
            myStack.push("Lucas");
            myStack.push("Mason");
            myStack.push("Jacob");
            myStack.push("Michael");
            myStack.push("Daniel");
            myStack.push("Jackson");
            myStack.push("Aiden");
            myStack.push("Matthew");



            System.out.println("*********************Stack ArrayList Implementation*********************");
            System.out.println(myStack.size());
            System.out.println(myStack.isEmpty()); // will print false
            System.out.println(myStack.peek());
            System.out.println(myStack.pop());
            System.out.println(myStack.peek());
            System.out.println(myStack.pop());

        }
}
