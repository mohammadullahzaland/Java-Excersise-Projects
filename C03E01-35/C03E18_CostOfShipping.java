/* 
  3.18 (Cost of shipping) A shipping company uses the following function to calculate
  the cost (in dollars) of shipping based on the weight of the package (in pounds).
  c(w) = d
  3.5, if 0 6 w 6 = 1
  5.5, if 1 6 w 6 = 3
  8.5, if 3 6 w 6 = 10
  10.5, if 10 6 w 6 = 20
  Write a program that prompts the user to enter the weight of the package and
  displays the shipping cost. If the weight is negative or zero, display a message
  “Invalid input.” If the weight is greater than 20, display a message “The package
  cannot be shipped.”
*/

import java.util.Scanner;
public class C03E18_CostOfShipping
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the weight of the package(in pounds)!");
    double w = input.nextDouble();

    String c1 = "3.5 $";
    String c2 = "5.5 $";
    String c3 = "8.5 $";
    String c4 = "10.5 $";

    
    if (w > 0 && w <= 1 )
    {
      System.out.println("The shipping cost is: " + c1);
    }
    else if (w > 1 && w <= 3 )
    {
      System.out.println("The shipping cost is: " + c2);
    }
    else if (w > 3 && w <= 10 )
    {
      System.out.println("The shipping cost is: " + c3);
    }
    else if (w > 10 && w <= 20 )
    {
      System.out.println("The shipping cost is: " + c4);
    }
    else 
    {
      System.out.println("The package cannot be shipped.");
    }
    
  }
}
