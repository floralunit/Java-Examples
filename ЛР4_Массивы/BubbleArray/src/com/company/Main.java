package com.company;
import java.util.LinkedList;
import java.util.List;
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
            randomNumber = objGenerator.nextInt(20);
            array[iCount] = randomNumber;
            System.out.print(array[iCount] + " ");
        }
        boolean sorted = false;
        int temp;
        while(!sorted) { //сортировка пузырьком по возрастанию главного массива
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        List<Integer> even = new LinkedList<Integer>(); //массив с четными элементами
        List<Integer> odd = new LinkedList<Integer>(); //массив с нечетными элементами
        for (int iCount = 0; iCount< array.length; iCount++){
            if (array[iCount] % 2 == 0) even.add(array[iCount]);
            else  odd.add(array[iCount]);
        }
        System.out.println("\nМассив четных элементов: ");
        for (int i = 0; i< even.size(); i++){
            System.out.print(even.get(i) + " ");
        }
        System.out.println("\nМассив нечетных элементов: ");
        for (int i = 0; i< odd.size(); i++){
            System.out.print(odd.get(i) + " ");
        }
    }
}