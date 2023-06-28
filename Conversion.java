import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        
        /*

        Task:
        Create a program where the user can input a number of inches and receive a conversion
        to miles, feet, kilometers, meters, centimeters, and millimeters.
        - Accept decimals and print out decimals
        - User-friendly with a description (in the output)

        Reference:
        1 mile = 5,280 ft = 1,760 yards = 1,609.34 m = 1.609 km
        1 ft = 12 inches = 0.305 m = 30.48 cm
        1 inch = 2.54 cm = 25.4 mm
        1 km = 1,000 m = 0.621 miles
        1 m = 39.37 inches = .3281 ft = 1.094 yards
        1 cm = 10 mm = 0.394 inches
        1 mm = 0.04 inches

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the best inches conversion calculator!");
        System.out.print("Please enter amount in inches: ");

        double inches = scanner.nextDouble();

        double millimeters = inches * 25.4;
        double centimeters = inches * 2.54;
        double meters = inches / 39.37;
        double kilometers = meters / 1000;
        double feet = inches / 12;
        double miles = feet / 5280;

        System.out.println(inches + " inches is equal to:");
        System.out.println(millimeters + " millimeters");
        System.out.println(centimeters + " centimeters");
        System.out.println(meters + " meters");
        System.out.println(kilometers + " kilometers");
        System.out.println(feet + " feet");
        System.out.println(miles + " miles");

        scanner.close();

    }
}
