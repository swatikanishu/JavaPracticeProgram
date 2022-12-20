package com.bridgelabz;

import java.util.Scanner;

public class Array {
    static int count ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int no1 = 66;
        int no2 = 77;

        int a[] = new int[n];

        System.out.println("enter ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == no1) {
                count++;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == no2)
                        count++;



                    }

                }


            }
        if(count==2){
            System.out.println("both are availble");
        }else System.out.println("not");


        }


    }

