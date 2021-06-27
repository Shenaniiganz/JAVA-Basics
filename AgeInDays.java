import java.util.Scanner;

public class AgeInDays{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int ageInYears = input.nextInt();
        int ageInDays = ageInYears * 365;
        
        System.out.println("You are " + ageInDays + " days old!");
        
        input.close();
    }
}