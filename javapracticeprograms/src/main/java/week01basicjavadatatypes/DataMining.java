package week01basicjavadatatypes;

import java.util.Scanner;

public class DataMining {
    public static void main(String[] args){

        //declaring data types
        String firstName, lastName, login;
        int studentId, grade;
        double gpa;



        Scanner userInput = new Scanner(System.in); //importing scanner class for user inputs
        System.out.println("Please enter the following information so I can sell it for a profit!");

        System.out.println("YOUR FIRST NAME :");
        firstName= userInput.nextLine();

        System.out.println("YOUR LAST NAME :");
        lastName= userInput.nextLine();

        System.out.println("YOUR LOGIN INFORMATION :");
        login= userInput.nextLine();

        System.out.println("YOUR STUDENT ID :");
        studentId = userInput.nextInt();

        System.out.println("YOUR GRADE :");
        grade = userInput.nextInt();

        System.out.println("YOUR G.P.A :");
        gpa = userInput.nextDouble();


        // using ifelse  to make user enter the desired range of grade and gpa
        if ((grade>= 9 && grade <=12) && (gpa >=0 && gpa <= 4)){

            System.out.println(" YOUR INFORMATION : " + "\n Login : " + login +
                            " \n Student ID : " + studentId + "\n Name : " + firstName + " " + lastName +
                    "\n Grade : " + grade + " \n G.P.A : " + gpa);
        }else {
            System.out.println("Please Enter  Grade between 9 to 12");
            System.out.println("Please Enter  G.P.A between 0.0 to 4.0");

        }
}}
