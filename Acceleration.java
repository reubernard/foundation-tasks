import java.util.Scanner;
public class Acceleration {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double acceleration;
        System.out.print("input the value of V1(Ending Velocity))"); 
        double v1 = input.nextDouble();

        System.out.print("Input the value of V0(Starting Velocity)");
        double v0 = input.nextDouble();
        
        System.out.print("Input the (T)time span");
        double t = input.nextDouble();
          
        acceleration = (v1 - v0) / t;

        System.out.printf ("The average acceleration is %.4f", acceleration);
        
     
    }
}
