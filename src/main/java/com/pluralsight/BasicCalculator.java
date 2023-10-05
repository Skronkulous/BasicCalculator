package com.pluralsight;
import java.util.*;

public class BasicCalculator {

    public static void anotherCalc(){
        Scanner kbScanner = new Scanner(System.in);
        String another;
        System.out.print("Would you like to try another operation? (Y/N) ");
        another = kbScanner.nextLine();
        if (another.equalsIgnoreCase("y")){
            basicCalc();
        }
        else if (another.equalsIgnoreCase("n")){

        }
        else{
            System.out.println("Please enter a 'y' or 'n'! ");
            anotherCalc();
        }

    }
    public static void basicCalc() {
        Scanner kbScanner = new Scanner(System.in);

        while (1 > 0) {
            System.out.print("Enter first number: ");
            float num1 = kbScanner.nextFloat();
            System.out.print("Enter second number: ");
            float num2 = kbScanner.nextFloat();
            kbScanner.nextLine();

            System.out.print("Possible calculations: \n   (A)dd \n   (S)ubtract \n   (M)ultiply \n   (D)ivide \nPlease select an option: ");
            String calcResult = kbScanner.nextLine();

            if (calcResult.equalsIgnoreCase("a")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                anotherCalc();
                break;
            }
            if (calcResult.equalsIgnoreCase("s")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                anotherCalc();
                break;
            }
            if (calcResult.equalsIgnoreCase("m")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                anotherCalc();
                break;
            }
            if (calcResult.equalsIgnoreCase("d")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                anotherCalc();
                break;

            }
            else {
                System.out.println("Please input one of the given calculation options! ");
                basicCalc();
                break;
            }
        }
    }
    public static void main (String[] args){
        basicCalc();
    }
}