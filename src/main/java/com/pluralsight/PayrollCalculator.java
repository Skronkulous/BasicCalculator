package com.pluralsight;
import java.sql.SQLOutput;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = kbScanner.nextLine();

        System.out.print("How many hours have you worked? ");
        float hours = kbScanner.nextFloat();

        System.out.print("What is your pay rate? ");
        float payRate = kbScanner.nextFloat();

        System.out.println("\nHello " + name + "! \nYour gross pay is: " +(payRate * hours));

    }
}
