package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random objGenerator = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите разрядность квадратной матрицы: ");
        int num = in.nextInt();
        int[][] array = new int [num][num];
        int randomNumber;
        System.out.println("\nИсходный массив: ");
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++) {
                randomNumber = objGenerator.nextInt(21);
                array[i][j] = randomNumber;
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int n;
        System.out.println("\nМассив с переставленными строками: ");
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++) {
                if (i % 2 == 0)
                {
                    n = array[i][j];
                    array[i][j] = array[i+1][j];
                    array[i+1][j] = n;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
/*        int s = 0, m = 1, max = array[0][0];
        for (int i = 0; i< array.length; i++){
            s = 0;
            m = 1;
            for (int j = 0; j< array.length; j++) {
                s +=array[i][j];
                m *= array[j][i];
                if (i == j && array[i][j] > max) max = array[i][j];
            }
            System.out.printf("\nСумма элементов строки %d равна  %d", i+1, s);
            System.out.printf("; Произведение элементов столбца %d равно  %d", i+1, m);
        }
        System.out.printf("\n\nМаксимальный элемент главной диагонали равен  %d", max);*/

/*        System.out.println("Нулевые элементы массива: ");
        int neg = 0, pos = 0; //количество положительных и отрицательных чисел
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++) {
                if (array[i][j] > 0) pos++;
                if (array[i][j] < 0) neg++;
                if (array[i][j] == 0) System.out.println("Строка: " + (i+1) + " Столбец: " + (j+1));
            }
        }
        System.out.printf("Количество положительных элементов: %d \nКоличество отрицательных элементов: %d ", pos, neg);*/

    }
}
