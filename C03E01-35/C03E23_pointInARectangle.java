/* 
3.23 (Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.) Here are two sample runs:
Figure 3.7 (a) Points inside and outside of the circle. (b) Points inside and outside of the
rectangle.
Enter a point with two coordinates: −4.9 2.49
Point (−4.9, 2.49) is in the rectangle
Enter a point with two coordinates: −5.1 −2.4
Point (−5.1, −2.4) is not in the rectangle
*/
import java.util.Scanner;
public class C03E23_pointInARectangle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a point with two coordinates:");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    System.out.println("Enter the middle of the rectangle:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();


    System.out.println("Enter the width and height of the rectangle:");
    double w = input.nextDouble();
    double h = input.nextDouble();

    double d = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2));
    System.out.println(" d= " + d + "and w= " + w + "and h = " + h);


    if ( d < h && d < (w/2))
    {
      System.out.println("The point is inside the rectangle");  
    }

    else if ( d > h && d > (w/2))
    {
      System.out.println("The point is outside of the rectingle");
    }

    else
    {
      System.out.println("The point is at the premieter of the rectingle");
    }
  }
}
