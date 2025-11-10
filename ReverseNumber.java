import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        int number = input.nextInt();

        int reversed = 0;

        int digit1 = number % 10;
        number = number / 10;         

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        int digit4 = number % 10;

        reversed = (digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4;

        System.out.println("Reversed number is: " + reversed);

        input.close();

}
}
