package com.berkay.samples;

import java.util.Scanner;

//Finding given n'th prime number
public class PrimeNumber {
	
    public static void nthPrimeNumber(){
        
    	int num = 1;
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter order of the prime number : ");
        int n = s.nextInt();
        s.close();
        System.out.println();
        
        while (true){
            num++;
            if (isPrime(num)){
                count++;
            }
            if (count == n){
            	System.out.println(n + "th prime number:  " + num);
                break;
            }
        }
    }

    public static boolean isPrime(int number){
        int counter = 0;
        for (int j = 2; j < number; j++){
            if (number % j == 0){
                counter = 1;
                break;
            }
        }
        if (counter == 0){
            return true;
        }else{
            return false;
         }
    }

}
