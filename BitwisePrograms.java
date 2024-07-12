package com.assignment2;

import java.util.Scanner;

public class BitwisePrograms {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Bitwise AND : "+(a&b));
        System.out.println("Bitwise OR : "+(a|b));
        System.out.println("Bitwise XOR : "+(a^b));
        System.out.println("Bitwise NOT of a : "+~(a));
        System.out.println("Bitwise NOT of b : "+~(b));
        System.out.println("Bitwise LEFT SHIFT a<<b : "+(a<<b));
        System.out.println("Bitwise RIGHT SHIFT a>>b : "+(a>>b));
        System.out.println("Bitwise UNSIGNED RIGHT SHIFT a>>>b : "+(a>>>b));
    }
}
