package com.trigi.thing;
import java.lang.*;
import java.util.*;

public class first {

    // rNumber(x, y) returns an integer from x to y, inclusive.
    public static int rNumber(int x, int y) {
        return (int) Math.floor(Math.random() * (y-x+1) + x);
    }

    public static void main(String[] args) {

        // creates scanner, and asks the user for information.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers do you want to print?");
        int x = sc.nextInt();
        System.out.println("What should the range of the random numbers be?");
        int y = sc.nextInt();

        // makes sure it won't say "1 numbers"
        if (x == 1) {
            System.out.println(x + " random number from 1 to " + y + ":");
        } else {
            System.out.println(x + " random numbers from 1 to " + y + ":");
        }

        // generates x random numbers from 1 to y
        StringBuilder s = new StringBuilder();
        String temp;
        for (int i = 0; i < x; i++) {
            if (i < x - 1) {
                temp = rNumber(1, y) + ", ";
            } else {
                temp = Integer.toString(rNumber(1, y));
            }
            System.out.print(temp);
            s.append(temp);
            if (s.length() > 80) {
                s = new StringBuilder();
                System.out.print("\n");
            }
        }
    }
}
