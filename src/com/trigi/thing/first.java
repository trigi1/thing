package com.trigi.thing;
import java.lang.Math;
public class first {
    public static void main(String[] args) {
        System.out.println("5 random numbers from 1 to 10:");
        for (int i = 0; i < 5; i++) {
            System.out.println((int) Math.floor(Math.random() * 10 + 1));
        }
    }
}
