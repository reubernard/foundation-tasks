import java.util.Scanner;
public class CalcEnergy{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    System.out.print("Enter the amount of water in kilogram: ");
    double waterKg = input.nextDouble();

    System.out.print("Enter initial water temperature in degree celcious: ");
    double temp1 = input.nextDouble();

    System.out.print("Enter final water temperature in degree celcious: ");
    double temp2 = input.nextDouble();

    double energy = waterKg * (temp2 - temp1) * 4184;


    System.out.println("The energy needed is: " + energy);

     
    }
}
