package com.bridgelabz;

import java.util.Scanner;

public class Reverse {


    public static int findReverseNumber(int num) {
        int rev=0;
        int rem;
      while(num!=0){
       rem= num%10;
       rev=rev*10+rem;
        num=num/10;

      }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int c= findReverseNumber(num);
        System.out.println(c);
    }
}
