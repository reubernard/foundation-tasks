import java.util.Scanner;
public class RunwayLength{
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double length;

        System.out.print("input the value of V (velocity in meter per second)"); 
        double velocity = input.nextDouble();

        System.out.print("Input the value of a (acceleration in meter per second squared)");
        double acceleration = input.nextDouble();
        

        length = (velocity * velocity) / (2 * acceleration);

        System.out.printf ("The average acceleration is %.4f", length);
        
     
    }
}
