package com.bridgelabz;

import java.util.Scanner;

public class PrimrNumber {
    static int count;
    public static int findPrimeNumber(int n) {
        for (int i = 1; i <= 10; i++) {

            if (n % i == 0) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
     int c=  findPrimeNumber(n);
            if(c==2){
                System.out.println("primenumber"+c);
            }else
                System.out.println("noo"+c);

        }
    }

