package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();
        int s = 0;
        System.out.print("Нечетные значения, расположенные между этими числами: ");
        for (int i = a; i<=b; i++)
        {
            s += i;
            if ((i%2) != 0) System.out.print(i + " ");
        }
        System.out.println("\nСумма всех чисел, расположенных между этими числами: " + s);
    }
}
