/* 
  3.33 (Financial: compare costs) Suppose you shop for rice in two different packages. 
  You would like to write a program to compare the cost. The program prompts the 
  user to enter the weight and price of each package and displays the one with the 
  better price. Here is a sample run:
  Enter weight and price for package 1: 50 24.59 
  Enter weight and price for package 2: 25 11.99 
  Package 2 has a better price.

  Enter weight and price for package 1: 50 25 
  Enter weight and price for package 2: 25 12.5 
  Two packages have the same price.

*/
import java.util.Scanner;
public class C03E33_CompareCosts
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width of the first pakage and thier price");
    double w1 = input.nextDouble();
    double p1 = input.nextDouble();

    System.out.println("Enter the width of the second pakage and thier price");
    double w2 = input.nextDouble();
    double p2 = input.nextDouble();

    double pak1 = w1/p1;
    double pak2 = w2/p2;

    if (pak1>pak2)
    {
      System.out.println("the price of pak1 is " + pak1/pak2 + " times cheap");
    }
    else if (pak1<pak2)
    {
      System.out.println("the price of pak2 is " + pak2/pak1 + " times cheap");
    }
    else 
    {
      System.out.println("both have the smae price!");
    }




  }
}
