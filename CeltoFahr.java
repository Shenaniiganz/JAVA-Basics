import java.util.Scanner;

public class CeltoFahr {
    public static void main (String[] args) {

        double C, F;
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose type of conversion \n 1 - Fahrenheit to Celcius \n 2 - Celcius to Fahrenheit");
        choice = input.nextInt();

        switch(choice) {

            case 1: System.out.print("Enter Fahrenheit temperature: ");
                    F = input.nextDouble();
                    C = ((F - 32) * 5) / 9;
                    System.out.println("Temperature in Celcius is: " + C + " C");
            break;
            case 2: System.out.print("Enter Celcius temperature: ");
                    C = input.nextDouble();
                    F = (C * (9 / 5)) + 32;
                    System.out.println("Temperature in Fahrenheit: " + F + " F");
            break;

            default: System.out.println("Choose between 1 and 2");
        }

        

        input.close();
    }
}