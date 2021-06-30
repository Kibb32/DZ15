package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int strings = 5;
        int stolbec =0;
        int stroka =0;
        int mas[][] = new int[n][n];

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = rnd.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        stroka = scanner.nextInt(); // от 0 до 4
        for (int i =0;i<n;i++){
            System.out.printf("%-5d",mas[stroka][i]);  // все элементы 5й строки
        }
        System.out.println();

        stolbec = scanner.nextInt(); // от 0 до 9
        for (int i =0;i<strings;i++){
            System.out.printf("%-5d",mas[i][stolbec]);  // все элементы 5й строки
        }





            }
        }

