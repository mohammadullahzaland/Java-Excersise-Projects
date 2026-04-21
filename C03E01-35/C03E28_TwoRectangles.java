/* 
3.28 (Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as
shown in Figure 3.9. Test your program to cover all cases.

Here are the sample runs:
Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43
Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3

r2 is inside r1
Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5
Enter r2’s center x-, y-coordinates, width, and height: 3 4 4.5 5

r2 overlaps r1
Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 3
Enter r2’s center x-, y-coordinates, width, and height: 40 45 3 2
r2 does not overlap r1
*/

/* 
There is just one small problem with the overlapping that is does
not specify which rectangle overlaps which rectangle
*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class C03E28_TwoRectangles
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the center (x,y) coordinate sof rectangle 1");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    System.out.println("Enter the width and height of the rectangle 1:");
    double w1 = input.nextDouble();
    double h1 = input.nextDouble();

    System.out.println("Enter the center (x,y) coordinates of rectangle 2");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();


    System.out.println("Enter the width and height of the rectangle 2:");
    double w2 = input.nextDouble();
    double h2 = input.nextDouble();

    double d = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2));
    // System.out.println(" d= " + d + "and w= " + w + "and h = " + h);


    if ( d > (h1+h2) && d > (w1+w2))
    {
      System.out.println("not overlaping");  
    }

    else if (d < (h1+h2) && d < (w1+w2))
    {
      if (h1 > h2 && w1 > w2)
      {
      System.out.println("Rectangle 2 is inside restangle 1");
      }
      else if (h1 < h2 && w1 < w2)
      {
      System.out.println("Rectangle 1 is inside restangle 2");
      }
      /* 
      else if (h1 > h2 || w1 > w2)
      {
      System.out.println("Rectangle 2 is overlaping restangle 1");
      }
      else if (h1 < h2 || w1 < w2)
      {
      System.out.println("Rectangle 1 is overlaping restangle 2");
      }
      */
      else 
      {
        System.out.println("Overlaping");
      }
    }
    // د مماس حالت
    else 
    {
      System.out.println("toucing eachother");
    }
  }
}
