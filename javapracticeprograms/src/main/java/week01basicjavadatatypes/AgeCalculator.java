package week01basicjavadatatypes;

import java.util.Scanner;

public class AgeCalculator { public static void main(String[] args){

    //declaring data types
    String name;
    int age, ageAfter5Years, age5YearsAgo;




    Scanner userInput = new Scanner(System.in); //importing scanner class for user inputs
    System.out.println("Hi there. What's your name?");
    name = userInput.nextLine();

    System.out.println("Hi " + name + "! My name is Java. Nice to meet you.\n" +
            "How old are you? ");
    age = userInput.nextInt();

    ageAfter5Years = age + 5; // incrementing age by 5 years
    age5YearsAgo = age - 5; // decrementing age by 5 years

    System.out.println("So you're " +age + " years old. Do you know that in five years you will be " + ageAfter5Years+ " years old?\n" +
            "And five years ago you were " + age5YearsAgo + "! years old. Imagine that! " + name + " ?");



}}
