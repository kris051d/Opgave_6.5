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
        //Fjernede en ligegyldig variabel
        s = s.toLowerCase();
        for(int index=0; index<s.length();index++){
            int appearance = 0;
            for(int index2=0; index2<s.length();index2++){
                char currentChar = s.charAt(index);
                if(s.charAt(index2) == currentChar){
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