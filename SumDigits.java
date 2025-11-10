import java.util.Scanner;
public class SumDigits {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int n = input.nextInt();
        if (n < 0 || n > 1000) {
            System.out.println("Number out of range.");
        } 
        else {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
            }
            System.out.println("The sum of the digits is " + sum);
        }
        sc.close();
    }
}
