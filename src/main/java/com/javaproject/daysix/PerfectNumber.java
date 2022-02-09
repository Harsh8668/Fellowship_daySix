package com.javaproject.daysix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sum = sum + i;
                System.out.print(+i+"\t");
            }
        }
        if (sum==num){
            System.out.println();
            System.out.println("The number is an Perfect Number");
        }
        else{
            System.out.println("The number is not an Perfect Number");
        }
    }
}
