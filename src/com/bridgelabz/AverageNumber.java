package com.bridgelabz;

import java.util.Scanner;

public class AverageNumber {
    public static float findAverageNum(int a,int b ,int c) {
        float average= (a+b+c)/(3);
      return average;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
     float average = findAverageNum(a,b,c);
        System.out.println(average);

    }

}
