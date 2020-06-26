package week01basicjavadatatypes;


import java.util.Scanner;

public class TheMultiplier {
    public static void main(String[] args){

        //declaring data types
        double number1, number2, product;


        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs

        System.out.println("PLEASE ENTER THE FIRST NUMBER :");
        number1 = userInput.nextDouble();

        System.out.println("PLEASE ENTER THE SECOND NUMBER :");
        number2 = userInput.nextDouble();

        product = number1*number2; //multiplying the two numbers

        System.out.println("Number : " +number1 + " multiplied to number :  "+ number2 + " = " + product); //printing the output
    }
}
