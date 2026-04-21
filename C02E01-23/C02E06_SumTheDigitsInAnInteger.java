/*2.6 (Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27*/

import java.util.Scanner;
public class C02E06_SumTheDigitsInAnInteger
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter a number between 0 and 1000:");
    

    int num = input.nextInt();
    if(num > 1 && num<1000) 
    {
      int ones = num % 10;
      // System.out.println(ones);  just to seee the result while working on it

      int ex1 = num/10;

      int tens = ex1 % 10;
      // System.out.println(tens);  just to seee the result while working on it

      int ex2 = num/100;
      int hundreds = ex2 % 10;
      // System.out.println(hundreds); just to seee the result while working on it

      int sumofDigits = ones + tens + hundreds;
      System.out.println("The sum of the digits is " + sumofDigits);
    }

    else
    {
      System.out.println("Invalid Number , please enter a number betwen 1 and 1000");
    }

  }
}
