package week01basicjavadatatypes;


import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args){

        //declaring data types
        double number1, number2, result;
        int operator;



        Scanner userInput = new Scanner(System.in);//importing scanner class for user inputs
        System.out.println("PLEASE ENTER FIRST NUMBER :");
        number1 = userInput.nextDouble();

        System.out.println("PLEASE ENTER SECOND NUMBER :");
        number2 = userInput.nextDouble();

        System.out.println("PLEASE MAKE YOUR SELECTION" + //asking user for the operation to be performed
                "\n For addition enter : 1" +
                "\n For Subtraction enter : 2" +
                "\n For Multiplication enter : 3" +
                "\n For Division enter : 4" +
                "\n For Modulus/remainder enter : 5");

        operator = userInput.nextInt();

        //using switch statement for the operation
        switch (operator){
            case 1:
               result = number1+number2;
                System.out.println("Number :  " +number1 + " added to number :  "+ number2 + " = " + result );
                break;

            case 2:
                result = number1-number2;
                System.out.println("Number :" +number1 + " subtratracted from number : "+ number2 + " = " + result );
                break;

            case 3:
                result = number1*number2;
                System.out.println("Number : " +number1 + " multiplied to number :  "+ number2 + " = " + result );
                break;

            case 4:
                result = number1/number2;
                System.out.println("Number :  " +number1 + " divided by  "+ number2 + " = " + result );
                break;

                case 5:
                result =  number1%number2;


                System.out.println("Modulus/Remainder  of number : " +number1 + "  and number :   "+ number2 + " = " + result );
                break;

            default:
                System.out.println("PLEASE ENTER A VALID FUNCTION NUMBER");
            }
        }


    }

