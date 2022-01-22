package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус поверхности цилиндра: ");
        double r = in.nextDouble();
        System.out.print("Введите высоту цилиндра: ");
        double h = in.nextDouble();
        double v = Math.pow(r,2) * PI * h;
        double s = 2 * PI * r * (r + h);
        System.out.println("Объем цилиндра равен: " + v);
        System.out.println("Площадь поверхности цилиндра равна: " + s);
    }
}
