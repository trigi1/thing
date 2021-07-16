package com.trigi.thing;
import java.lang.Math;
public class first {
    // rNumber(x, y) returns an integer from x to y, inclusive.
    public static int rNumber(int x, int y) {
        return (int) Math.floor(Math.random() * (y-x+1) + x);
    }
    public static void main(String[] args) {
        int x = rNumber(1, 10);
        int y = rNumber(1, 10);
        if (x == 1) {
            System.out.println(x + " random number from 1 to " + y + ":");
        } else {
            System.out.println(x + " random numbers from 1 to " + y + ":");
        }
        for (int i = 0; i < x; i++) {
            System.out.println(rNumber(1,y));
        }
    }
}
