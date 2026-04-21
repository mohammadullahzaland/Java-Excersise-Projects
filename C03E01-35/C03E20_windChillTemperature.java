/* 
  3.20 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
  compute the wind-chill temperature. The formula is valid for temperatures in the
  range between -58F and 41°F and wind speed greater than or equal to 2. Write
  a program that prompts the user to enter a temperature and a wind speed. The
  program displays the wind-chill temperature if the input is valid; otherwise, it displays
  a message indicating whether the temperature and/or wind speed is invalid.
*/
import java.util.Scanner;
public class C03E20_windChillTemperature
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    // Enter a temperature between -58°F and 41°F
    // The formula cannot be used for wind speeds below 2 mph

    System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
    double ta = input.nextDouble(); //ta (outside temperature)
    
    System.out.println("Enter the wind speed ( >= 2) in miles per hour:");
    double v = input.nextDouble(); //v (wind speed)
    if ((ta > -58 && ta < 41) && (v >= 2))
    {
    double twc = (35.74 + 0.6215*ta - 35.75*(Math.pow(v, 0.16))) + (0.4275*ta*(Math.pow(v, 0.16)));
    System.out.println("The wind chill index is: " + twc);
    }
    else
    {
      System.out.println("the temperature and/or wind speed is invalid.");
    }
  }
}
