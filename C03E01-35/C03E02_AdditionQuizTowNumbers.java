/* 
  3.2.1 (Game: add tow numbers) The program in Listing 3.1, AdditionQuiz.java, gen
  erates two integers and prompts the user to enter the sum of these two integers. 
  Revise the program to generate tow single-digit integers and prompt the user to 
  enter the sum of these tow integers.
*/
import java.util.Scanner;
public class C03E02_AdditionQuizTowNumbers
{
  public static void main(String[] args)
  {


    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);
    

    Scanner input = new Scanner (System.in);
    System.out.print("What is " + number1 + " + " + number2 + "? ");

    int answer = input.nextInt();

    System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
  }
}
