package com.example.project;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Operation (+  -  *  or /) :  ");
    String operation = scan.nextLine();

    System.out.println("First number: ");
    double num1 = scan.nextDouble();

    System.out.println("Second number: ");
    double num2 = scan.nextDouble();

    double result = 1;

    if (operation.equals("+")){
        result = num1+num2;
    }
    if (operation.equals("-")){
        result = num1-num2;
     }
    if (operation.equals("*")){
        result = num1*num2;
     }
     if (operation.equals("/")){
        result = num1/num2;
     }

    System.out.println("The result is " + result);

    scan.close();
    }
}