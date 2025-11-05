/*
  3.5 (Find future dates) Write a program that prompts the user to enter an integer for
  today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
  prompt the user to enter the number of days after today for a future day and display
  the future day of the week. Here is a sample run:
  Enter today’s day: 1
  Enter the number of days elapsed since today: 3
  Today is Monday and the future day is Thursday
  Enter today’s day: 0
  Enter the number of days elapsed since today: 31
  Today is Sunday and the future day is Wednesday
*/
import java.util.Scanner;
public class C03E05_FindFutureDates
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter today’s day ( 0 - 6 ):");
    int today = input.nextInt();

    System.out.println("Enter the number of days after today:");
    int daysAfter = input.nextInt();

    int futureDay = (today + daysAfter) % 7;

    String todayName = "";
    String futureName = "";
    switch (today)
    {
      case 0: todayName = "Sunday";
      break;
      case 1: todayName = "Monday";
      break;
      case 2: todayName = "Thuesday";
      break;
      case 3: todayName = "Wednesday";
      break;
      case 4: todayName = "Thursday";
      break;
      case 5: todayName = "Fridayday";
      break;
      case 6: todayName = "Saturday";
      break;
      default: todayName = "invalid day";
    }

    switch (futureDay)
    {
      case 0: futureName = "Sunday";
      break;
      case 1: futureName = "Monday";
      break;
      case 2: futureName = "Thuesday";
      break;
      case 3: futureName = "Wednesday";
      break;
      case 4: futureName = "Thursday";
      break;
      case 5: futureName = "Fridayday";
      break;
      case 6: futureName = "Saturday";
      break;
      default: futureName = "invalid day";
    }

    System.out.println("Today is " + todayName + " and the future day " + futureName );
  }
}
