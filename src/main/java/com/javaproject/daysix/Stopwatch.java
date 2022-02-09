package com.javaproject.daysix;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = 0;
        long endTime = 0;
        long elapsedTime = 0;

        System.out.println("Press start to Start the watch");
        String start = String.valueOf(sc.next().charAt(0));
        startTime = System.currentTimeMillis();
        System.out.println(startTime);

        System.out.println("Press stop to stop the watch");
        String stop = String.valueOf(sc.next().charAt(0));
        endTime = System.currentTimeMillis();
        System.out.println(endTime);

        elapsedTime = endTime - startTime;
        elapsedTime = elapsedTime/1000;
        System.out.println("The Difference is " + elapsedTime + "seconds");

    }
}
