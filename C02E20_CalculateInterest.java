/*
    2.20 (Financial application: calculate interest) If you know the balance and the annual
    percentage interest rate, you can compute the interest on the next monthly
    payment using the following formula:
    interest = balance * (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate
    and displays the interest for the next month. Here is a sample run:
    Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
    The interest is 2.91667
*/
import java.util.Scanner;
public class C02E20_CalculateInterest {
    public static void main(String[] args) {
        // This program prints simple interest

        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance:");
        int balance = input.nextInt();

        System.out.println("interest rate:");
        double iRate= input.nextDouble();

        System.out.print("The interest is = " + (( balance * iRate)/1200));
        
    }
    
}
