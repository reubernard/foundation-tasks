import java.util.Scanner;
public class CostOfDriving{
public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double kilogramPerPound = 0.45359237;

        double metersPerInch = 0.0254;

        System.out.print("Enter your weight in pounds: "); 
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        
        double weightInKilogram = weight * kilogramPerPound;
        double heightInMeter = height * metersPerInch;

        double bMi = weightInKilogram / (heightInMeter * heightInMeter);

        System.out.printf("Your Body Mass Index is: %.4f \n", bMi);
        
     
}
}
