import java.util.Scanner;
public class C02E14_BMI
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Inter your hight in m!");
    double hight = input.nextDouble();
    
    System.out.println("Inter your weight in kg!");
    double weight = input.nextDouble();
    
    double BMI = (weight/(hight*hight));
    
    if (BMI < 18.5)
    System.out.println("you are under weight");

    else if (BMI <= 18.5 && BMI<25)
    System.out.println(" you are normal");

    else if (BMI <= 25 && BMI<30)
    System.out.println(" you are overweight");

    else if (BMI<=30)
    System.out.println(" you are obese");
    else
    System.out.println("        ");
      
  }
}