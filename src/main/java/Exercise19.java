/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("Enter your weight:");
        Scanner UserInput = new Scanner(System.in);
        double weight = UserInput.nextInt();

        System.out.println("Enter your height:");
        double height = UserInput.nextInt();

        double bmi = (weight / (height * height)) * 703;
        if (bmi < 18.5){
            System.out.println("Your BMI is " + bmi + "\nYou are underweight. You should see your doctor.");
        }else if(bmi > 25){
            System.out.println("Your BMI is " + bmi + "\nYou are overweight. You should see your doctor.");
        }else{
            System.out.println("Your BMI is " + bmi + "\nYou are within the ideal weight range .");
        }
    }
}
