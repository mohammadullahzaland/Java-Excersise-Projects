/* 
  3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
  consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
  which is calculated from the other 9 digits using the following formula:
  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
  d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
  If the checksum is 10, the last digit is denoted as X according to the ISBN-10
  convention. Write a program that prompts the user to enter the first 9 digits and
  displays the 10-digit ISBN (including leading zeros). Your program should read
  the input as an integer. Here are sample runs:
  VideoNote
  Sort three integers
  Enter the first 9 digits of an ISBN as integer: 013601267
  The ISBN-10 number is 0136012671
  Enter the first 9 digits of an ISBN as integer: 013031997
  The ISBN-10 number is 013031997X
*/

import java.util.Scanner;
public class C03E09_CheckISBN10
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first 9 digits of an ISBN as integer:");
    int NineInts = input.nextInt();

    int d1 = (NineInts/100000000)%10;
    int d2 = (NineInts/10000000)%10;
    int d3 = (NineInts/1000000)%10;
    int d4 = (NineInts/100000)%10;
    int d5 = (NineInts/10000)%10;
    int d6 = (NineInts/1000)%10;
    int d7 = (NineInts/100)%10;
    int d8 = (NineInts/10)%10;
    int d9 = (NineInts/1)%10;

    int Checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;

    // The rest of the code is written by the help of ChatGPT 
    // Determine last digit as string
    String ld;
    if (Checksum == 10)
      ld = "X";
    else
      ld = Integer.toString(Checksum);

    // Print the full ISBN-10
    System.out.println("The ISBN-10 number is " 
      + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + ld);

  }
}

    // System.out.println(d1);
    // System.out.println(d2);
    // System.out.println(d3);
    // System.out.println(d4);
    // System.out.println(d5);
    // System.out.println(d6);
    // System.out.println(d7);
    // System.out.println(d8);
    // System.out.println(d9);