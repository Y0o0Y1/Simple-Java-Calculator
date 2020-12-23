package com.company;
import com.sun.org.apache.xpath.internal.operations.Mult;
import javafx.application.Application;


import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String state ;

        do {
            System.out.println("Please Enter Two Numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            Addition add = new Addition();
            Multiplication multiply = new Multiplication();
            System.out.println("The sum of " + num1 + " & " + num2 + " = " + add.Add(num1, num2));
            System.out.println("The Multiplication of " + num1 + " & " + num2 + " = " + multiply.Multiply(num1, num2));
            System.out.println("If You want to calculate two more numbers enter y else enter any key");
            state = input.next();
            System.out.println(state);
        }
        while (state.equals("Y") || state.equals("y"));
    }}








