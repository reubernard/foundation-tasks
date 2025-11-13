import java.util.Scanner;
public class MidPoint{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

        System.out.print("Enter first number, second number, third number, and forth number: ");
        double xAxis1 = input.nextDouble();
        double yAxis1 = input.nextDouble();
        double xAxis2 = input.nextDouble();
        double yAxis2 = input.nextDouble();

        double midX = (xAxis1 + xAxis2) / 2;
        double midY = (yAxis1 + yAxis2) / 2;

        System.out.println("Midpoint is (" + midX + ", " + midY + ")");

        if (midX == 0 && midY == 0)
            System.out.println("Midpoint lies at the origin");
        else if (midX == 0)
            System.out.println("Midpoint lies on Y-axis");
        else if (midY == 0)
            System.out.println("Midpoint lies on X-axis");
}
}
}


