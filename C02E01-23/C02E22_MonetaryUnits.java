/* 
    2.22 (Financial application: monetary units) Rewrite Listing 2.10,
    ComputeChange.java, to fix the possible loss of accuracy when converting
    a double value to an int value. Enter the input as an integer whose last
    two digits represent the cents. For example, the input 1156 represents 11
    dollars and 56 cents.
*/

    import java.util.Scanner;
    public class C02E22_MonetaryUnits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the input as an integer whose last two digits represent the cents");
        int insertAmount = input.nextInt();

        int totalDolors = insertAmount / 100;
        System.out.println(totalDolors);

        double totalCents = insertAmount % 100;
        System.out.println(totalCents);
         
    }
    
}
