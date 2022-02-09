package com.javaproject.daysix;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("Enter the range");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lastTerm = 0;
        int secondLastTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(lastTerm +" ");
            int nextTerm = lastTerm + secondLastTerm;
            lastTerm = secondLastTerm;
            secondLastTerm = nextTerm;
        }
    }
}