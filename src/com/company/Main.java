package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// write your code here

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");

        for (int x = in.nextInt();x>0 ; x--)
            if ((x%2)==0)
                System.out.print(x + "; ");

    }


}