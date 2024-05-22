package com.example.programgroup;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberfist = read.nextInt();
        Scanner read0ther = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int numbersecond = read0ther.nextInt();
        int sum = numberfist + numbersecond;
        System.out.println("Result of sum is: " + sum);
        double division;
        division = (double) numberfist / numbersecond;
        System.out.println("Result of division is: " + division);
    }
}