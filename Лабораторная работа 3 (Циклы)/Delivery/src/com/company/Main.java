package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество клиентов: ");
        int n = in.nextInt();
        int i = 0, f = 1;
        do {
            i++;
            f *= i;
        }
        while (i < n);
        System.out.println("Количество возможных вариантов доставки равно: " + f);

    }
}
