package com.assignment2;

public class VariableScope {
    public static void main(String[] args) {
        int a=10;
        if(true){
            int b=20;
            System.out.println("a: "+a+" b: "+b);
        }
        System.out.println("a: "+a+" b: "+b);
    }
    //COMPILATION ERROR
    //java: cannot find symbol
    //  symbol:   variable b
    //  location: class com.assignment2.VariableScope
}
