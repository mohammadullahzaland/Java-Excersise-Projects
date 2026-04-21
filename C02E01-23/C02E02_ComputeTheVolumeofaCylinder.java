/*2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * π
volume = area * length
Here is a sample run:
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4*/

import java.util.Scanner;
public class C02E02_ComputeTheVolumeofaCylinder
{
  public static void main(String[] args)
  {
    System.out.println("Enter the raduis of the cylinder");
    Scanner input = new Scanner(System.in);
    double raduis = input.nextDouble();

    System.out.println("Enter the length of the cylinder");
    double length = input.nextDouble();

    double area = raduis * raduis * (Math.PI);

    double volume = area * length;

    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }
}