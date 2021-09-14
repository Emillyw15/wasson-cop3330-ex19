/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prog19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        double weight = 0;
        double height = 0;

        boolean test = false;

        while (test == false) {
            try {
                System.out.print("What is your height in inches? ");
                height = in.nextDouble();
                System.out.print("What is your weight in pounds? ");
                weight = in.nextDouble();

                test = true;
            } catch (InputMismatchException e) {
                System.out.println("This is not a known value.");
            }
            in.nextLine();
        }

        double BMI = (weight / (height * height)) * 703;

        if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Your BMI is " + df.format(BMI) + ". You are within the ideal range.");
        } else if (BMI > 25) {
            System.out.println("Your BMI is " + df.format(BMI) + ". You are overweight. You should see your doctor.");
        } else {
            System.out.println("Your BMI is " + df.format(BMI) + ". You are underweight. You should see your doctor.");
        }
    }
}
