package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int yearsToOneHundred = 100 - age;
        if (yearsToOneHundred == 1) {
            System.out.println("You have 1 year left until you're one hundred years old.");
        } else System.out.println("You have " + yearsToOneHundred + " years left until you're one hundred years old.");
    }
}