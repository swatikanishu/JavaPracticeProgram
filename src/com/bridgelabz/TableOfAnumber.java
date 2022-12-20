package com.bridgelabz;

import java.util.Scanner;

public class TableOfAnumber{

    public static void findTable(int n) {
        int c;
        for(int i=1;i<=10; i++){
           c = n*i;
            System.out.println(c);
        }


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        findTable(n);
    }
}
