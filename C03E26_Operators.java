/* 
  3.26 (Use the &&, ||, and ^ operators) Write a program that prompts the user to
  enter an integer and determines whether it is divisible by 5 and 6, whether it is
  divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a
  sample run of this program:
  Enter an integer: 10
  Is 10 divisible by 5 and 6? false
  Is 10 divisible by 5 or 6? true
  Is 10 divisible by 5 or 6, but not both? true
*/


// This program is not exactly what is wanted in the quistion there is a smal problem needs to be fixed
import java.util.Scanner;
public class C03E26_Operators
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an Integer:");
    int number = input.nextInt();

    if (number % 5 == 0 && number % 6 == 0)
    {
      System.out.println("The number " + number + " is divisable by 5 and 6");
    }
    else if (number % 5 == 0 || number % 6 == 0)
    {
      System.out.println("The number " + number + " is divisable by 5 or 6");
    }
    else if (number % 5 == 0 || number % 6 == 0 && (number % 5 != 0 && number % 6 != 0))
    {
      System.out.println("The number " + number + " is divisable by 5 or 6 but not both");
    }
    else
    {
      System.out.println("The number is divisable by none of them");
    }

  }
}
