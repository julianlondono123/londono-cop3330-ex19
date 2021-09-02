import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        double height, weight, BMI;

        System.out.println("Enter your weight in pounds");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        weight = input.nextDouble();

        System.out.println("Enter your height in inches");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        height = input.nextDouble();

        BMI = (weight / (height * height)) * 703.0;
        BMI = Math.round(BMI * 10.00)/10.00;

        if (BMI > 25) {
            System.out.println("Your BMI is " + BMI + "\nYou are overweight, you should see a doctor");
        }
        else if (BMI < 18.5) {
            System.out.println("Your BMI is " + BMI + "\nYou are underweight, you should see a doctor");
        }
        else {
            System.out.println("Your BMI is " + BMI + "\nYou are within the ideal weight range");
        }
    }
}
