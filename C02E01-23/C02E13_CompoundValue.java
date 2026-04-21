/*2.13 (Financial application: compound value) Suppose you save $100 each month into
a savings account with an annual interest rate of 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays
the account value after the sixth month. (In Programming Exercise 5.30, you
will use a loop to simplify the code and display the account value for any month.)
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81*/

import java.util.Scanner;
public class C02E13_CompoundValue
{
public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the monthly saving amount:");
    int msa = input.nextInt(); // msa stands for monthly saving amount

    double mir = 0.00417; // monthly interrest rate

    double ti1 = msa * (1 + mir );
    double ti2 = (msa+ ti1) * (1 + mir );
    double ti3 = (msa+ ti2) * (1 + mir );
    double ti4 = (msa+ ti3) * (1 + mir );
    double ti5 = (msa+ ti4) * (1 + mir );
    double ti6 = (msa+ ti5) * (1 + mir );

    System.out.println(ti6);



  }  
}
