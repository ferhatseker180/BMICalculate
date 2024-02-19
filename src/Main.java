import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Define variable about BMI
        double height, weight, bmi;

        // Import Scanner and Take Some Information
        Scanner input = new Scanner(System.in);
        System.out.print("Please,Enter Your Height in Meters: ");
        height = input.nextDouble();
        System.out.print("Please Enter Your Weight in Kilogram:  ");
        weight = input.nextDouble();

        // Calculate BMI and Show Users
        bmi = weight / Math.pow(height,2);
        System.out.println("Your BMI: " + bmi);

    }
}