package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an ArrayList Implementation of stack, Where size is not a problem we
 * can extend the stack as much as we want.
 *
 * @author Ramesh Fadatare
 *
 */
public class StackUsingArrayList {
    /**
     * ArrayList representation of the stack
     */
    List<String> stackList;

    /**
     * Constructor
     */
    StackUsingArrayList() {
        stackList = new ArrayList<>();
    }

    /**
     * Adds value to the end of list which is the top for stack
     *
     * @param value value to be added
     */
    void push(String value) {
        stackList.add(value);
    }
    int size(){
        return stackList.size();
    }

    /**
     * Pops last element of list which is indeed the top for Stack
     *
     * @return Element popped
     */
    String pop() {

        if (!isEmpty()) { // checks for an empty Stack
            String popValue = stackList.get(stackList.size() - 1);
            stackList.remove(stackList.size() - 1); // removes the poped element
            return popValue;
        } else {
            System.out.print("The stack is already empty  ");
            return String.valueOf(-1);
        }
    }

    /**
     * Checks for empty Stack
     *
     * @return true if stack is empty
     */
    boolean isEmpty() {
        if (stackList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Top element of stack
     *
     * @return top element of stack
     */
    String peek() {
        return stackList.get(stackList.size() - 1);
    }

}