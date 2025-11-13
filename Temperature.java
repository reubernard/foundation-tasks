import java.util.Scanner;
public class Temperature{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

    System.out.println("Enter today's Temperature: ");
    int age = input.nextInt();
    
    if (age < 15){
    System.out.print("The temperature is COLD");
    }
    
    if (age = 15 && age <=30){
    System.out.print("The temperature is WARM");
    }

    if (age > 30){
    System.out.print("The temperature is HOT")
    }


}
}
