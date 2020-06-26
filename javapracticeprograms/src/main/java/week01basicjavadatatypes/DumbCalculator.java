package week01basicjavadatatypes;

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args){

        //declaring data types
        double number1, number2, number3, result;

        Scanner userInput = new Scanner(System.in); //importing scanner class for user inputs

        System.out.println("PLEASE ENTER FIRST NUMBER :");
        number1 = userInput.nextDouble();

        System.out.println("PLEASE ENTER SECOND NUMBER :");
        number2 = userInput.nextDouble();

        System.out.println("PLEASE ENTER THIRD NUMBER :");
        number3 = userInput.nextDouble();

        result = (number1 + number2 + number3)/2; //adding three number input by user and doing division

        System.out.println(number1 + " added to   "+ number2 +" added to "+ number3 + " and divided by 2  = " + result+ "!");


    }

}
