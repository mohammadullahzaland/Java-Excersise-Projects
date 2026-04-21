/* 
  3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
  integer. The program prompts the user to enter a three-digit integer and
  determines whether the user wins according to the following rules:
  1. If the user input matches the lottery number in the exact order, the award is
  $10,000.
  2. If all digits in the user input match all digits in the lottery number, the award
  is $3,000.
  3. If one digit in the user input matches a digit in the lottery number, the award
  is $1,000.
*/
import java.util.Scanner;
public class C03E15_Lottery
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a three-digit integer to check if it Maches!");
    int number = input.nextInt();

    if ( 100 <= number && number <=999 )
    {
      int gN = (int)(Math.random()*1000);
      System.out.println("the lottersy number is " + gN + " and your input was " + number);

      int gd1 = gN / 100;
      int gd2 = (gN/10)%10;
      int gd3 = gN % 10;

      int nd1 = number / 100;
      int nd2 = (number/10)%10;
      int nd3 = number % 10;

      if (nd1 == gd1 && nd2 == gd2 && nd3 == gd3) // or we can say if number==gn
      {
        System.out.println("Exact match! You win $10,000!");
      }

      else if ((nd1 == gd1 || nd1 == gd2 || nd1 == gd3) && (nd2 == gd2 || nd2 == gd1 || nd2 == gd3) && (nd3 == gd3 || nd3 == gd1 || nd3 == gd2))
      {
        System.out.println("All digits match! You win $3,000!");
      }

      else if ((nd1 == gd1 || nd1 == gd2 || nd1 == gd3) || (nd2 == gd2 || nd2 == gd1 || nd2 == gd3) || (nd3 == gd3 || nd3 == gd1 || nd3 == gd2))
      {
        System.out.println("One digit matches. You win $1,000!");
      }

      else {
        System.out.println("No match. Try again!");
      }
    }

    else
    {
      System.out.println("You Interd the wrong number please add a three digit number!");
    }
  }
}
