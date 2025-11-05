/*
  1.11 (Population projection) The U.S. Census Bureau projects population based on
  the following assumptions:
  ■■ One birth every 7 seconds
  ■■ One death every 13 seconds
  ■■ One new immigrant every 45 seconds
  Write a program to display the population for each of the next five years. Assume
  that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
  if two integers perform division, the result is an integer. The fractional part is truncated.
  For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
  result with the fractional part, one of the values involved in the division must be
  a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/

/*
  2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
  to enter the number of years and display the population after the number of years.
  Use the hint in Programming Exercise 1.11 for this program. Here is a sample
  run of the program:
  Enter the number of years: 5
  The population in 5 years is 325932969
*/
public class C02E11_USPopulationInNextFiveYears { 
  public static void main(String[] args) {
    // Initial population
    long currentPopulation = 312032486;

    // Number of seconds in one year
    int secondsInYear = 365 * 24 * 60 * 60;

    // Births, deaths, and immigrants per year
    long oneChildBornEvery7Sec = secondsInYear / 7;
    long onePersonDiedEvery13Sec = secondsInYear / 13;
    long onePersonMigrateEvery45Sec = secondsInYear / 45;

    // Net population growth per year
    long netPopulationPerYear = oneChildBornEvery7Sec 
                              + onePersonMigrateEvery45Sec 
                              - onePersonDiedEvery13Sec;

    // Display results for 5 years
    for (int year = 1; year <= 5; year++) {
      currentPopulation += netPopulationPerYear; // ADD the epopulation for every year
      System.out.printf("Year %d: %,d%n", year, currentPopulation);
    } 
  }
}
