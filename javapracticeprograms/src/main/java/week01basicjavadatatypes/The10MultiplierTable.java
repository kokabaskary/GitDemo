package week01basicjavadatatypes;

import java.util.Scanner;

public class The10MultiplierTable {
    public static void main(String[] args){

        //declaring data types
        int  number, product;


        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs
        System.out.println("PLEASE ENTER A NUMBER :");
        number = userInput.nextInt();

       //using for loop as a counter to increment the number
        for (int i=1; i<=10; i++){
            product = number*i;

        System.out.println( number + " * " + i + " = " + product);} //printing the result
    }
}
