package com.company;
import java.util.Scanner;
/*
Напишите программу, которая проверяет вторую справа цифру
в восьмеричном представлении числа, введенного пользователем.
Число водится в десятичном (обычном) представлении.
 */

public class Task2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = in.nextInt();
        String numOcto = Integer.toOctalString(num);
        System.out.printf("Число в восьмеричном виде: %s\n", numOcto);
        if (numOcto.length()==1){
            System.out.println("Число в весьмеричном представлении не имеет второго справа знака.");
        }
        else {
            char secondDigit = numOcto.charAt(numOcto.length()-2);
            System.out.printf("Вторая справа цифра восьмеричном представлении числа: %c", secondDigit);
        }
    }
}
