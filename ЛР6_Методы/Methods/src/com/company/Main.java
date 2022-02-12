package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int x = getInt();
        int y = getInt();
        char operation = getOperation();
        System.out.print("Результат: " + calc (x, y, operation));
    }
    public static int calc(int num1, int num2, char operation)   {
        switch (operation) {
            case '+': {
                return num1 + num2;
            }
            case '-': {
                return num1 - num2;
            }
            case '*': {
                return num1 * num2;
            }
            default: {
               System.out.println("Такой операции нет!");
               return 0;
            }
        }
    }
    public static char getOperation()  {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите знак операции: ");
        return in.findInLine(".").charAt(0);
    }
    public static int getInt()  {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        return x;
    }
    public static void arrayFunc(int a, int b) {
        Random objGenerator = new Random();
        int[][] array = new int [a][b];
        int randomNumber;
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array[i].length; j++) {
                randomNumber = 10 - objGenerator.nextInt(21);
                array[i][j] = randomNumber;
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
    public static double sqrtFunc(double n) {
        double res;
        res = Math.sqrt(n) + n;
        return res;
    }
    public static double maxFunc(double n1, double n2) {
        double max;
        if (n1 > n2)
            max = n1;
        else
            max = n1;
        return max;
    }
    public static double minFunc(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
    public static int mulFunc(int a, int b) {
        return a * b;
    }
    public static int subFunc(int a, int b) {
        return a - b;
    }
    public static int addFunc(int a, int b) {
        return a + b;
    }
}
