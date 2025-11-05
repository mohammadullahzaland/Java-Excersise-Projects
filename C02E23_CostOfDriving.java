/*
  2.23 (Cost of driving) Write a program that prompts the user to enter the distance to
  drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
  then displays the cost of the trip. Here is a sample run:
  Enter the driving distance: 900.5
  Enter miles per gallon: 25.5
  Enter price per gallon: 3.55
  The cost of driving is $125.36
 */
import java.util.Scanner;
public class C02E23_CostOfDriving
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the driving distance in miles:");
    double drivingDistance = input.nextDouble();

    System.out.println("Enter the fuel efficiency of the car in miles per gallon:");
    double fuelEfficiency = input.nextDouble();
    
    System.out.println("Enter price per gallon:");
    double pricePerGallon = input.nextDouble();

    double costOfDriving = drivingDistance / fuelEfficiency * pricePerGallon;

    System.out.println("The cost of driving is: " + costOfDriving + "$");





  }  
}
