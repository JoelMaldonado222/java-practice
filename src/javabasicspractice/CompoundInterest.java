package javabasicspractice;

import java.util.Scanner;


public class CompoundInterest {

    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double finalAmount;

        System.out.println("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.println(" Enter the interest rate (in % form): ");
        rate =scanner.nextDouble() / 100;

        System.out.println("Enter the numbe of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years ");
        years = scanner.nextInt();

        finalAmount = principle * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);
        System.out.printf("The amount after %d years is $%.2f%n" , years , finalAmount) ;








        scanner.close();


    }

}