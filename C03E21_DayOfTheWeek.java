/* 
3.21 (Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian
Zeller to calculate the day of the week. The formula is

you can find the formula in the book

where
■■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, and 6: Friday).
■■ q is the day of the month.
■■ m is the month (3: March, 4: April, ..., 12: December). January and February
are counted as months 13 and 14 of the previous year.
■■ j is
year
100
.
■■ k is the year of the century (i.e., year % 100).
Note all divisions in this exercise perform an integer division. Write a program
that prompts the user to enter a year, month, and day of the month, and displays
the name of the day of the week. Here are some sample runs:
Enter year: (e.g., 2012): 2015
Enter month: 1−12: 1
Enter the day of the month: 1−31: 25
Day of the week is Sunday
Enter year: (e.g., 2012): 2012
Enter month: 1−12: 5
Enter the day of the month: 1−31: 12
Day of the week is Saturday
*/

// Needs debugging

import java.util.Scanner;
public class C03E21_DayOfTheWeek
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter the year (e.g., 2012):");
    int k = input.nextInt();

    System.out.println("Enter the month (1 - 12):");
    int m = input.nextInt();

    if ( m == 1 )
    {
      m = 13;
      k = k-1;
    }
    else if ( m == 2 )
    {
      m = 14;
      k = k-1;
    }
    else
    {
      m += m;
      k += k;
    }

    System.out.println("Enter the day (1 - 31)");
    int q = input.nextInt();

    int j = k / 100;

    int h = ( q + ( ( 26 * ( m + 1 ) ) / 10 ) + k + ( k / 4) + ( j / 4) + 5 * j )%7;

    System.out.println("Day of the week is " + h);

    switch (h)
    {
      case 0: System.out.println("Saturday"); break;
      case 1: System.out.println("Sunday"); break;
      case 2: System.out.println("Monday"); break;
      case 3: System.out.println("Tuesday"); break;
      case 4: System.out.println("Wednesday"); break;
      case 5: System.out.println("Thursday"); break;
      case 6: System.out.println("Friday"); break;
      default: System.out.println("Error: invalid status");
    //             System.exit(1);
    }
  }
}
