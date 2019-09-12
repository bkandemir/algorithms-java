package com.berkay.samples;

import java.util.Scanner;

public class ReverseString {
	
    public static void reverse(){
    	
    	Scanner s = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed");
        String word = s.nextLine();
        char[] arrayOfwords = word.toCharArray();
        char[] newArray = new char[arrayOfwords.length];
        String result="";
        s.close();

        for(int i=0; i < arrayOfwords.length; i++){
            char temp = arrayOfwords[i];
            newArray[arrayOfwords.length - i-1] = temp;
        }
        for(Object a : newArray){
            result = result + a.toString();
        }
        System.out.println("Reversed string : " + result);
    }

}
