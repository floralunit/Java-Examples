package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разрядность массива: ");
        int num = in.nextInt();
        int[] array = new int [num];
        System.out.print("Введите элементы массива:\n");
        for (int iCount = 0; iCount< array.length; iCount++){
            System.out.print((iCount+1) + "-й элемент: ");
            array[iCount] = in.nextInt();
        }

        boolean sorted= true;
        if (array[0] <= array[1]) {
            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println("Массив является упорядоченным по возрастанию!");
            }
            else {
                System.out.println("Массив не является упорядоченным!");
            }
        }
        else {
            for (int i = 2; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Массив является упорядоченным по убыванию!");
            } else {
                System.out.println("Массив не является упорядоченным!");
            }
        }

    }
}