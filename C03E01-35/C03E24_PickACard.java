/* 
  3.24 (Game: pick a card) Write a program that simulates picking a card from a deck
  of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
  Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
  Here is a sample run of the program:
  The card you picked is Jack of Hearts
*/

import java.util.Scanner;
public class C03E24_PickACard
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter x1 , y1:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    System.out.println("Enter x2 , y2:");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    System.out.println("Enter x3 , y3:");
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    System.out.println("Enter x4 , y4:");
    double x4 = input.nextDouble();
    double y4 = input.nextDouble();

    // double ((y1 - y2)*x - (x1 - x2))y = ((y1 - y2)*x1 - (x1 - x2)*y1);
    // double ((y3 - y4)*x - (x3 - x4))y = ((y3 - y4)*x3 - (x3 - x4)*y3);

  }
}
