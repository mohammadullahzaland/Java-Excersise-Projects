/* 
  3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip
  of a coin results in heads or tails. The program randomly generates an integer
  0 or 1, which represents head or tail. The program prompts the user to enter a
  guess, and reports whether the guess is correct or incorrect.
*/
import java.util.Scanner;
public class C03E14_HeadsOrTails
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number (0 (head) or 1 (tail))");
    int guess = input.nextInt();

    int rN = (int)Math.random()*2;

    if (guess == rN)
    {
      System.out.println("right guess!");
    }
    else
    {
      System.out.println("ops, you are wrong!");
    }
  }
}
