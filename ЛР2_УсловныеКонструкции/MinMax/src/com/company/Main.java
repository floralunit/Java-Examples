package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();
        System.out.print("Введите число e: ");
        int e = in.nextInt();
        int min = 0;
        if (a < b & a < c & a < d & a<e) min = a;
        else if (b < a & b < c & b < d & b<e) min = b;
        else if (c < a & c < b & c < d & c <e) min = c;
        else if (d < b & d < c & d < a & d < e) min = d;
        else if (e < b & e < c & e < a & e < d) min = e;
        System.out.println("Наименьшее число: " + min);

        int max = Math.max( Math.max(a,b), Math.max(c,d) );
        if (e > max) max = e;
        System.out.println("Наибольшее число: " + max);
    }
}
