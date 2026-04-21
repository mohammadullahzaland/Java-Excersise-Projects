/* 
  3.19 (Compute the perimeter of a triangle) Write a program that reads three edges for
  a triangle and computes the perimeter if the input is valid. Otherwise, display
  that the input is invalid. The input is valid if the sum of every pair of two edges is
  greater than the remaining edge.
*/
import java.util.Scanner;
public class C03E19_perimeterOfATriangle
{
  public static void main(String[] args)
  {
    //  this program shows the preimeter of a rectangle
    Scanner input = new Scanner(System.in);

    System.out.println("Enter X1 , Y1");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    System.out.println("Enter X2 , Y2");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    System.out.println("Enter X3 , Y3");
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    double a = Math.sqrt(Math.pow((x1 - x2) , 2)+ Math.pow((y1 - y2) , 2));
    double b = Math.sqrt(Math.pow((x1 - x3) , 2)+ Math.pow((y1 - y3) , 2));
    double c = Math.sqrt(Math.pow((x2 - x3) , 2)+ Math.pow((y2 - y3) , 2));

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);

    if ( (a + b) > c || (a + c) > b || (c + b) > a)
    {
    System.out.println("The premeter of the Tringle is: " + (a + b + c));
    }
    else
    {
      System.out.println("Invalid input!");
    }
  }
}
