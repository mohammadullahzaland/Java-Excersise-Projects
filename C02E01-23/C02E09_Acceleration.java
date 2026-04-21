/*(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:
a =
v1 - v0
t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. Here is a sample run:
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889*/

import java.util.Scanner;

public class C02E09_Acceleration
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter v0 (starting velocity):");
    double v0 = input.nextDouble();

    System.out.println("Enter v1 (ending velocity):");
    double v1 = input.nextDouble();


    System.out.println("Enter t(time span in seconds):");
    double t = input.nextDouble();


    double a = (v1-v0)/t ;
    System.out.println(a);
  }
}