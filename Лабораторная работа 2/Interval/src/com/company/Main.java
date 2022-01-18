package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 100: ");
        int num = in.nextInt();
        if (num >= 0 && num <= 14) System.out.print("Число находится в промежутке [0 - 14]");
        if (num >= 15 && num <= 35) System.out.print("Число находится в промежутке [15 - 35]");
        if (num >= 36 && num <= 50) System.out.print("Число находится в промежутке [36 - 50]");
        if (num >= 51 && num <= 100) System.out.print("Число находится в промежутке [51 - 100]");
        if (num < 0 || num > 100) System.out.print("Число не входит ни в один промежуток!");
    }
}
