import java.util.Scanner;
public class SampleUser{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

    String username = "berny";
    int pincode = 123456;
    
    System.out.println("Enter your username my chief': ");
    String userName = input.nextLine();

    System.out.println("Enter your pin code: ");
    int pinCode = input.nextInt();

    if (userName .equals(username) && pinCode == pincode){
    System.out.println("Login Successful");
    }
    else{
    System.out.println("Login Failed");
    }
    
    

}
}
