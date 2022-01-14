public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("MinFloat = "+myMinFloatValue);
        System.out.println("MaxFloat = "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("MinDouble = "+myMinDoubleValue);
        System.out.println("MaxDouble = "+myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleFloatValue = 5.00 / 3d;

        System.out.println("myInt = "+myIntValue);
        System.out.println("myFloat = "+myFloatValue);
        System.out.println("myDouble = "+myDoubleFloatValue);
    }
}
