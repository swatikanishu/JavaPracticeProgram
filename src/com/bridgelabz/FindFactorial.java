package com.bridgelabz;

import java.util.Scanner;

public class FindFactorial {
    public static void findFactorial(int n) {
        if(n<0){
            System.out.println("inavild");
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial"+factorial);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        findFactorial(n);

    }
}
