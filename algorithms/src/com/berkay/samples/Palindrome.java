package com.berkay.samples;

import java.util.Scanner;

public class Palindrome {
	
    public static void isPalindrome(){
    	Scanner s = new Scanner(System.in);
        System.out.println("Please enter a string to be checked");
        String word = s.nextLine();
        boolean result=isPalindrome1(word);
        System.out.println(result);
        s.close();
    }


    public static boolean isPalindrome1(String word){
        boolean IsPalindrome = true;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1) ){
                IsPalindrome = false;
                break;
            }
        }
        return IsPalindrome;
    }
}
