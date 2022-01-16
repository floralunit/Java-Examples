package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
        System.out.println("x=" + x + "; y=" + y+ "; z=" + z);
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.printf("x=%d; y=%d; z=%d; \n", x, y, z);
    }
}
