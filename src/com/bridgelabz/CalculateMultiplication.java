package com.bridgelabz;

import java.util.Scanner;

public class CalculateMultiplication  {
    public static  int findMultiplication(int a,int b){
        int product=a*b;
        return product;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numbers");
        int a= sc.nextInt();
        int b =sc.nextInt();
      int product=  findMultiplication(a,b);
        System.out.println(" multiply is " +product);

    }
}
