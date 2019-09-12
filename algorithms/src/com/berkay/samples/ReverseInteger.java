package com.berkay.samples;

import java.util.Scanner;

public class ReverseInteger {
	
    public static void reverse(){
    	
    	Scanner s = new Scanner(System.in);
        System.out.println("Please enter an iteger to be reversed");
        int number = s.nextInt();
        int reversed = reverseInt(number);
        System.out.println(reversed);
        s.close();
    }

    public static int reverseInt(int number){
        
    	int reverse = 0;
        while (number != 0){      
        	int lastNumber = number % 10;
            reverse = (reverse * 10) + lastNumber;
            number= number / 10;
        }
        return reverse;
    }

}
