/* 
  3.16 (Random point) Write a program that displays a random coordinate in a rectangle.
  The rectangle is centered at (0, 0) with width 100 and height 200.
*/

public class C03E16_RandomPoint
{
  public static void main(String[] args)
  {
    // height -100 __ +100
    // width -50 __ +50

    int gNx = (int)(Math.random()*100 -50);
    int gNy = (int)(Math.random()*200 -100);
    System.out.println("The cordinate is (" + gNx + " , " + gNy +")");
  }
}
