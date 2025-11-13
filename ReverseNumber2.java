import java.util.Scanner;
public class ReverseNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

        System.out.print("Enter a four digit number: ");
        int number = input.nextInt();

        if (number >= 1000 && number <= 9999) {
            int num1 = number % 10;
            int num2 = (number / 10) % 10;
            int num3 = (number / 100) % 10;
            int num4 = (number / 1000) % 10;

            int reversed = num1 * 1000 + num2 * 100 + num3 * 10 + num4;
            
            System.out.println("Reversed number is: " + reversed);
        } else {
            System.out.println("Please enter a valid 4-digit number!");
        }
}
}
