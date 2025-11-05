/* 
  3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit
  integer and determines whether it is a palindrome integer. An integer is palindrome
  if it reads the same from right to left and from left to right. A negative integer is
  treated the same as a positive integer. Here are sample runs of this program:
  Enter a three-digit integer: 121
  121 is a palindrome
  Enter a three-digit integer: 123
  123 is not a palindrome
*/
import java.util.Scanner;
public class C03E12_PalindromeInteger
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a three-digit integer to check if it is palindrome");
    int number = input.nextInt();

    if (( 100 <= number && number <=999 ) || ( -999 <= number && number <=-100 ))
    {
      int d1 = number / 100;
      int d3 = number % 10;

      if (d1 == d3)
      {
        System.out.println("The number " + number + " is palindrome");
      }

      else
      {
        System.out.println("The " + number + " is not palindrome");
      }
    }
    else
    {
      System.out.println("You Interd the wrong number please add a three digit number!");
    }
  }
}
