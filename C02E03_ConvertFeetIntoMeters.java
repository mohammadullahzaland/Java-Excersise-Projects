/*(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters*/

import java.util.Scanner;
public class C02E03_ConvertFeetIntoMeters
{
  public static void main(String[] args)
  {
    System.out.println("Enter the amount of ft you want to convert it to meters");
    Scanner input = new Scanner(System.in);
    double ft = input.nextDouble();

    double result = ft * 0.305;

    System.out.println( ft + " feet is " + result + " meters");
  }
}
