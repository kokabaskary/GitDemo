package week01basicjavadatatypes;

import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args){

        //declaring data types
        String name;
        int age;
        double wage;



        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs
        System.out.println("Hello. What's your name?");
        name = userInput.nextLine();

        System.out.println("Hi " + name + " ! How old are you?");
        age = userInput.nextInt();

        System.out.println("So you're " +age + " eh? That's not old at all! How much do you make, " + name + " ?");

        wage = userInput.nextDouble();

        System.out.println("$" +wage + "! That's really good wage for " + age + "! year old.");


    }
}
