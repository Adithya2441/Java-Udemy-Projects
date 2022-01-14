import java.util.*;
public class SpeedConverter {
    public static double milesPerHour;
    public double kilometersPerHour;

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        } else {
            milesPerHour = (kilometersPerHour / 1.609);
        }
        return Math.round((long)milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            System.out.println(milesPerHour);
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("KilometersPerHour = ");
        double kilometersPerHour = i.nextDouble();
        printConversion(kilometersPerHour);
    }
}