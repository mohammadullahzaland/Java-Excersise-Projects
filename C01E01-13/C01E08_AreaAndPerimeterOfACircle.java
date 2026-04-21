/*Write a program that displays the area and
perimeter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2*radius*pi
area = r^2*pi */
public class C01E08_AreaAndPerimeterOfACircle
{
    public static void main(String[] args)
    {
    double pi = 3.14;
    double radius = 5.6;
    double perimeter = 2*radius*pi;
    double area = radius*radius*pi;
    System.out.println("Area of the circle is: "+ area + "and perimeter of the circle is:" + perimeter);
    }  
}
