package exercises.ch2datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven:");
        double milesDriven = input.nextDouble();
        System.out.println("Enter the amount of gas consumed:");
        double gasConsumed= input.nextDouble();
        double milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Your miles-per-gallon is: " + milesPerGallon);
    }
}
