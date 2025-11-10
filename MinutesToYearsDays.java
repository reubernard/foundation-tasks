import java.util.Scanner;
public class MinutesToYearsDays {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int days = 0;        


        int minutes = input.nextInt();
        int years = minutes / 525600;
        if(years * 525600 < minutes){
        int remains = minutes - years * 525600;
        days = remains/1440;        

        System.out.println("For your input " + minutes + " we have aproximately "+ years + " number of years " + days + " number of days");

        }
     
    }
}
