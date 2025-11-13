import java.util.Scanner;
public class VotingSystem{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

    System.out.println("Enter your Age: ");
    int age = input.nextInt();

    if (age >=18){
    System.out.print("You are Eligible to Vote");

}   else{
    System.out.print("You are not Eligible to Vote");
}

}
}
