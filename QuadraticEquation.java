package com.assignment2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the co-efficients ax^2+bx+c");
        double a= sc.nextDouble(), b= sc.nextDouble(), c= sc.nextDouble();
        double discriminant = b*b-4*a*c;
        if(discriminant>0){
            double x1=(-b+Math.sqrt(discriminant))/2*a;
            double x2=(-b-Math.sqrt(discriminant))/2*a;
            System.out.println("The roots are:" );
            System.out.println("x1 = "+x1);
            System.out.println(" x2 = "+x2);
        }
        else if(discriminant==0){
            double root=-b/(2*a);
            System.out.println("The roots are equal : " + root);
        }
        else{
            double real=-b/(2*a);
            double complex=Math.sqrt(-discriminant)/(2*a);
            System.out.println("The roots are:" );
            System.out.println("x1 = "+real+"+"+complex+"i");
            System.out.println(" x2 = "+real+"-"+complex+"i");
        }
    }
}
