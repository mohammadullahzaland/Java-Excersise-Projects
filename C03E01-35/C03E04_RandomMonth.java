/*
    3.4 (Random month) Write a program that randomly generates an integer between 1
    and 12 and displays the English month names January, February, . . . , December
    for the numbers 1, 2, . . . , 12, accordingly.
 */

public class C03E04_RandomMonth
{
  public static void main(String[] args)
  {
    int randomNumber = (int)(Math.random() * 7) +1;

    if (randomNumber == 1)
    {
      System.out.println("Today Might be Saturday");
    }

    else if (randomNumber == 1)
    {
      System.out.println("Today Might be Saturday");
    }

    else if (randomNumber == 2)
    {
      System.out.println("Today Might be Sunday");
    }

    else if (randomNumber == 3)
    {
      System.out.println("Today Might be Monday");
    }

    else if (randomNumber == 4)
    {
      System.out.println("Today Might be Tuesday");
    }

    else if (randomNumber == 5)
    {
      System.out.println("Today Might be Wednesday");
    }

    else if (randomNumber == 6)
    {
      System.out.println("Today Might be Thursday");
    }

    else if (randomNumber == 7)
    {
      System.out.println("Today Might be Friday");
    }
    else
    {
      System.out.println("Error");
    }
  }
}
