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
        int max = 0, i = 0;
        if (a >= b & a >= c & a >= d)
        {
            max = a;
            i++;
        }
        if (b >= a & b >= c & b >= d || b==max)
        {
            max = b;
            i++;
        }
        if (c >= a & c >= b & c >= d || c==max)
        {
            max = c;
            i++;
        }
        if (d >= a & d >= b & d >= c || d==max)
        {
            max = d;
            i++;
        }
        System.out.println("Наибольшее число: " + max + "\nКоличество максимальных чисел: " + i);
    }
}
