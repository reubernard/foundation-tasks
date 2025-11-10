import java.util.Scanner;
public class Gratuity {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter a gratuity rate: ");
        double ratePercent = input.nextDouble();

        double gratuity = subtotal * (ratePercent / 100.0);
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is " + gratuity + " and total is $" + total);
}
}
