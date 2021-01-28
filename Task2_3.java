package com.company;
import java.util.Scanner;
/* Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число
 следующим критериям: число делится на 4, и при этом оно не меньше 10.
 */

public class Task2_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        boolean isThrue = true;
        System.out.print("Какое число делится на 4, и при этом оно не меньше 10?:   ");
        first = num.nextInt();
        if (first % 4 == 0 && first > 10 ) {
            System.out.print("Верно!");
        }
        else{
            System.out.print("Не верно!");
        }

    }

}
