package week01basicjavadatatypes;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){

        //declaring data types
        double height, weight, bmi;

        Scanner userInput = new Scanner(System.in); //importing scanner class for user inputs

        System.out.println("PLEASE ENTER YOUR HEIGHT IN METERS m : ");
        height = userInput.nextDouble();

        System.out.println("PLEASE ENTER YOUR WEIGHT IN  KILOGRAMS kg :");
        weight = userInput.nextDouble();

        bmi = weight/(height*height); //calculating the BMI  by formula

        System.out.printf(" YOUR B.M.I IS : %.5f  " ,bmi);


    }}
