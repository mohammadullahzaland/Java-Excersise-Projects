/* 
  3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor–
  rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
  a paper can wrap a rock.) The program randomly generates a number 0, 1, or
  2 representing scissor, rock, and paper. The program prompts the user to enter
  a number 0, 1, or 2 and displays a message indicating whether the user or the
  computer wins, loses, or draws. Here are sample runs:
  scissor (0), rock (1), paper (2): 1
  The computer is scissor. You are rock. You won
  scissor (0), rock (1), paper (2): 2
  The computer is paper. You are paper too. It is a draw
*/

import java.util.Scanner;
public class C03E17_GameScissorRockPaper
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("scissor (0), rock (1), paper (2)");
    int p1 = input.nextInt();

    // int rock = 0;
    // int paper = 1;
    // int scissor = 2;
    
    int p2 = (int)(Math.random()*2);
    // System.out.println("Player2 "+p2);

    if (p1 == 0 && p2 == 0)
    {
      System.out.println("The computer is rock. You are rock too. It is a draw");
    }
    if (p1 == 1 && p2 == 1)
    {
      System.out.println("The computer is paper. You are paper too. It is a draw");
    }
    if (p1 == 2 && p2 == 2)
    {
      System.out.println("The computer is scissor. You are scissor too. It is a draw");
    }
    else if (p1 == 0 && p2 == 1)
    {
      System.out.println("The computer is paper. You are rock.You won!");
    }
    else if (p1 == 0 && p2 == 2)
    {
      System.out.println("The computer is scissor. You are rock.You lose!");
    }
    else if (p1 == 1 && p2 == 0)
    {
      System.out.println("The computer is rock. You are paper.You lose!");
    }
    else if (p1 == 0 && p2 == 2)
    {
      System.out.println("The computer is scissor. You are rock.You won!");
    }
    else if (p1 == 2 && p2 == 0)
    {
      System.out.println("The computer is rock. You are scissor.You won!");
    }
    else if (p1 == 2 && p2 == 1)
    {
      System.out.println("The computer is paper. You are scissor too.You won!");
    }
    else
    {
      System.out.println("Wrong input please input o ,1 or 2 scissor (0), rock (1), paper (2)!");
    }

    
  }
}
