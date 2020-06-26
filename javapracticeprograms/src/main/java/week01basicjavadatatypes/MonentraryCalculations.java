package week01basicjavadatatypes;

import java.util.Scanner;

public class MonentraryCalculations {

    public static void main(String[] args){

        //declaring data types
        double amount;
        int  remainingAmount,  dollar, quarter, dime, nickel, pennies;

        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs
        System.out.println("PLEASE ENTER AN AMOUNT TO CONVERT :");
        amount = userInput.nextDouble();

        remainingAmount = (int) (amount*100);//converting  the amount to cents by multiplying by 100

        dollar = remainingAmount/100; //dividing by 100 to get  dollars

        remainingAmount = remainingAmount%100; //calculating the remainder of the actual amount

        quarter = remainingAmount/25; //dividing by 25 to get number of quarters

        remainingAmount = remainingAmount%25;//calculating the remainder of the remaining amount

        dime = remainingAmount/10;//dividing by 10 to get number of dimes
         remainingAmount = remainingAmount%10;//calculating the remainder of the remaining amount

         nickel = remainingAmount/5; //dividing by 5 to get  number of nickles
         remainingAmount =remainingAmount%5;//calculating the remainder of the remaining amount

         pennies = remainingAmount;


        System.out.println("In  $" + amount + " there are $" + dollar + ", " + quarter + " quarters, "+ dime + " dimes, "+
        nickel + " nickles and " + pennies +" pennies." );




    }}
