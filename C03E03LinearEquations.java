/*
  1.13 (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the
  following 2 * 2 system of linear equation provided that ad – bc is not 0:
  ax + by = e
  cx + dy = f
  x =
  ed - bf
  ad - bc
  y =
  af - ec
  ad - bc
  Write a program that solves the following equation and displays the value for x and
  y: (Hint: replace the symbols in the formula with numbers to compute x and y. This
  exercise can be done in Chapter 1 without using materials in later chapters.)
  3.4x + 50.2y = 44.5
  2.1x + .55y = 5.9

  3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
  Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
  the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
  that “The equation has no solution.”
  Enter a, b, c, d, e, f: 9.0 4.0 3.0 −5.0 −6.0 −21.0
  x is −2.0 and y is 3.0
  Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
  The equation has no solution
*/

import java.util.Scanner;
public class C03E03LinearEquations
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter a, b, c, d, e, f sperated by spaces");

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();


    double dominator = a * d - b * c;

    if (dominator == 0)
    {
      System.out.println("The equation has no uniqe slution");
    }

    else 
    {
      double x = ( e * d - b * f ) / dominator;
      double y = ( a * f - e * c ) / dominator;

      System.out.println(" x= " + x);
      System.out.println(" y= " + y);

    }

  }
}
