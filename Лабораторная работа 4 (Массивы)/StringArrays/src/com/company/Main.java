package com.company;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ПРОЦЕНТ ВХОЖДЕНИЯ ЗАДАННОГО СИМВОЛА В СТРОКУ
/*        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        System.out.print("Введите символ: ");
        String s = in.nextLine(); //заданный символ
        int c = 0; //количество данного символа в строке
        String []array = string.split("");
        for (int  i =0; i < array.length; i ++)
        {
            if (Objects.equals(array[i], s)) c++;
        }
        double per = (double)c / ((double)array.length/100.0); //процент вхождения символа в строку
        System.out.println("Процент вхождения символа " + s + " в строку " + string + " равен " + per);*/

        //ПРОЦЕНТ ВХОЖДЕНИЯ ГЛАСНЫХ БУКВ ЛАТИНСКОГО АЛФАВИТА В СТРОКУ
/*        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        String vowels = "aeouiyAEOUIY";
        int c = 0; //количество гласных букв латинского алфавита в строке
        String []array = string.split("");
        for (int  i =0; i < array.length; i ++)
        {
            if (vowels.contains(array[i].toString()))
                c++;
        }
        double per = (double)c / ((double)array.length/100.0); //процент вхождения символа в строку
        System.out.println("Процент вхождения гласных букв латинского алфавита в строку " + string + " равен " + per);*/

        //КОЛИЧЕСТВО СЛОВ В СТРОКЕ
/*        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        String []array = string.split(" ");
        System.out.println("Количество слов в строке равно " + array.length);*/

        //ПРОВЕРКА ЯВЛЯЕТСЯ ЛИ СТРОКА ПАЛИНДРОМОМ
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        String []array = string.split("");
        String []arrayReverse = new String[array.length];
        for (int  i = array.length-1; i >= 0; i --)
        {
            arrayReverse[array.length - i - 1] = array[i];
        }
        if (Arrays.equals(array, arrayReverse)) System.out.println("Эта строка палиндром! ");
        else System.out.println("Эта строка не палиндром! ");
    }
}
