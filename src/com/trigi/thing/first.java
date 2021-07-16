package com.trigi.thing;
import java.lang.Math;
public class first {
    // rNumber(x, y) returns an integer from x to y, inclusive.
    public static int rNumber(int x, int y) {
        return (int) Math.floor(Math.random() * (y-x+1) + x);
    }
    public static void main(String[] args) {
        System.out.println("5 random numbers from 1 to 10:");
        for (int i = 0; i < 5; i++) {
            System.out.println(rNumber(1,10));
        }
    }
}
