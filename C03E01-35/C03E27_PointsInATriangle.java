/* 
3.27 (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:

Enter a point’s x- and y-coordinates: 100.5 25.5
The point is in the triangle

Enter a point’s x- and y-coordinates: 100.5 50.5
The point is not in the triangle
*/

// needs more work not completed
import java.util.Scanner;
public class C03E27_PointsInATriangle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a point’s x and y-coordinates:");
    double x = input.nextDouble();
    double y = input.nextDouble();


    if (x > 0 && x < 200 && y > 0 && y < 100)
    {
     System.out.println("The point (" + x + "," + y + ") in the triangle");
    }
    else
    {
     System.out.println("The point (" + x + "," + y + ") is not in  the triangle");
    }
  }
}
