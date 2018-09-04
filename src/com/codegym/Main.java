package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Sum = " + tongChuSo(n));

    }

    public static int tongChuSo(int n) {
        int sum = 0;
        int du;
        while (n != 0) {
            du = n % 10;
            sum += du;
            n /= 10;
        }
        return sum;
    }
}
