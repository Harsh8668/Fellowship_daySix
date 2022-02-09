package com.javaproject.daysix;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int count = 0;

        if (num==2){
            System.out.println("Number is a Prime Number");
        }
        else{
            for (int i = 2; i < num/2; i++){
                if(num % i == 0){
                    count = count + 1;
                    break;
                }
            }
        }
        if (count==1){
            System.out.println("Number is not a prime number");
        }
        else
            System.out.println("Number is a prime number");
    }
}
