/* 
  3.11 (Find the number of days in a month) Write a program that prompts the user
  to enter the month and year and displays the number of days in the month. For
  example, if the user entered month 2 and year 2012, the program should display
  that February 2012 has 29 days. If the user entered month 3 and year 2015, the
  program should display that March 2015 has 31 days.
*/

import java.util.Scanner;
public class C03E11_FindTheNumberOfDaysInaMonth
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the month and the year (mm yyyy");
    int mm = input.nextInt();
    int yyyy = input.nextInt();
    int dM;

    if (mm == 1)
    {
      dM = 31;
      System.out.println("the January "+ yyyy + " has " + dM + " days." );
    }
    else if (mm == 2)
    {
      dM = 29;
      System.out.println("the February "+ yyyy + " has " + dM + " days." );

    }
    else if (mm == 3)
    {
      dM = 31;
      System.out.println("the March "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 4)
    {
      dM = 30;
      System.out.println("the April "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 5)
    {
      dM = 31;
      System.out.println("the May "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 6)
    {
      dM = 30;
      System.out.println("the June "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 7)
    {
      dM = 31;
      System.out.println("the July "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 8)
    {
      dM = 31;
      System.out.println("the Augest "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 9)
    {
      dM = 30;
      System.out.println("the Sptember "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 10)
    {
      dM = 31;
      System.out.println("the October "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 11)
    {
      dM = 30;
      System.out.println("the November "+ yyyy + " has " + dM + " days." );

    }    else if (mm == 12)
    {
      dM = 31;
      System.out.println("the Decmber "+ yyyy + " has " + dM + " days." );

    }


  }
}
