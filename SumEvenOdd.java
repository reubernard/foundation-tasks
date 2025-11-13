import java.util.Scanner;
public class SumEvenOdd{
pubic static void main(String[]args){
Scanner input = new Scanner (System.in);

    int sumEven = 0;
    int sumOdd = 0;

    System.out.print("Enter 5 integers you want to add: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();
    int num5 = input.nextInt();

    if(num1 % 2 == 0)
    sumEven += num1;
    else
    sumOdd += num1;

    if(num2 % 2 == 0)
    sumEven += num2;
    else
    sumOdd += num2;

    if(num3 % 2 == 0)
    sumEven += num3;
    else
    sumOdd += num1;

    if(num4 % 2 == 0)
    sumEven += num4;
    else
    sumOdd += num4;

    if(num5 % 2 == 0)
    sumEven += num5;
    else
    sumOdd += num5;

    System.out.print("The SUM of the Even numbers is: " + sumEven);

    System.out.print("The SUM of the Odd numbers is: " + sumOdd);

}
}
