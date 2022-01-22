package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово на русском языке: ");
        String word = in.nextLine();
       switch (word)
       {
           case "Дождь":{
               System.out.println("Перевод для слова '" + word + "' = rain");
               break;
           }
           case "Солнечно":{
               System.out.println("Перевод для слова '" + word + "' = sunny");
               break;
           }
           case "Облачно":{
               System.out.println("Перевод для слова '" + word + "' = cloudy");
               break;
           }
           case "Жарко":{
               System.out.println("Перевод для слова '" + word + "' = hot");
               break;
           }
           case "Холодно":{
               System.out.println("Перевод для слова '" + word + "' = cold");
               break;
           }
           case "Снег":{
               System.out.println("Перевод для слова '" + word + "' = snow");
               break;
           }
           case "Температура":{
               System.out.println("Перевод для слова '" + word + "' = temperature");
               break;
           }
           case "Лед":{
               System.out.println("Перевод для слова '" + word + "' = ice");
               break;
           }
           case "Тепло":{
               System.out.println("Перевод для слова '" + word + "' = warm");
               break;
           }
           default:{
               System.out.println("Такого слова нет в словаре!");
               break;
           }
       }
    }
}
