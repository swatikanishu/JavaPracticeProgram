package com.bridgelabz;

import java.util.Scanner;

public class EvenNumber {
    public static void findEvenNumber(int n) {
            if(n%2==0){
                System.out.println("even number");
            }else
                System.out.println("noo");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        findEvenNumber(n);


    }
}
