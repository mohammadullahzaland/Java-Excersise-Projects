import java.util.Scanner;

/* 
  3.8 (Sort three integers) Write a program that prompts the user to enter three integers
  and display the integers in non-decreasing order.
*/

import java.util.Scanner;
public class C03E08_SortThreeIntegers
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);

    System.out.println("Enter three numbers seperated by spaces");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    if (a<b && a<c)
    {
      if (b<c)
      {
        System.out.println(a + " " + b + " " + c);
      }

      else
      {
        System.out.println(a + " " + c + " " + b);
      }
    }

    else if (b<a && b<c)
    {
      if (c<a)
      {
        System.out.println(b + " " + a + " " + c);
      }

      else
      {
        System.out.println(b + " " + c + " " + a);
      }
    }

    else if (c<a && c<b)
    {
      if (a<b)
      {
        System.out.println(c + " " + a + " " + b);
      }

      else
      {
        System.out.println(c + " " + b + " " + a);
      } 
    }

    else 
    {
      System.out.println("they are all equal");
    }
  }
}
