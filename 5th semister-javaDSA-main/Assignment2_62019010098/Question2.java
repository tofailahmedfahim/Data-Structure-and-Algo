package com.company;
import java.util.*;

public class Question2 {




    public static void main(String[] args) {
        // Creating an object of the
        // class linked list
        LinkedList<String> name
                = new LinkedList<String>();

        // Adding the elements to the object created
        // using add() and addLast() method

        // Custom input elements
        name.add("Liam");
        name.add("Noah");
        name.add("Ames");
        name.add("Oliver");
        name.add("Benjamin");
        name.add("Lucas");
        name.add("Mason");
        name.add("Jacob");
        name.add("Michel");
        name.add("Daniel");
        name.add("Jackson");
        name.add("Aidem");
        name.add("Matthew");

         
// creating new main obj so that method can be used  
        Main method = new Main();
//        return the number of item in list
        System.out.println("Size of the linked list: " + method.size(name));
//        check if the linked list is empty or not
        System.out.println(method.isEmpty(name));
//        add name in the list
        method.add(name,"sabik");

        method.Traverse(name);
//         add
//        “William” “Elijah” “Logan” “Ethan”
//        “Michael” “Henry” “Sebastian”, value to the list at the following position
//        3,7,10,12,14,16,18.

        name.add(3,"William");
        name.add(7,"Elijah");
        name.add(10,"Logan");
        name.add(12,"Ethan");
        name.add(14,"Michael");
        name.add(16,"Henry");
        name.add(18,"Sebastian");

//        Treverse method that shows the list
        method.Traverse(name);

//        get the index of element
        method.index(name,"Ames");
        method.index(name,"Mason");
        method.index(name,"Michael");
        method.index(name,"Jackson");
        method.index(name,"Matthew");

//       remove Ames, Benjamin, Mason, Jacob, Michael,
//                Jackson. And display the result.
        name.remove("Ames");
        name.remove("Benjamin");
        name.remove("Mason");
        name.remove("Jacob");
        name.remove("Michael");
        name.remove("Jackson");

        method.Traverse(name);

//        clear the list
        name.clear();
//        after clearing the list
        method.Traverse(name);
        

    }
}

