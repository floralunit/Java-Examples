package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double r = in.nextDouble();
        double s = Math.pow(r,2) * PI;
        System.out.println("Площадь круга равна: " + s);
    }
}
