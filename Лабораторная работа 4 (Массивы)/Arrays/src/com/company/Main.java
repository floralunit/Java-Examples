package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random objGenerator = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разрядность массива: ");
        int num = in.nextInt();
        int[] array = new int [num];
        int randomNumber;
        for (int iCount = 0; iCount< array.length; iCount++){
            randomNumber = 20 - objGenerator.nextInt(41);
            array[iCount] = randomNumber;
            System.out.print(array[iCount] + " ");
        }
        int c =0;//количество элементов массива, не входящих в диапазон от -10 до 10
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] > 10 || array[iCount] < -10) c++;
        }
        System.out.println("\nКоличество  элементов массива, не входящих в диапазон от -10 до 10 равно " + c);

/*      int max = array[0], min = array[0];
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] > max) max = array[iCount];
            if (array[iCount] < min) min = array[iCount];
        }
        System.out.printf("\nНаибольшее значение массива = %d\nНаименьшее значение массива = %d\nРазность между максимальным и минимальным элементами = %d", max, min, max-min);*/

/*        int max = array[0], min = array[0], s = 0;
        double a; //среднее арифметическое
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] > max) max = array[iCount];
            if (array[iCount] < min) min = array[iCount];
            s += array[iCount];
        }
        a = s / (double)num;
        System.out.printf("\nНаибольшее значение массива = %d\nНаименьшее значение массива = %d\nСумма всех элементов массива = %d\nСреднее арифметическое элементов массива = %f\n", max, min, s, a);
        System.out.println("Все нечетные значения массива: ");
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] % 2 != 0) System.out.print(array[iCount] + " ");
        }
*/

/*
        int c =0;//количество элементов массива, входящих в диапазон от 0 до 125
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] > 0 && array[iCount]<125) c++;
        }
        System.out.println("\nКоличество  элементов массива, входящих в диапазон от 0 до 125 равно " + c);
*/

    }
}




