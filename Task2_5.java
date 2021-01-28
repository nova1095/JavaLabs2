package com.company;
import java.util.Scanner;

/*
Напишите программу, которая проверяет,
сколько тысяч во введенном пользователем числе
(определяется четвертая цифра справа в десятичном представлении числа).
 */

public class Task2_5 {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            int first;
            System.out.print("Введите число: ");
            first = num.nextInt();
            if (first >= 1 && first <= 9999) {
                int a = first / 1000 % 10;
                System.out.print(" в веденном числе тысяч " + a);
            } else if (first >= 10000 && first <= 99999) {
                int  a =first / 1000 % 100;
                System.out.print(" в веденном числе тысяч " + a);
            } else if (first >= 100000 && first <= 999999) {
                int  a =first / 1000 % 1000;
                System.out.print(" в веденном числе тысяч " + a);
            }else if (first >= 1000000 && first <= 9999999) {
                int  a =first / 1000 % 10000;
                System.out.print(" в веденном числе тысяч " + a);
            }

        }
}
