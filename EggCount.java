import java.util.Scanner;
public class EggCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        System.out.print("How many eggs do you have? ");
        int eggs = input.nextInt();

        if (eggs > 500) {
        int gross = eggs / 144;
        int remAfterGross = eggs % 144;
        int dozen = remAfterGross / 12;
        int left = remAfterGross % 12;
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + left + " left over");
        } else {
        int dozen = eggs / 12;
        int left = eggs % 12;
        System.out.println("Your number of eggs is " + dozen + " dozen and " + left + " left over");
        }
}
}
