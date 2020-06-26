package week01basicjavadatatypes;

import java.util.Scanner;

public class InchToMeterConverter {
    public static void main(String[] args){

        double inches, meters;


        Scanner userInput = new Scanner(System.in);
        System.out.println("PLEASE ENTER INCHES TO BE CONVERTED TO METERS :");
        inches = userInput.nextDouble();

        meters = inches*0.0254;

        System.out.println(inches+ " inches equals   " + meters + " meters");
    }

}
