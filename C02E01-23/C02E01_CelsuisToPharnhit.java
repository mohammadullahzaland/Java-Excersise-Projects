/*2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit, and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
Here is a sample run:
Enter a degree in Celsius: 43.5
43.5 Celsius is 110.3 Fahrenheit*/

import java.util.Scanner;
public class C02E01_CelsuisToPharnhit {
    public static void main(String[] args) {
        // This Program converts Celsuis to fharnhit
        System.out.println("input the Celsuis degree you want to convert it to Fhanhit");
        Scanner input = new Scanner(System.in);
        double C = input.nextDouble();
        System.out.println( C + " Degree Celsuis is equal to " + (9*C+160)/5 + " Fharnhit");
        
        
    }
    
}
