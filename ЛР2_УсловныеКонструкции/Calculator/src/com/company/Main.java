package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый операнд: ");
        int operand1 = in.nextInt();
        System.out.print("Введите второй операнд: ");
        int operand2 = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите знак операции: ");
        String sign = in1.nextLine();
        switch (sign)
        {
            case "+": {
                System.out.println("Результат выполнения арифметической операции = " + (operand1 + operand2) );
                break;
            }
            case "-": {
                System.out.println("Результат выполнения арифметической операции = " + (operand1 - operand2) );
                break;
            }
            case "*": {
                System.out.println("Результат выполнения арифметической операции = " + (operand1 * operand2) );
                break;
            }
            case "/": {
                if (operand2 == 0) System.out.println("Ошибка! Делить на 0 нельзя");
                else System.out.println("Результат выполнения арифметической операции = " + (operand1 / operand2) );
                break;
            }
            default:{
                System.out.println("Неправильный знак операции!");
                break;
            }
        }
    }
}
