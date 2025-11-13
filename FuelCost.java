import java.util.Scanner;
public class FuelCost {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Enter driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerG = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        if (distance > 0 && milesPerG > 0 && price > 0) {
            double cost = (distance / milesPerG) * price;
            System.out.println("The cost of driving is $" + cost);
        } else {
            System.out.println("Invalid input!");
        }

}
}

