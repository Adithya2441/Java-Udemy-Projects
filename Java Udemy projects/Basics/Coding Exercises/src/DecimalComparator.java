
import java.util.Scanner;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one=(int)(one*1000);
        two=(int)(two*1000);
        System.out.println(one +"   "+ two);
        if (one == two) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    public static void main(String[] args) {
        double one, two;

        Scanner i = new Scanner(System.in);
        one = i.nextDouble();
        two = i.nextDouble();
        areEqualByThreeDecimalPlaces(one, two);
    }
}