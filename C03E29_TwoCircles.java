/* 
  3.29 (Geometry: two circles) Write a program that prompts the user to enter the center
  coordinates and radii of two circles and determines whether the second circle
  is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2
  is inside circle1 if the distance between the two centers 6 = r1 − r2
  and circle2 overlaps circle1 if the distance between the two centers 6 =
  r1 + r2. Test your program to cover all cases.)
  Here are the sample runs:
  Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13
  Enter circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5
  circle2 is inside circle1

  Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.7 5.5
  Enter circle2’s center x-, y-coordinates, and radius: 6.7 3.5 3
  circle2 overlaps circle1

  Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.5 1
  Enter circle2’s center x-, y-coordinates, and radius: 5.5 7.2 1
  circle2 does not overlap circle1
*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class C03E29_TwoCircles
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the center (x,y) coordinates of circle 1 as well as the radius:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double r1 = input.nextDouble();


    System.out.println("Enter the center (x,y) coordinates of circle 2 as well as the radius:");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double r2 = input.nextDouble();



    double d = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2));
    // System.out.println(" d= " + d + "and w= " + w + "and h = " + h);


    if ( d > (r1+r2) )
    {
      System.out.println("not overlaping");  
    }

    else if (d < (r1+r2))
    {
      if (r1 > r2 )
      {
        if ( r1-r2 > d)
        {
          System.out.println("Circle 2 is inside restangle 1");
        }
      }
      else if (r1 < r2 )
      {
        if ( r2-r1 > d)
        {
          System.out.println("Circle 1 is inside restangle 2");
        }
      }
      if (r1 > r2 )
      {
        if ( r1-r2 < d)
        {
          System.out.println("Circle 2 is overlaping restangle 1");
        }
      }
      else if (r1 < r2 )
      {
        if ( r2-r1 < d)
        {
          System.out.println("Circle 1 is overlaping restangle 2");
        }
      }
      else 
      {
        System.out.println("Overlaping");
      }
    }
    // د مماس حالت
    else 
    {
      System.out.println("touching eachother!");
    }
  }
}
