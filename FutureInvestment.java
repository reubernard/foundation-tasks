import java.util.Scanner;
public class FutureInvestment{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualPercent = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyRate = annualPercent / 1200.0;

	//Formula:
	//Future Value=P×(1+r)^n
	//P = initial amount (principal)
	//r = interest rate per compounding period (as a decimal)
	//n = total number of compounding periods

        double futureValue = amount * Math.pow(1 + monthlyRate, years * 12);

        System.out.println("Future value is: " + futureValue);
    }
}