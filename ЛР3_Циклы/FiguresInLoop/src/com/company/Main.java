package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int w = in.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int h = in.nextInt();

        System.out.print("Прямоугольник: ");
        for (int i=1;i<=h;i++)
        {
            System.out.print("\n");
            for (int j=1;j<=w;j++)
            {
                System.out.print(" ");
                System.out.print("*");
            }

        }

        System.out.print("\n\nПрямоугольный треугольник: ");
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("\n\nРавносторонний треугольник: ");
        for (int i=5;i>0;i--)
        {

            for (int j=0;j<5-i;j++)
            {
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<2*i-1;j++)
            {
                System.out.print("*");
                System.out.print("*");
            }
            System.out.print("*");
            System.out.print("\n");
        }

        System.out.println("\nРомб: ");
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");
        }
        for (int i=5;i>0;i--)
        {
            for (int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");
        }

        System.out.println("\nПравая половинка ромба: ");
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i=5;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
