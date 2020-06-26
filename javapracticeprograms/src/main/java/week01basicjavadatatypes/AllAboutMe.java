package week01basicjavadatatypes;

import java.util.Scanner;

public class AllAboutMe {
    public static void main(String[] args){

        //declaring data types
        String name, eyes, teeth, hair;
        int age;
        double height,heightInCms;


        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs

        System.out.println("NAME :");
        name = userInput.nextLine();


        System.out.println("HEIGHT IN INCHES :");
        height = userInput.nextDouble();
        heightInCms = height*2.54;

        System.out.println(" AGE  :");
        age = userInput.nextInt();


        System.out.println("TEETH  :");
        teeth = userInput.nextLine();

        System.out.println("EYES :");
        eyes = userInput.nextLine();

        System.out.println("HAIR : ");
        hair = userInput.nextLine();


        System.out.println("Let's talk about " + name+  ". He/She is " +heightInCms + " cms tall and "+ age + " years old."+
        "\n Huh, that's older than I expected..."+ "\n Their   eye color is : "+ eyes + " and hair color is : "+ hair+
        "\n Their teeth are usually "+ teeth+ " but it depends on the coffee." +
        "\n Alright, this is pretty boring. Let's stop talking about " + name);





    }}
