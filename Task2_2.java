package com.company;
import java.util.Scanner;
/* Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число
 следующим критериям: при делении на 5 в остатке получается 2,
 а при делении на 7 в остатке получается 1. (Пример: число 57 верно)
 */

public class Task2_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        boolean isThrue = true;
        System.out.print("Угадайте у какого числа при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1:");
        first = num.nextInt();
        if (first % 5 == 2 && first % 7 == 1 ) {
            System.out.print("Верно!");
        }
        else{
            System.out.print("Не верно!");
        }

    }
}
