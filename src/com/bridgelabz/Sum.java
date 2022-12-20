package com.bridgelabz;

import java.util.Scanner;

public class Sum {
    public static int findSum(int a,int b) {
        int sum= a+b;

        return sum;
    }
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter");
       int a= sc.nextInt();
       int b= sc.nextInt();
      int sum = findSum(a,b);
        System.out.println("sum is"+sum);
    }


}
