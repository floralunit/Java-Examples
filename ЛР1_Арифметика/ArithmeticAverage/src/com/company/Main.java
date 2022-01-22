package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        double a = in.nextDouble();
        System.out.print("Введите число b: ");
        double b = in.nextDouble();
        System.out.print("Введите число c: ");
        double c = in.nextDouble();
        double res = (a + b + c) /3;
        System.out.println("Среднее арифметическое: " + res);

    }
}
