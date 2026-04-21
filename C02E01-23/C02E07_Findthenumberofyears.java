/*2.7 (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and remaining
days for the minutes. For simplicity, assume that a year has 365 days. Here is
a sample run:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days*/

import java.util.Scanner;
public class C02E07_Findthenumberofyears
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of minutes:");
    long minutes = input.nextLong();

    long years = (minutes)/(60*24*365);
    System.out.println(years);

    long rminutes = (minutes)%(60*24*365);
    System.out.println(rminutes);

    long days = (rminutes)/(60*24);
    System.out.println(days);

    System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");
  }
}