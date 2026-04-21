/*
    2.21 (Financial application: calculate future investment value) Write a program that
    reads in investment amount, annual interest rate, and number of years and displays
    the future investment value using the following formula:
    futureInvestmentValue =
    investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
    For example, if you enter amount 1000, annual interest rate 3.25%, and number
    of years 1, the future investment value is 1032.98.
    Here is a sample run:
    Enter investment amount: 1000.56
    Enter annual interest rate in percentage: 4.25
    Enter number of years: 1
    Future value is $1043.92
*/
import java.util.Scanner;
public class C02E21_CalculateFutureInvestmentValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the investment amount:");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter the monthly interest rate:");
        double monthlyInterestRate = input.nextDouble();

        System.out.println("Enter the number of years:");
        int numberOfYears = input.nextInt();

        double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), numberOfYears*12));

        System.out.print(futureInvestmentValue);
        
    }
    
}
