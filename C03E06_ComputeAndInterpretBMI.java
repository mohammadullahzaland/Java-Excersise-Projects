/* 
  3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
  let the user enter weight, feet, and inches. For example, if a person is 5 feet and
  10 inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
  Enter weight in pounds: 140
  Enter feet: 5
  Enter inches: 10
  BMI is 20.087702275404553
  Normal
*/
import java.util.Scanner;
public class C03E06_ComputeAndInterpretBMI
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Inter your hight in feet");
    double highinFeet = input.nextDouble();
    // double highinInches = input.nextDouble();

    System.out.println("Inter your hight in inches ");
    double highinInches = input.nextDouble();


    double hightinMeters = (highinFeet * 0.3040) + (highinInches * 0.0254);
    
    System.out.println("Inter your weight in Pound!");
    double weightinPound = input.nextDouble();
    double weightKg = weightinPound * 0.4535923696;
    

    double BMI = (weightKg/(Math.pow((hightinMeters), 2)));

    System.out.println("MBI is : " + BMI);
    
    if (BMI < 18.5)
    System.out.println("you are under weight");

    else if (BMI >= 18.5 && BMI<25)
    System.out.println(" you are normal");

    else if (BMI <= 25 && BMI<30)
    System.out.println(" you are overweight");

    else if (BMI<=30)
    System.out.println(" you are obese");
    else
    System.out.println("        ");
      
  }
}