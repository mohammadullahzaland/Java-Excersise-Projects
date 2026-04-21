/* 
  3.22 (Geometry: point in a circle?) Write a program that prompts the user to enter a
  point (x, y) and checks whether the point is within the circle centered at (0, 0)
  with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
  circle, as shown in Figure 3.7a.
  (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
  The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your
  program to cover all cases.) Two sample runs are shown below:
  Enter a point with two coordinates: 4 5
  Point (4.0, 5.0) is in the circle
  Enter a point with two coordinates: 9 9
  Point (9.0, 9.0) is not in the circle
*/

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class C03E22_pointInACircle
{
  public static void main(String[] args)
  {
    //  this program shows if the point is inside or outside of the ciecle
    Scanner input = new Scanner(System.in);

    System.out.println("Enter X1 , Y1");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    // Circle
    double x2 = 0;
    double y2 = 0;

    double r = 10;

    double d = Math.sqrt(Math.pow((x1 - x2) , 2)+ Math.pow((y1 - y2) , 2));

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);

    if ( r > d)
    {
    System.out.println("The Point (" + x1 + "," + y1 + ") is inside the circle");
    }
    else if ( r < d)
    {
      System.out.println("The Point (" + x1 + "," + y1 + ") is outside the circle");
    }
    else
    {
      System.out.println("The point (" + x1 + "," + y1 + ") is on the premeiter of the circle");
    }
  }
}
