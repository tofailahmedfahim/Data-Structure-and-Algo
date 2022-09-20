package com.company;

        public class Question1 {


            public static void main(String[] args) {

                ReverseList dList = new ReverseList();
                //Add nodes to the list
                dList.addNode(1);
                dList.addNode(2);
                dList.addNode(3);
                dList.addNode(4);
                dList.addNode(5);

                System.out.println("Original List: ");
                dList.display();

                //Reverse the given list
                dList.reverse();

                //Displays the reversed list
                System.out.println("\nReversed List: ");
                dList.display();
            }
        }
