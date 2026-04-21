/*2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = v2 / 2a
Write a program that prompts the user to enter v in meters/second (m/s) and
the acceleration a in meters/second squared (m/s2), then, displays the minimum
runway length.
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286*/

import java.util.Scanner;
public class C02E12_findingRunwayLength
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
   
  System.out.println("Enter speed in meter per second:");
    double speed = input.nextDouble();

    System.out.println("Enter acceleration meters/second squared (m/s2):");
    double a = input.nextDouble();

    double mrl = (Math.pow(speed, 2)) / ( 2 * a);

    System.out.println("The minimum runway length is: " + mrl);
  }  
}
