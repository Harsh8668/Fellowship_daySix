package com.javaproject.daysix;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rcvNum = 0;
        int i = 0;

        while(num != 0){
            i++;
            rcvNum = (rcvNum * 10) + (num % 10);
            num = (int) (num / 10);
        } System.out.println(rcvNum);
    }
}