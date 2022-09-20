package com.company;
import java.util.Scanner;

public class Question5 {
    String sentence = "";

    public static void main(String[] args) {
        Question5 removePunctuationFromAString = new Question5();
        removePunctuationFromAString.getTheNumber();
        System.out.println("After removing all the punctuations: " + removePunctuationFromAString.removePunctuation());

    }

    public void getTheNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence with punctuation");
        sentence = scanner.nextLine();
        scanner.close();
    }

    public String removePunctuation(){
        StringBuilder outputStr = new StringBuilder();
        char[] characters = sentence.toCharArray();
        int asciiValue = 0;
        for (int i = 0; i < characters.length; i++) {
            asciiValue = (int)characters[i];
            if(!(asciiValue > 32 && asciiValue < 48)){
                outputStr.append(characters[i]);
            }
        }

        return outputStr.toString();
    }
}
