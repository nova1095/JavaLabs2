package com.company;
import java.util.Scanner;
//Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.

public class Task2_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("Впишите число, узнаем делится ли оно на 3:");
        first = num.nextInt();
        if (first % 3 ==0 ) {
            System.out.print("Это число делится на 3");
        }
        else{
            System.out.print("Это число не делится на 3");
        }
    }
}
