package week01basicjavadatatypes;

import java.util.Scanner;

public class carPool {
    public static void main(String[] args){

        //declaring data types
        double spaceInACar, carpoolCapacity, averagePassangersPerCar,averageMilesDriven;
        double avgMilesPerGallon, gasCostPerGallon, moneySaved, gasCostPerTrip ;
        int cars, drivers, passengers,carsNotDriven, carsDriven;

        cars = 100;
        spaceInACar = 4;
        drivers = 30;
        passengers = 90;
        averageMilesDriven = 29.2;
        avgMilesPerGallon = 23.6;
        gasCostPerGallon = 2.157;


       // Scanner userInput = new Scanner(System.in); //importing Scanner class

        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven*spaceInACar;
        averagePassangersPerCar = passengers/ carsDriven;
        gasCostPerTrip = averageMilesDriven *(gasCostPerGallon/avgMilesPerGallon);

        moneySaved =( gasCostPerTrip*cars) - (gasCostPerGallon*carsDriven);


        System.out.println("There are "+ cars +" available.\n" +
                "There are only "+ drivers +" drivers available today.\n" +
                "That means there will be "+ carsNotDriven + " empty cars today!\n" +
                "We can transport "+ carpoolCapacity + " people today.\n" +
                "Out of that, we're transporting " +passengers + " today.\n" +
                "So we'll need to put about "+ averagePassangersPerCar + " in each car.\n" +
                "Long story short, today, we'll be saving about $"+ moneySaved +"! ");

}}
