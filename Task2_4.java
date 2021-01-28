package com.company;
import java.util.Scanner;
/*
Напишите программу, которая проверяет,
попадает ли введение пользователем число
в диапазон от 5 до 10 включительно.
 */

public class Task2_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        boolean isThrue = true;
        System.out.print("Напишите число от 5 до 10 включительно:  ");
        first = num.nextInt();
        if (first >= 5 && first <= 10 ) {
            System.out.print("Верно!");
        }
        else{
            System.out.print("Не верно!");
        }

    }
}
