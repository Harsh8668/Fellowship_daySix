package com.javaproject.daysix;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        System.out.println("How many coupans do you to generate");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] coupan = new int[count];

        int i;
        for (i = 0; i < count; i++) {
            coupan[i] = Random();
            System.out.print(coupan[i] + " " );
        }
    }

    public static int Random(){
        int random = (int) (Math.random() * 100000 + 1);
        return random;
    }
}
