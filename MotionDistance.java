import java.util.Scanner;
public class MotionDistance {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	System.out.print("Enter initialVelocity, timeTaken, and acceleration: ");
        double u = input.nextDouble();
        double t = input.nextDouble();
        double a = input.nextDouble();

        double s = u * t + 0.5 * a * t * t;
        System.out.println("The distance covered is " + s);

}
}