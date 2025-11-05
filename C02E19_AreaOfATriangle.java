/*
  2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter
  three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
  its area. The formula for computing the area of a triangle is
  s = (side1 + side2 + side3)/2;
  area = 2s(s - side1)(s - side2)(s - side3)
  Here is a sample run:
  Enter the coordinates of three points separated by spaces
  like x1 y1 x2 y2 x3 y3: 1.5 -3.4 4.6 5 9.5 -3.4
  The area of the triangle is 33.6
*/
import java.util.Scanner;
public class C02E19_AreaOfATriangle
{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter X1");
    double x1 = input.nextDouble();
    System.out.println("Enter Y1");
    double y1 = input.nextDouble();

    System.out.println("Enter X2");
    double x2 = input.nextDouble();
    System.out.println("Enter Y2");
    double y2 = input.nextDouble();

    System.out.println("Enter X3");
    double x3 = input.nextDouble();
    System.out.println("Enter Y3");
    double y3 = input.nextDouble();

    double side1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2));
    double side3 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));

    double s = (side1 + side2 + side3) /2 ;

    double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));

    System.out.println("The area of the triangle is " + area);
     
  }
}
