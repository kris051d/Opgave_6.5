package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();

        boolean result = isDoubloon(word);
        if (result) {
            System.out.println(word + " is doubloon");
        }
        else {
            System.out.println(word + " is not doubloon");
        }
    }

    public static boolean isDoubloon(String s){
        String testString = s.toLowerCase();
        for(int index=0; index<testString.length();index++){
            int appearance = 0;
            for(int index2=0; index2<testString.length();index2++){
                char currentChar = testString.charAt(index);
                if(testString.charAt(index2) == currentChar){
                    appearance++;
                }
            }
            if(appearance!=2){
                return false;
            }
        }
        return true;
    }
}