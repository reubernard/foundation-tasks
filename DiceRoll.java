import java.util.Scanner;
public class DiceRoll{
public static void main(String[]args){
Scanner input = new Scanner (System.in);

    System.out.println("pick a number from 1 t0 6 to roll the dice");
    int firstDice = input.nextInt();

    System.out.println("pick another number from 1 t0 6 to roll the  second dice");
    int secondDice = input.nextInt();

   int add = firstDice + secondDice;
    System.out.printf("Your total roll is : %d \n", add);
}
}
