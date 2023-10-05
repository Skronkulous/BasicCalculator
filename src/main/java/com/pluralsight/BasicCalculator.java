package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main (String[] args) {
        Scanner kbScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = kbScanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = kbScanner.nextFloat();
        kbScanner.nextLine();

        System.out.print("Possible calculations: \n   (A)dd \n   (S)ubtract \n   (M)ultiply \n   (D)ivide \nPlease select an option: " );
        char calcResult = kbScanner.nextLine().charAt(0);

        System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));

    }

}
